var myapp = angular.module('myapp', []);

myapp.directive('telInput', function(){
	return {
		require: 'ngModel',
		link: function(scope, element, attrs, model){
			//view -> model
			
			//model -> view
			model.$render = function(){
				
			};
			element.intlTelInput();
		}
	}
});

function AppCtrl(scope){
	
};
