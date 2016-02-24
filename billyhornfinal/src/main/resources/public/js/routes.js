'use strict';
//angular routing information
angular.module('zooApp').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

	$urlRouterProvider.otherwise('/');

	$stateProvider
		.state("enclosure", {
			url: '/enclosure',
			templateUrl: 'templates/enclosure.html',
			controller: 'enclosureController'
		})
		.state("home", {
			url: '/home',
			templateUrl: 'templates/home.html',
			controller: 'homeController'
		})
}]);

