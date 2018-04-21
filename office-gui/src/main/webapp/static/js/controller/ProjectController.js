office.controller('ProjectController', ['$rootScope', '$scope', 'ProjectService', 
								function($rootScope, $scope, ProjectService) {
	
	// Initialize data for Article page
	$scope.initializeProjectPage = function() {
		ProjectService.getAllOfProjects($scope);
	}
	
	// When all of article have got already
	$scope.$on('getAllOfProjectsAlready', function() {
		if ($scope.data) {
			$scope.projects = $scope.data.result.task;
		}
	});
	
	
	
	
	
}])