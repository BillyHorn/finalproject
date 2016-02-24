angular.module('zooApp', ['ui.router']);

angular.module('zooApp').run(($rootScope) => {
	  $rootScope.$on("$stateChangeError", console.log.bind(console));
	});