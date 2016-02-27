angular.module('zooApp').controller('editFoodController', ['$scope', '$state', '$http', 'getFoodService', function($scope, $state, $http, getFoodService){
	
	$scope.foodToView = {};
	
	$scope.foodId = getFoodService.curFood;
	if($scope.foodId == 0)
	{
	  //If the page was refreshed and we lost the reportId, (it will default back to 0)
	  //then go back a page.
	  //This should also have the side benefit of recalling the various stored info
	  //on the previous page.
	  history.go(-1);
	}
	else{
	  getFoodService.getById($scope.foodId).then(

		  function(success){
				  $scope.foodToView = success.data;
				  return success.data;
			  },function(error){

				  console.log(error);
			  });
	}		
	
	$scope.sendFood=function(success)
	{ 
		var userData = JSON.stringify({
			foodId:$scope.foodId,
    		foodName:foodName.value,
            vendor:vendor.value,
    		category:category.value
        })
		$http.put("/food/"+$scope.foodId, userData).then(function(data){
			console.log(data);
			$state.go("food");
		});
	};	
}]);