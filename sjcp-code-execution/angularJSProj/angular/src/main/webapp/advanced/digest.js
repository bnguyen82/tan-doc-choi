var myapp = angular.module('myapp', []);
function MainCtrl($scope){
	$scope.message = "Hello World";
	$scope.showFlag = true;
	
//	setTimeout(function() {
//		$scope.message = "Called";
//	}, 1000);
	
	//Call apply of angular to explicitly bind value change in timeout
	setTimeout(function() {
		$scope.$apply(function() {
			$scope.message = "Called";
		});
	}, 1000);
	
	
	$scope.show = function() {
		$scope.showFlag = !$scope.showFlag;
	};
	
	//This method is called automatically each time showFlag is changed
	//because it's a model and then watched by Angular
	$scope.isShow = function() {
		return $scope.showFlag;
	};
}