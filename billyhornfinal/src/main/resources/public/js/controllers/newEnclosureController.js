angular.module('zooApp').controller('newEnclosureController', ['$scope', '$state', '$http', function($scope, $state, $http){

	$scope.animalList = [];
	//gets a list of all animals
	$http.get('/animals').then(function(data){
		$scope.animalList = data.data;
	});
	
	$scope.sendEnclosure = function() {
		$scope.worked = false;
		$scope.error = false;
		console.log("test");
        var userData = JSON.stringify({
        		enclosureName:enclosureName.value,
                animalAmount:animalAmount.value,
                feedingTime:feedingTime.value,
                condition:condition.value,
                animalId:{"animalId":animal.value}
            })
            console.log(userData);
            $http.post("/enclosure", userData).
            success(function(data, status, headers, config){
            	$state.go("enclosure");
            	$scope.worked = true;
            }).
            error(function(data, status, headers, config){
            	$scope.error = true;
            });
    };
}]);