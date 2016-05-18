/**
 * Created by xiuli on 11/19/15.
 */
/**
 * Created by xiuli on 11/13/15.
 */
/*
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
'use strict';

angular.module('zeppelinWebApp')
    .controller('PermissionCtrl', function ($scope, baseUrlSrv, $location, $http) {
        var permissions =  [
                {
                    folder:'CITIES',
                    right:[
                        {
                            ID: 1,
                            name: 'Group 1',
                            permit: 'rws'
                        },
                        {
                            ID: 2,
                            name: 'Group 2',
                            permit: 'rws'
                        }
                    ]
                },
                {
                    folder:'/CITIES/Sonderborg',
                    right:[
                        {
                            ID: 1,
                            name: 'Group 1',
                            permit: 'rws'
                        }
                    ]
                },
                {
                    folder:'/CITIES/Sonderborg/heating',
                    right:[
                        {
                            ID: 1,
                            name: 'Group 1',
                            permit: 'rws'
                        },
                        {
                            ID: 2,
                            name: 'Group 2',
                            permit: 'rws'
                        },
                        {
                            ID: 3,
                            name: 'Group 3',
                            permit: 'rw'
                        }
                    ]
                }
            ];

        $scope.permit=permissions;
    });