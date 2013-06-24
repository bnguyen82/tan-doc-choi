angular.module('phoneDirectives', [])
.directive("hello", function(){
	return {
		restrict: "E",
		template: "<div>Good Morning</div>"
	}
})