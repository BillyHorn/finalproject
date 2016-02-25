angular.module('zooApp').controller('enclosureController', ['$scope', '$state', '$http', function($scope, $state, $http){

	$scope.enclosureList = []
	$http.get('/enclosures').then(function(data){
		console.log($scope.enclosureList);
		$scope.enclosureList = data.data;
		console.log($scope.enclosureList);
	});

}])