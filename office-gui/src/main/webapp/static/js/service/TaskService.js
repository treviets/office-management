/*
 * Office Management
 * Service for Task Management
 */
office.factory('TaskService', function($http, $rootScope) {

	return {
		
		getAllOfTasks: function($scope) {
			
			var url = $rootScope.makeGetURL("/task/");
			
			$http.get(url).then(function(response) {
				
				if (response.data) {
					$scope.data = angular.fromJson(response.data);
				}
				$scope.$broadcast('getAllOfTasksAlready');
			});

			return true;
		}
	}
});