angular.module('zooApp').controller('newAnimalController', ['$scope', '$state', '$http', function($scope, $state, $http){

	$scope.foodList = [];
	//gets a list of all foods
	$http.get('/foods').then(function(data){
		$scope.foodList = data.data;
	});
	
	$scope.sendAnimal = function() {
		$scope.worked = false;
		$scope.error = false;
		console.log("test");
        var userData = JSON.stringify({
        		commonName:commonName.value,
                scientificName:scientificName.value,
                foodId:{"foodId":food.value},
        		//foodId:parseInt(food.value),
        		infoLink:infoLink.value
            })
            console.log(userData);
            $http.post("/animal", userData).
            success(function(data, status, headers, config){
            	$state.go("animal");
            	$scope.worked = true;
            }).
            error(function(data, status, headers, config){
            	$scope.error = true;
            });
    };
}]);