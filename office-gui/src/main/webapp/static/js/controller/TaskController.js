office.controller('TaskController', ['$rootScope', '$scope', 'TaskService', 
								function($rootScope, $scope, TaskService) {
	
	// Initialize data for Task page
	$scope.initTaskPage = function() {
		TaskService.getAllOfTasks($scope);
	}
	
	// When all of tasks have got already
	$scope.$on('getAllOfTasksAlready', function() {
		if ($scope.data) {
			$scope.tasks = $scope.data.result.task;
		}
	});
	
	
	
	
	
}])