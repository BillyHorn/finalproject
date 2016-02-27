angular.module('zooApp').controller('editEnclosureController', ['$scope', '$state', '$http', 'getEnclosureService', function($scope, $state, $http, getEnclosureService){
	
	$scope.animalList = [];
	//gets a list of all animals
	$http.get('/animals').then(function(data){
		$scope.animalList = data.data;
	});
	
	$scope.enclosureToView = {};
	
	$scope.enclosureId = getEnclosureService.curEnclosure;
	if($scope.enclosureId == 0)
	{
	  //If the page was refreshed and we lost the reportId, (it will default back to 0)
	  //then go back a page.
	  //This should also have the side benefit of recalling the various stored info
	  //on the previous page.
	  history.go(-1);
	}
	else{
	  getEnclosureService.getById($scope.enclosureId).then(
		  function(success){
				  $scope.enclosureToView = success.data;
				  return success.data;
			  },function(error){

				  console.log(error);
			  });
	}		
	
	$scope.sendEnclosure=function(success)
	{ 
		var userData = JSON.stringify({
			enclosureId:$scope.enclosureId,
    		enclosureName:enclosureName.value,
            animalAmount:animalAmount.value,
            feedingTime:feedingTime.value,
            condition:condition.value,
            animalId:{"animalId":animal.value}
        })
		$http.put("/enclosure/"+$scope.enclosureId, userData).then(function(data){
			console.log(data);
			$state.go("enclosure");
		});
	};	
	
}]);