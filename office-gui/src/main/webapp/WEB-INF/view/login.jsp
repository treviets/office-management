<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="<%=getServletContext().getContextPath()%>" />

<!DOCTYPE html>

<html lang="en">
	<head>
	
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width">
		<title>Office Management System</title>
		
		<link rel="stylesheet" href="${contextPath}/static/lib/bootstrap/css/bootstrap.min.css" />
		<link rel="stylesheet" href="${contextPath}/static/css/style.css" />
		
		<script src="${contextPath}/static/lib/bootstrap/js/jquery-1.10.2.js"></script>
		<script src="${contextPath}/static/lib/bootstrap/js/bootstrap.min.js"></script>
		<script src="${contextPath}/static/js/lib/angular.min.js"></script>
		<script src="${contextPath}/static/js/application.js"></script>
		<script src="${contextPath}/static/js/controller/CommonController.js"></script>
	
	</head>
	
	<body ng-app="office" ng-controller="CommonController" ng-init="commonInit();">
	
		  <div class="wrapper">
		  	<c:url var="loginUrl" value="/login"/>
		  	
    		<form class="form-signin" role="form" id="loginForm" method="post" action="${loginUrl}">       
      		
	      		<h2 class="form-signin-heading">Please login</h2>
			  
			      <input type="text" class="form-control" name="username" placeholder="Email Address"/>
			      
			      <input type="password" class="form-control" name="password" placeholder="Password"/>      
			   
			      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
			      
		    </form>
  		</div>
	</body>
</html>


