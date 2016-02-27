angular.module('zooApp').controller('foodController', ['$scope', '$state', '$http', 'getFoodService', function($scope, $state, $http, getFoodService){

	$scope.foodList = []
	$http.get('/foods').then(function(data){
		$scope.foodList = data.data;
	});
	
	$scope.prepFood = function(id){
		getFoodService.setFood(id)
		$state.go("editFood");
	};
	
	$scope.removeFood = function(id){
		$http.delete('/food/'+id).then(function(data){
			$state.reload();
		});
	};

}]);