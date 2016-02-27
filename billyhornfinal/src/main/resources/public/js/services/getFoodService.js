angular.module("zooApp").service("getFoodService", ["$http", function($http){
	
	//returns food information
	return {
	  curFood: 0,
	  getById: function(id){ return $http.get('/food/'+id)},
	  setFood: function(id) {this.curFood = id;}
	  };
}]);