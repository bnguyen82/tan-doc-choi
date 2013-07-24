    var myapp = angular.module('myapp', ["ui.state"])
    myapp.config(function($stateProvider, $urlRouterProvider){
      
      // For any unmatched url, send to /route1
      $urlRouterProvider.otherwise("/home")
      
      $stateProvider
        .state('route1', {
            url: "/route1",
            templateUrl: "routing/route1.html"
        })
	      .state('route1.list', {
	          url: "/list",
	          templateUrl: "routing/route1-list.html",
	          controller: function($scope){
	            $scope.items = ["A", "List", "Of", "Items"];
	          }
	      })
          
        .state('route2', {
            url: "/route2",
            templateUrl: "routing/route2.html"
        })
          .state('route2.list', {
              url: "/list",
              templateUrl: "routing/route2-list.html",
              controller: function($scope){
                $scope.things = ["A", "Set", "Of", "Things"];
              }
          })
        .state('home', {
            url: "/home",
            template: "Hello World!",
            controller: function(){
        		console.log("Enter Home Controller");
        	}
        
        })
    })