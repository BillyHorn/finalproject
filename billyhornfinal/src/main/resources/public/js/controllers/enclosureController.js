angular.module('zooApp').controller('enclosureController', ['$scope', '$state', '$http', 'getEnclosureService', function($scope, $state, $http, getEnclosureService){

	$scope.enclosureList = []
	$http.get('/enclosures').then(function(data){
		$scope.enclosureList = data.data;
	});
	
	$scope.prepEnclosure = function(id){
		getEnclosureService.setEnclosure(id)
		$state.go("editEnclosure");
	};
	
	$scope.removeEnclosure = function(id){
		$http.delete('/enclosure/'+id).then(function(data){
			$state.reload();
		});
	};

}]);