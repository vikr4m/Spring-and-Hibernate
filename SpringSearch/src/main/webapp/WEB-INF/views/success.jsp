<!doctype html>
<%@page isELIgnored="false"%>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Success</title>
</head>
<body>
	<div class="container">
		<h1 class="text-success">Registration successful</h1>
		<h1>Name: ${student.name}</h1>
		<h1>ID: ${student.id}</h1>
		<h1>Email: ${student.email}</h1>
		<h1>DOB: ${student.dob}</h1>
		<h1>Gender: ${student.gender}</h1>
		<h1>Courses: ${student.courses}</h1>
		<h1>Student Type: ${student.studenttype}</h1>
		<h1>Address:
			${student.address.street},${student.address.city},${student.address.state}</h1>
	</div>

</body>
</html>