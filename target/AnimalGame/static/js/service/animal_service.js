'use strict';

angular.module('myApp').factory('AnimalService', ['$http', '$q', function($http, $q){

    var REST_SERVICE_URI = 'http://localhost:8080/SpringAnimalAngular/animal/';

    var factory = {
        fetchAllAnimals: fetchAllAnimals,
        createAnimal: createAnimal,
        updateAnimal:updateAnimal,
        deleteAnimal:deleteAnimal
    };

    return factory;

    function fetchAllAnimals() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Animals');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    function createAnimal(animal) {
        var deferred = $q.defer();
        $http.post(REST_SERVICE_URI, animal)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while creating Animal');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }


    function updateAnimal(animal, id) {
        var deferred = $q.defer();
        $http.put(REST_SERVICE_URI+id, animal)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while updating Animal');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    function deleteAnimal(id) {
        var deferred = $q.defer();
        $http.delete(REST_SERVICE_URI+id)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while deleting Animal');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

}]);
