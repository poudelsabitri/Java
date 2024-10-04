<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Learning</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	</head>
	<body>
		<div class="container"> <!--container is for boundary of my page  -->
			<nav class="navbar navbar-expand-lg navbar-light bg-dark">
				<ul class="navbar-nav">
					<li class="nav-items"><a href="/www.google.com">googleLink</a></li>
					<li class="nav-items"><a href="/www.google.com">Home</a></li>
				</ul>
			</nav>
			<div class="text-center"><h1>I am using h1</h1></div>
			<h2>I am using h2</h2>
			<h3>I am using h3</h3>
			<h4>I am using h4</h4>
			<h5>I am using h5</h5>
			<h6>I am using h6</h6>
			<img alt="" src="img/school.jpg">
			
			<!-- Buttons -->
			<!-- <button>Button1</button> -->
			<a href=studentsDetail><button type="button" class="btn btn-primary">GetALL</button></a>
			<a href="createNewStudent"><button type="button" class="btn btn-secondary">Create</button></a>
			<a href="updateStudent"><button type="button" class="btn btn-success">Update</button></a>
			<!--<a href="studentsDetail"><button type="button" class="btn btn-warning">Button1</button></a> -->
			<a href="deleteStudent"><button type="button" class="btn btn-danger">Delete</button></a>
			
			<!--Alerts-->
			<div class="alert alert-success">My message</div>
			<div class="alert alert-warning">My message</div>
			<div class="alert alert-danger">My message</div>
			
			<!-- Table -->
			<table class="table table-bordered table-striped table-hover">
				<thead class="thead-dark">
					<th scope="col">Name</th>
				    <th scope="col">AGe</th>
				    <th scope="col">Address</th>
				</thead>
				<tbody>
					<tr>
						<td>Jack</td>
						<td>23</td>
						<td>Edison</td>
					</tr>
					<tr>
						<td>Jack</td>
						<td>23</td>
						<td>Edison</td>
					</tr>
				</tbody>
			</table>
		</div>	
		<c:if test=""></c:if> 
		
		<c:choose>
			<c:when test=""></c:when>
			<c:otherwise></c:otherwise>
		</c:choose>
	</body>
</html>