/*
 * Office Management
 * Service for Task Management
 */
office.factory('SprintService', function($http, $rootScope) {

	return {
		
		getAllOfTasks: function($scope) {
			
			var url = $rootScope.makeGetURL("/sprint/");
			
			$http.get(url).then(function(response) {
				
				if (response.data) {
					$scope.data = angular.fromJson(response.data);
				}
				$scope.$broadcast('getAllOfSprintAlready');
			});

			return true;
		}
	
	
	
	
	}
});