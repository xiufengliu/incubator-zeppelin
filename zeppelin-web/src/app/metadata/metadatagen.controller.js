/**
 * Created by xiuli on 11/17/15.
 */

'use strict';

angular.module('zeppelinWebApp')
    .controller('MetadataCtrl', function($scope, $http, $location, baseUrlSrv) {
        var optionValues = {};
        optionValues.descriptionType = ['Abstract', 'Methods', 'SeriesInformation', 'TableOfContents', 'Other'];
        optionValues.relatedIdentifierType = ['ARK', 'arXiv', 'bibcode', 'DOI', 'EAN13', 'EISSN', 'Handle', 'ISBN', 'ISSN', 'ISTC', 'LISSN', 'LSID', 'PMID', 'PURL', 'UPC', 'URL', 'URN'];
        optionValues.relationType = ['IsCitedBy', 'Cites', 'IsSupplementTo', 'IsSupplementedBy', 'IsContinuedBy', 'Continues', 'IsNewVersionOf', 'IsPreviousVersionOf', 'IsPartOf', 'HasPart', 'IsReferencedBy', 'References', 'IsDocumentedBy', 'Documents', 'IsCompiledBy', 'Compiles', 'IsVariantFormOf', 'IsOriginalFormOf', 'IsIdenticalTo', 'HasMetadata', 'IsMetadataFor', 'Reviews', 'IsReviewedBy', 'IsDerivedFrom', 'IsSourceOf'];
        optionValues.resourceTypeGeneral = ['Audiovisual', 'Collection', 'Dataset', 'Event', 'Image', 'InteractiveResource', 'Model', 'PhysicalObject', 'Service', 'Software', 'Sound', 'Text', 'Workflow', 'Other'];
        optionValues.dateType = ['Accepted', 'Available', 'Copyrighted', 'Collected', 'Created', 'Issued', 'Submitted', 'Updated', 'Valid'];
        optionValues.contributorType = ['ContactPerson', 'DataCollector', 'DataCurator', 'DataManager', 'Distributor', 'Editor', 'Funder', 'HostingInstitution', 'Other', 'Producer', 'ProjectLeader', 'ProjectManager', 'ProjectMember', 'RegistrationAgency', 'RegistrationAuthority', 'RelatedPerson', 'Researcher', 'ResearchGroup', 'RightsHolder', 'Sponsor', 'Supervisor', 'WorkPackageLeader'];
        optionValues.titleType = ['AlternativeTitle', 'Subtitle', 'TranslatedTitle'];

        var init = function(){
            $scope.showResult = false;
            $scope.recommended = false;
            $scope.others = false;
            $scope.metadata = {};
            $scope.metadata.titles = {};
            $scope.metadata.titles.title = [{titleType:'',value:''}];
            //$scope.metadata.titles.title = [];
            $scope.metadata.creators = {};
            $scope.metadata.creators.creator = [
                {
                    creatorName: '',
                    nameIdentifier: {
                        nameIdentifierScheme: '',
                        schemeURI: '',
                        value: ''
                    },
                    affiliation: ''
                }
            ];
        };
        init();


        $scope.submit = function() {
            console.log($scope.metadata);
            $http({
                url: baseUrlSrv.getRestApiBase() + '/metadata/save',
                method: 'POST',
                data: {'resource':$scope.metadata}
            }).then(function(response) {
                //$location.path('/metadata' );
                $scope.showResult = true;
                $scope.xml = response.data.body;
            }, function(error) {
                $scope.submitted = false;
            });
        };

        $scope.postToDataCite = function() {
            $http({
      //          endpoint = 'https://mds.datacite.org/metadata'

                url: 'https://mds.test.datacite.org/metadata',
                method: 'POST',
                data: $scope.xml
            }).then(function(response) {
                //$location.path('/metadata' );
                console.log(response.message);
            }, function(error) {

            });
        };


        $scope.add = function(field) {
            field.push({});
        };

        $scope.remove = function(field) {
            var lastItem = field.length-1;
            field.splice(lastItem);
        };
    }
);