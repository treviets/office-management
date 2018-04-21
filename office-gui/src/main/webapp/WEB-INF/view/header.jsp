<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="<%= getServletContext().getContextPath()%>" />

<nav class="header-page navbar navbar-inverse">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li><a href="#" target="_self">Dashboard</a></li>
      <li><a href="${contextPath}/project/" target="_self">Project</a></li>
      <li><a href="${contextPath}/task/" target="_self">Task</a></li>
      <li><a href="${contextPath}/hrm/" target="_self">Human Resource</a></li>
      <li><a href="${contextPath}/crm/" target="_self">Customer</a></li>
    </ul>
    <!-- <form class="navbar-form navbar-left" action="/action_page.php">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search" name="search">
      </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form> -->
  </div>
</nav>


