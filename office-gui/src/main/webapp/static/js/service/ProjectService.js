/*
 * Office Management
 * Service for Article Management
 */
office.factory('ProjectService', function($http, $rootScope) {

	return {
		
		getAllOfProjects: function($scope) {
			
			var url = $rootScope.makeGetURL("/project/");
			
			$http.get(url).then(function(response) {
				
				if (response.data) {
					$scope.data = angular.fromJson(response.data);
				}
				$scope.$broadcast('getAllOfProjectsAlready');
			});

			return true;
		}
	}
});