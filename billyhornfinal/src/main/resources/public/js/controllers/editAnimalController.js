angular.module('zooApp').controller('editAnimalController', ['$scope', '$state', '$http', 'getAnimalService', function($scope, $state, $http, getAnimalService){
	
	$scope.foodList = [];
	//gets a list of all foods
	$http.get('/foods').then(function(data){
		$scope.foodList = data.data;
	});
	
	$scope.animalToView = {};
	
	$scope.animalId = getAnimalService.curAnimal;
	if($scope.animalId == 0)
	{
	  //If the page was refreshed and we lost the reportId, (it will default back to 0)
	  //then go back a page.
	  //This should also have the side benefit of recalling the various stored info
	  //on the previous page.
	  history.go(-1);
	}
	else{
	  getAnimalService.getById($scope.animalId).then(
		  function(success){
				  $scope.animalToView = success.data;
				  console.log($scope.animalToView);
				  return success.data;
			  },function(error){

				  console.log(error);
			  });
	}		
	
	$scope.sendAnimal=function(success)
	{ 
		var userData = JSON.stringify({
			animalId:$scope.animalId,
    		commonName:commonName.value,
            scientificName:scientificName.value,
            foodId:{"foodId":food.value},
    		infoLink:infoLink.value
        })
		$http.put("/animal/"+$scope.animalId, userData).then(function(data){
			console.log(data);
			$state.go("animal");
		});
	};	
	
}]);