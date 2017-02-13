'use strict';

angular.module('myApp.view3', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view3', {
    templateUrl: 'view3/view3.html',
    controller: 'ControladorListado'
  });
}])

.controller('ControladorListado', ['$rootScope', '$scope', 'personById','$http','$resource', '$location', function ($rootScope, $scope, personById, $http, $resource, $location) {
        console.info($rootScope.nameP);
        personById.get({name:"ale"})
            .$promise.then(function(personR) {
              var person = personR;
              console.info("Se encontro! "+ person);
            },
              //error
              function(error){
                  console.info("error");
              });

}]);
