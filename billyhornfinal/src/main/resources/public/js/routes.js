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
			url: '/food',
			params: {
				foodLoc: null
			},
			templateUrl: 'templates/food.html',
			controller: 'foodController'
		})
		.state("createFood", {
			url: '/createFood',
			templateUrl: 'templates/createFood.html',
			controller: 'newFoodController'
		})
		.state("editFood", {
			url: '/editFood',
			templateUrl: 'templates/editFood.html',
			controller: 'editFoodController'
		})
		.state("createAnimal", {
			url: '/createAnimal',
			templateUrl: 'templates/createAnimal.html',
			controller: 'newAnimalController'
		})
		.state("editAnimal", {
			url: '/editAnimal',
			templateUrl: 'templates/editAnimal.html',
			controller: 'editAnimalController'
		})
		.state("createEnclosure", {
			url: '/createEnclosure',
			templateUrl: 'templates/createEnclosure.html',
			controller: 'newEnclosureController'
		})
		.state("editEnclosure", {
			url: '/editEnclosure',
			templateUrl: 'templates/editEnclosure.html',
			controller: 'editEnclosureController'
		});
}]);
