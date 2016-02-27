angular.module("zooApp").service("getEnclosureService", ["$http", function($http){
	
	//returns enclosure information
	return {
	  curEnclosure: 0,
	  getById: function(id){ return $http.get('/enclosure/'+id)},
	  setEnclosure: function(id) {this.curEnclosure = id;}
	  };
}]);