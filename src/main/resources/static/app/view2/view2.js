'use strict';

angular.module('myApp.view2', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view2', {
    templateUrl: 'view2/view2.html',
    controller: 'View2Ctrl'
  });
}])

.controller('View2Ctrl', ['$rootScope', '$scope', 'allPersons','$http','$resource', '$location', function ($rootScope, $scope, allPersons, $http, $resource, $location) {
        $scope.name=null;
        $scope.lastName=null;
        $scope.address=null;
        $scope.zip=null;
        $scope.city=null;
        $rootScope.nameP=null;

        $scope.savePerson= function(){
            $rootScope.nameP=$scope.firstName;
            $rootScope.person={"name":$scope.lastName, "firstName":$scope.name, "address":{"street":$scope.address,"zip":$scope.zip,"city":$scope.city}};
            allPersons.save($scope.person,function(){
                console.info("Person saved   "+ $rootScope.person.name);
            });
            $location.path("view3");

        };

}]);