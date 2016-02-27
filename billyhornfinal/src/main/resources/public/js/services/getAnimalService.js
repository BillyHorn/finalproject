angular.module("zooApp").service("getAnimalService", ["$http", function($http){
	
	//returns animal information
	return {
	  curAnimal: 0,
	  getById: function(id){ return $http.get('/animal/'+id)},
	  setAnimal: function(id) {this.curAnimal = id;}
	  };
}]);