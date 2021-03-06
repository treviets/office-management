<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec" %>
<c:set var="contextPath" value="<%=getServletContext().getContextPath()%>" />

<!DOCTYPE html>

<html lang="en">
	<head>
	
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width">
		<title>Office Management System</title>

		<%@ include file="javascript-file.jsp" %>
		<%@ include file="css-file.jsp" %>
	</head>
	
	<body ng-app="office">
		<header class="header">
			<%@ include file="header.jsp" %>
		</header>
		
		<section>
			<dec:body />
		</section>
		
	
		<footer class="footer-distributed">
			<%@ include file="footer.jsp" %>
		</footer>
	</body>
</html>


