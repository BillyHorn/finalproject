angular.module('zooApp').controller('animalController', ['$scope', '$state', '$http', 'getAnimalService', function($scope, $state, $http, getAnimalService){

	$scope.animalList = []
	$http.get('/animals').then(function(data){
		$scope.animalList = data.data;
	});
	
	$scope.prepAnimal = function(id){
		getAnimalService.setAnimal(id)
		$state.go("editAnimal");
	};
	
	$scope.removeAnimal = function(id){
		$http.delete('/animal/'+id).then(function(data){
			$state.reload();
		});
	};

}]);