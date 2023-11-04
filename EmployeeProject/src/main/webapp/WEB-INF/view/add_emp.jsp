<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous"></link>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<div class="container-fluid">
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link" href="home">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="add_emp">Add
							Employee</a></li>
					<li class="nav-item"><a class="nav-link" href="login">Login</a></li>
					<li class="nav-item"><a class="nav-link" href="register">Registration</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<h1 class="text-center">Add Employee</h1>
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header">
						<div class="card-body">
							<form action="createEmp" method="post">
								<div class="mb-3">
									<label>Enter full name</label> <input type="text"
										name="fullname" class="form-control">
								</div>
								<div class="mb-3">
									<label>Enter Address</label> <input type="text" name="address"
										class="form-control">
								</div>
								<div class="mb-3">
									<label>Enter Email</label> <input type="text" name="email"
										class="form-control">
								</div>
								<div class="mb-3">
									<label>Enter password</label> <input type="text"
										name="password" class="form-control">
								</div>
								<div class="mb-3">
									<label>Enter Designation</label> <input type="text"
										name="designation" class="form-control">
								</div>
								<div class="mb-3">
									<label>Enter Salary</label> <input type="text" name="salary"
										class="form-control">
								</div>
								<div class="text-center">
									<button class="btn btn-outline-primary">Submit</button>
								</div>
								<div class="tex-center">
									<c:if test="${not empty msg}">
										<h4 class="text-success text-center">
											<c:out value="${msg }" />
										</h4>
										<c:remove var="msg" />
									</c:if>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>