'use strict';
//angular routing information
angular.module('zooApp').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

	$urlRouterProvider.otherwise('/');

	$stateProvider
		.state("home", {
			url: '/home',
			templateUrl: 'templates/home.html',
		})
		.state("enclosure", {
			url: '/enclosure',
			templateUrl: 'templates/enclosure.html',
			controller: 'enclosureController'
		})
		.state("animal", {
			url: '/animal',
			templateUrl: 'templates/animal.html',
			controller: 'animalController'
		})
		.state("food", {
			url: 'food',
			templateUrl: 'templates/food.html',
			controller: 'foodController'
		});
}]);

