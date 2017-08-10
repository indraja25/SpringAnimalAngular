package com.animalgame.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.animalgame.dao.AnimalDAO;
import com.animalgame.model.AnimalModel;



@Controller
public class DisplayController {
	//private static final Logger logger = Logger.getLogger(DisplayController.class);
	private static final Logger logger = Logger.getLogger(DisplayController.class);
	@Autowired
	private AnimalDAO animalDao;
	
	//AbstractApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);
    //AnimalService animalService = (AnimalService) context.getBean("animalService");
	
	/*static{
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		ApplicationContext context =
	    		new ClassPathXmlApplicationContext("spring-module.xml");

	        AnimalDAO animalDAO = (AnimalDAO) context.getBean("animalDAO");
	       // System.out.println(animalDAO.getall().size());
	}
*/	
	/*@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("helloworld");
		//mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
*/	
	
	@RequestMapping("/")
	public ModelAndView showList(){
		ModelAndView mv = new ModelAndView("list");
		List<AnimalModel>list=animalDao.getall();
		mv.addObject("listAnimal", list);
	//logger.debug("getWelcome is executed!");
		System.out.println("Hiiiiiiiii");
		logger.debug("getWelcome is executed!");
		logger.info("getWelcome is executed!");
	
		
		//mv.addObject("animalList",animalService.getAll());
		//System.out.println(animalService.getAll().size()+"List size");
		return mv;
	}
	
	
	
	
	
	
	/*
	@RequestMapping(value = "/newAnimal", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		AnimalModel newAnimal = new AnimalModel();
		model.addObject("animal", newAnimal);
		model.setViewName("animalForm");
		return model;
	}
	
	@RequestMapping(value = "/saveAnimal", method = RequestMethod.POST)
	public ModelAndView saveContact(@ModelAttribute AnimalModel animal) {
		animalDao.insertAnimal(animal);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/deleteAnimal", method = RequestMethod.GET)
	public ModelAndView deleteContact(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		animalDao.delete(id);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/editContact", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		AnimalModel animal = animalDao.get(id);
		ModelAndView model = new ModelAndView("animalForm");
		model.addObject("contact", animal);
		
		return model;
	}
	*/
	
	
}
