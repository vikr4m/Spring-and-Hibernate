<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home</title>
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
	<h1 class="text-center">Employee CRUD</h1>
	<c:if test="${not empty msg}">
		<h4 class="text-success text-center">
			<c:out value="${msg }" />
		</h4>
		<c:remove var="msg" />
	</c:if>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header">
						<div class="card-body">
							<table class="table">
								<thead>
									<tr>
										<th scope="col">Id</th>
										<th scope="col">Full Name</th>
										<th scope="col">Address</th>
										<th scope="col">Email</th>
										<th scope="col">Password</th>
										<th scope="col">Designation</th>
										<th scope="col">Salary</th>
										<th scope="col">Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${empList}" var="emp">
										<tr>
											<th scope="row">${emp.id}</th>
											<td>${emp.fullname}</td>
											<td>${emp.address}</td>
											<td>${emp.email}</td>
											<td>${emp.password}</td>
											<td>${emp.designation}</td>
											<td>${emp.salary}</td>
											<td><a href="editEmp/${emp.id}"
												class="btn btn-sm btn-primary">Edit</a> <a
												href="deleteEmp/${emp.id}" class="btn btn-sm btn-danger">Delete</a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>