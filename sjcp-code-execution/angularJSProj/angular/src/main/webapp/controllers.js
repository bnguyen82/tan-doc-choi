angular.module('phonecat', ['phonecatFilters', 'phoneDirectives'])
.factory('phoneService',function($http){
	return new PhoneService($http);
});
	  
function PhoneListCtrl($scope, phoneService) {
//  $http.get("phones.json").success(function(data){
//    $scope.phones = data;
//  })
	phoneService.getJson(function(phones){
		$scope.phones = phones;
	});
  $scope.query='';
}
