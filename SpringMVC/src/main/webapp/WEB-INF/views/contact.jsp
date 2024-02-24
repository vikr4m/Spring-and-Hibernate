<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Contact</title>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
		crossorigin="anonymous">
	</head>
	<body>
		<%@include file= "navbar.jsp" %>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
			crossorigin="anonymous"></script>
		<h1 class="text-center">Registration</h1>
		
		<div class="container mt-5">
			<form action="processform" method="POST">
				<div class="form-group">
					<label for="username">User Name</label> <input
						type="text" required class="form-control" id="username" name="username"
						placeholder="Enter User Name"> 
				</div>
				<div class="form-group">
					<label for="email">Email</label> <input
						type="email" required class="form-control" id="email" name="email"
						placeholder="Enter your email">
				</div>
				<div class="form-group">
					<label for="password">Password</label> <input
						type="password" required class="form-control" id="password" name="password"
						placeholder="Enter password"><br>
						
				</div>
				<div class="container text-center">
					<button type="submit" class="btn btn-success">Signup</button>
				</div>
			</form>
		</div>
		
</body>
</html>
