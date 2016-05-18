/**
 * Created by xiuli on 11/13/15.
 */
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
    .controller('RegisterCtrl', function ($scope, baseUrlSrv, $location, $http) {

        $scope.submitted = false;
        $scope.submit = function() {
            console.log($scope.data);
            $http({
                url: baseUrlSrv.getRestApiBase() + '/user/register',
                method: 'POST',
                data: $scope.data
            }).then(function(response) {
                $location.path('/registercompleted' );
            }, function(error) {
                $scope.submitted = false;
            });
        };

        $scope.interacted = function(field) {
            return $scope.submitted || field.$dirty;
        };

    })
    .directive('usernameAvailableValidator',
        ['$http','baseUrlSrv', function($http, baseUrlSrv) {
            return {
                require : 'ngModel',
                link : function($scope, element, attrs, ngModel) {
                    ngModel.$parsers.push(function(username) {
                        ngModel.$setValidity('username-record-taken', true);
                        ngModel.$setValidity('username-record-loading', false);
                        $http.get(baseUrlSrv.getRestApiBase() + '/user/username/'+ username).success(
                            function(response) {
                                ngModel.$setValidity('username-record-taken', response.body);
                                ngModel.$setValidity('username-record-loading', true);
                            }
                        );
                        return username;
                    });
                }
            };
    }])
    .directive('emailAvailableValidator',
    ['$http', 'baseUrlSrv', function($http, baseUrlSrv) {
        return {
            require : 'ngModel',
            link : function($scope, element, attrs, ngModel) {
                ngModel.$parsers.push(function(email) {
                    ngModel.$setValidity('email-record-taken', true); // will show when false
                    ngModel.$setValidity('email-record-loading', false);
                    $http.get(baseUrlSrv.getRestApiBase() + '/user/email/'+ email).success(
                        function(response) {
                            ngModel.$setValidity('email-record-taken', response.body);
                            ngModel.$setValidity('email-record-loading', true);
                        }
                    );
                    return email;
                });
            }
        };
    }])
    .directive('matchValidator', function() {
        return {
            require: 'ngModel',
            link : function(scope, element, attrs, ngModel) {
                ngModel.$parsers.push(function(value) {
                    ngModel.$setValidity('match', value === scope.$eval(attrs.matchValidator));
                    return value;
                });
            }
        };
    })
    .directive('passwordCharactersValidator', function() {
        var PASSWORD_FORMATS = [
            /[^\w\s]+/, //special characters
            /[A-Z]+/, //uppercase letters
            /\w+/, //other letters
            /\d+/, //numbers
            /^\S+$/   //no whitespace allowed
        ];

        return {
            require: 'ngModel',
            link : function(scope, element, attrs, ngModel) {
                ngModel.$parsers.push(function(value) {
                    var status = true;
                    angular.forEach(PASSWORD_FORMATS, function(regex) {
                        status = status && regex.test(value);
                    });
                    ngModel.$setValidity('password-characters', status);
                    return value;
                });
            }
        };
    })
    .directive('showIfValid', function() {
        return {
            require: 'ngModel',
            link : function(scope, element, attrs, ngModel) {
                ngModel.$parsers.push(function(value) {
                    ngModel.$setValidity('match', value === scope.$eval(attrs.matchValidator));
                    return value;
                });
            }
        };
    });