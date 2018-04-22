<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="<%= getServletContext().getContextPath()%>" />

<c:url var="sprintDetailUrl" value="/sprint/detail/"/>

<div class="sprint-detail col-md-12">
			<table class="table">
				  <tr>
				    <th>Task Name</th>
				    <th>Status</th>
				    <th>Responsible</th>
				    <th>Working time</th>
				  </tr>
				  <tr class="success">
				    <td>Task 1</td>
				    <td>To Do</td>
				    <td>Nguyen Vu Nhan</td>
				    <td>8h</td>
				  </tr>
				  <tr class="danger">
				    <td>Task 1</td>
				    <td>To Do</td>
				    <td>Nguyen Vu Nhan</td>
				    <td>8h</td>
				  </tr>
				  <tr class="warning">
				    <td>Task 1</td>
				    <td>To Do</td>
				    <td>Nguyen Vu Nhan</td>
				    <td>8h</td>
				  </tr>
				  <tr class="active">
				    <td>Task 1</td>
				    <td>To Do</td>
				    <td>Nguyen Vu Nhan</td>
				    <td>8h</td>
				  </tr>
				
				</table>

				<div class="sprint-drap-drop">

					<div class="to-do">
						<p class="text-center">To do</p>
					</div>

					<div class="in-progress">
						<p class="text-center">In Progress</p>
					</div>

					<div class="done">
						<p class="text-center">Done</p>
					</div>

					<div class="compeleted">
						<p class="text-center">Completed</p>
					</div>
				</div>

			</div>