/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
'use strict';

angular.module('zeppelinWebApp')
  .controller('LoginCtrl', function($scope, $http, $location, $window,  baseUrlSrv, store) {
  $scope.user = {};

  $scope.showErrorMessage = false;
  $scope.login = function() {
    $http({
      url: baseUrlSrv.getRestApiBase() + '/login',
      method: 'POST',
      data: $scope.user
    }).then(function(response) {
      store.set('jwt', response.data.body.token);
      store.set('user', response.data.body.user);
      $location.path( '/home' );
    }, function(error) {
      $scope.showErrorMessage = true;
    });
  };

  $scope.hideError = function(){
      $scope.showErrorMessage=false;
  };

});
