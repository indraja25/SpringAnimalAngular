'use strict';

angular.module('myApp').controller('AnimalController', ['$scope', 'AnimalService', function($scope, AnimalService) {
    var self = this;
    self.animal={id:null,type:'',health:''};
    self.animals=[];

    self.submit = submit;
    self.edit = edit;
    self.remove = remove;
    self.reset = reset;


    fetchAllAnimals();

    function fetchAllAnimals(){
        AnimalService.fetchAllAnimals()
            .then(
            function(d) {
                self.animals = d;
            },
            function(errResponse){
                console.error('Error while fetching Animals');
            }
        );
    }

    function createAnimal(animal){
        AnimalService.createAnimal(animal)
            .then(
            fetchAllAnimals,
            function(errResponse){
                console.error('Error while creating Animal');
            }
        );
    }

    function updateAnimal(animal, id){
        AnimalService.updateAnimal(animal, id)
            .then(
            fetchAllAnimals,
            function(errResponse){
                console.error('Error while updating animal');
            }
        );
    }

    function deleteAnimal(id){
        AnimalService.deleteAnimal(id)
            .then(
            fetchAllAnimals,
            function(errResponse){
                console.error('Error while deleting animal');
            }
        );
    }

    function submit() {
    	console.log("Hiiiii Angular Controller");
        if(self.animal.id===null){
            console.log('Saving New animal', self.animal);
            createAnimal(self.animal);
        }else{
            updateAnimal(self.animal, self.animal.id);
            console.log('animal updated with id ', self.animal.id);
        }
        reset();
    }

    function edit(id){
        console.log('id to be edited', id);
        for(var i = 0; i < self.animals.length; i++){
            if(self.animals[i].id === id) {
                self.animal = angular.copy(self.animals[i]);
                break;
            }
        }
    }

    function remove(id){
        console.log('id to be deleted', id);
        if(self.animal.id === id) {//clean form if the animal to be deleted is shown there.
            reset();
        }
        deleteanimal(id);
    }


    function reset(){
        self.animal={id:null,animalname:'',address:'',email:''};
        $scope.myForm.$setPristine(); //reset Form
    }

}]);
