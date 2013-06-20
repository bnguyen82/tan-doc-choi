angular.module('phonecat', [])
.factory('phoneService',function($http){
	return new PhoneService($http);
});

function PhoneService($http){
   this.http = $http;
   this.getJson = function(fnSuccess){
	   var self = this;
	   $http.get("phones.json").success(function(data){
		    fnSuccess.call(self, data);
	  });
   };
}
	  
function PhoneListCtrl($scope, phoneService) {
//  $http.get("phones.json").success(function(data){
//    $scope.phones = data;
//  })
	phoneService.getJson(function(phones){
		$scope.phones = phones;
	});
  $scope.query='';
}
