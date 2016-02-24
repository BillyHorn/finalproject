angular.module('zooApp').controller('enclosureController', ['$scope', '$state', '$http', function($scope, $state, $http){
	
	$scope.enclosureList = [];
	console.log("test");
	$http({
		method: 'GET',
		url: '/enclosures'
	}).then(function(response){
		console.log(response);
	});
}]);