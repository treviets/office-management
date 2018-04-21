office.controller('CommonController',['$scope', '$rootScope', '$window', '$location',
								function($scope, $rootScope, $window, $location) {

	$scope.commonInit = function() {
		$rootScope.MAIN_DOMAIN = '/office-gui';
		$rootScope.CSRF_HEADER = $('meta[name="_csrf_header"]').attr('content');
		$rootScope.CSRF_TOKEN = $('meta[name="_csrf_token"]').attr('content');
	}
	
	
	$rootScope.makePostURL = function(path) {
		var fullPostURL = $rootScope.MAIN_DOMAIN + path + "?_csrf_header=" + $rootScope.CSRF_HEADER + "&_csrf=" + $rootScope.CSRF_TOKEN;
		return fullPostURL;
	}

	
	$rootScope.makeGetURL = function(path) {
		var fullGetURL = $rootScope.MAIN_DOMAIN + path;
		return fullGetURL;
	}

}]);




	

	