var app = angular.module('app', ['ui.state']);
app.config(function($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/home')
    $stateProvider.
          state('users', 
              {url: "/users", 
        	  templateUrl: "user-list.html",   
        	  controller: UserListController})
          .state('users.edit',
              {url: "/edit", 
        	  templateUrl: "user-edit.html", 
        	  controller: UserEditController})
          .state('users.add',
              {url: '/add', 
        	  templateUrl: 'user-add.html', 
        	  controller: UserAddController})
          .state('home', {
			url: "/home",
			template: "Hello World!",
			controller: function(){
				console.log("Enter Home Controller");
			}
    
    })
});
function MainCtrl(){
	
}

function UserListController($scope, $state){
	$scope.userList = [{
		uid: "1",
		name: "Bao"
	},
	{
		uid: "2",
		name: "Ha"
	}];
};

function UserEditController($scope, $stateParams){
	$scope.user = {uid: $stateParams.userId, name: "Bao1"};
}
function UserAddController($scope, $stateParams){
}