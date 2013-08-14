angular.module('myapp', [])
.directive('telInput', function(){
	return {
		require: '?ngModel',
		link: function(scope, element, attrs, model){
			//view -> model
			
			//model -> view
			model.$render = function(){
				element.innerText(model.$viewValue);
			};
			element.intlTelInput();
		}
	};
});

function AppCtrl($scope){
	$scope.number = "+84 3333222";
	console.log("Hello");
};
