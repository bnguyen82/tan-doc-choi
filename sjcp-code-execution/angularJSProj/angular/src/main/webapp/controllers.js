angular.module('phonecat', ['phonecatFilters', 'phoneDirectives', 'HttpService'])
.config(function($httpProvider){
	$httpProvider.responseInterceptors.push('httpInterceptor');
	var spinner = function(data, headersGetter){
		var statusBar = $('#statusBar');
		statusBar.text("Loading ...");
		statusBar.show();
		return data;
	}
	var checker = function(data, headersGetter){
		var statusBar = $('#statusBar');
		statusBar.text("Loaded");
		statusBar.show();
		data.checker="Checker Added";
		return data;
	}
	$httpProvider.defaults.transformRequest.push(spinner);
	$httpProvider.defaults.transformResponse.push(checker);
})
.factory('phoneService',function($http){
	return new PhoneService($http);
})

	  
function PhoneListCtrl($scope, $location) {
	phoneService.getJson(function(phones){
		$scope.phones = phones;
	});
	$scope.query='';
	$scope.gotoURL = function(url){
		$location.path(url);
	};
	$scope.service = phoneService;
}
PhoneListCtrl.$inject = ['phoneService'];