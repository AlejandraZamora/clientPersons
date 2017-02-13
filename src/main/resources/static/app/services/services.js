'use strict';
angular.module('services.personFactory', ['ngRoute','ngResource'])
    .factory('personById', function($resource) {
        return $resource('/persons/:name',{id:"@_name"},
        { get: { method: 'GET', isArray: true}});
    })
    .factory('allPersons', function($resource) {
        return $resource('/persons');
    });


