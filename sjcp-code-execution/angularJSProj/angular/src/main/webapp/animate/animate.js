angular.module('app', [])
    .config(['$routeProvider', function ($routeProvider) {
    $routeProvider.
    when('/view1', {
        template: '<div> VIEW 1 </div>',
        controller: HomeCtrl
    }).
    when('/view2', {
        template: '<div> VIEW 2 </div>',
        controller: ListCtrl
    }).
    when('/view3', {
        template: '<div> VIEW 3 </div>',
        controller: MooCtrl
    }).
    otherwise({
        redirectTo: '/view1'
    });
}]);

angular.module('app')
    .controller('AnimateController', function ($scope) {
    $scope.animations = ['view', 'slide', 'fade', 'wave'];
    $scope.animation = 'view';
   
});
/* Controllers */

function HomeCtrl() {}

function ListCtrl() {}

function MooCtrl() {}