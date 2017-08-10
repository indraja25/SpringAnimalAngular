package com.animalgame.controllers;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.animalgame.dao.AnimalDAO;
import com.animalgame.model.AnimalModel;
 
@RestController
public class SpringAnimalRestController {
 
    @Autowired
    AnimalDAO animalDao;  //Service which will do all data retrieval/manipulation work
 
    
    //-------------------Retrieve All AnimalModels--------------------------------------------------------
     
    @RequestMapping(value = "/animal/", method = RequestMethod.GET)
    public ResponseEntity<List<AnimalModel>> listAllAnimalModels() {
        List<AnimalModel> users = animalDao.getall();
        if(users.isEmpty()){
            return new ResponseEntity<List<AnimalModel>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<AnimalModel>>(users, HttpStatus.OK);
    }
 
 
    
    //-------------------Retrieve Single AnimalModel--------------------------------------------------------
     
    @RequestMapping(value = "/animal/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AnimalModel> getAnimalModel(@PathVariable("id") int id) {
        System.out.println("Fetching AnimalModel with id " + id);
        AnimalModel animal = animalDao.get(id);
        if (animal == null) {
            System.out.println("AnimalModel with id " + id + " not found");
            return new ResponseEntity<AnimalModel>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<AnimalModel>(animal, HttpStatus.OK);
    }
 
     
     
    //-------------------Create a AnimalModel--------------------------------------------------------
     
    @RequestMapping(value = "/animal/", method = RequestMethod.POST)
    public ResponseEntity<Void> createAnimalModel(@RequestBody AnimalModel animal,    UriComponentsBuilder ucBuilder) {
       
 
        animalDao.insertAnimal(animal);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(animal.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
 
    
     
    //------------------- Update a AnimalModel --------------------------------------------------------
     
    @RequestMapping(value = "/animal/{id}", method = RequestMethod.PUT)
    public ResponseEntity<AnimalModel> updateAnimalModel(@PathVariable("id") int id, @RequestBody AnimalModel animal) {
        System.out.println("Updating AnimalModel " + id);
         
        AnimalModel currentAnimalModel = animalDao.get(id);
         
        if (currentAnimalModel==null) {
            System.out.println("AnimalModel with id " + id + " not found");
            return new ResponseEntity<AnimalModel>(HttpStatus.NOT_FOUND);
        }
 
        currentAnimalModel.setType(animal.getType());
        currentAnimalModel.setHealth(animal.getHealth());
        
         
        animalDao.insertAnimal(currentAnimalModel);
        return new ResponseEntity<AnimalModel>(currentAnimalModel, HttpStatus.OK);
    }
 
    
    
    //------------------- Delete a AnimalModel --------------------------------------------------------
     
    @RequestMapping(value = "/animal/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<AnimalModel> deleteAnimalModel(@PathVariable("id") int id) {
        System.out.println("Fetching & Deleting AnimalModel with id " + id);
 
        AnimalModel user = animalDao.get(id);
        if (user == null) {
            System.out.println("Unable to delete. AnimalModel with id " + id + " not found");
            return new ResponseEntity<AnimalModel>(HttpStatus.NOT_FOUND);
        }
 
        animalDao.delete(id);
        return new ResponseEntity<AnimalModel>(HttpStatus.NO_CONTENT);
    }
 
     
    
    
}