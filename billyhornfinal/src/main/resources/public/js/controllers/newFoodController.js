angular.module('zooApp').controller('newFoodController', ['$scope', '$state', '$http', function($scope, $state, $http){

	$scope.sendFood = function() {
		$scope.worked = false;
		$scope.error = false;
		console.log("test");
        var userData = JSON.stringify({
        		foodName:foodName.value,
                vendor:vendor.value,
        		category:category.value
            })
            console.log(userData);
            $http.post("/food", userData).
            success(function(data, status, headers, config){
            	$state.go("food");
            	$scope.worked = true;
            }).
            error(function(data, status, headers, config){
            	$scope.error = true;
            });
    };
}]);