office.controller('SprintController', ['$rootScope', '$scope', 'SprintService', 
								function($rootScope, $scope, SprintService) {
	
	 $scope.models = {
		        selected: null,
		        lists: {
		        	"A": [], 
		        	"B": [],
		        	"C": [],
		        	"D": []
		        }
		    };

    // Generate initial model
    for (var i = 1; i <= 3; ++i) {
        $scope.models.lists.A.push({label: "Item A" + i});
        $scope.models.lists.B.push({label: "Item B" + i});
        $scope.models.lists.C.push({label: "Item C" + i});
        $scope.models.lists.D.push({label: "Item D" + i});
    }

    // Model to JSON for demo purpose
    $scope.$watch('models', function(model) {
        $scope.modelAsJson = angular.toJson(model, true);
    }, true);

	
}])