<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
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

<title>Complexform</title>
</head>
<body style="background: #e2e2e2;">
	<div class="container mt-4">

		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex form</h3>
						<div class="alert alert-danger" role="alert">
							<form:errors path="student.*"/>
						</div>
						<form action="handleform" method="POST">
							<div class="form-group">
								<label for="name">Name</label> <input type="text"
									class="form-control" name="name" id="name"
									placeholder="Enter name">
							</div>
							<div class="form-group">
								<label for="id">Enter Id</label> <input type="text"
									class="form-control" name="id" id="id" placeholder="12345">
							</div>
							<div class="form-group">
								<label for="email">Email address</label> <input type="email"
									class="form-control" name="email" id="email"
									placeholder="name@example.com">
							</div>
							<div class="form-group">
								<label for="dob">Date of birth</label> <input type="text"
									class="form-control" name="dob" id="dob"
									placeholder="DD/MM/YYYY">
							</div>
							<div class="form-group">
								<label for="courses">Select Courses</label> <select
									class="form-control" name="courses" id="courses" multiple>
									<option>Java</option>
									<option>Python</option>
									<option>Android</option>
									<option>C++</option>
									<option>React</option>
								</select>
							</div>
							<div class="form-group">
								<span class="mr-3">Select Gender</span><br>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="gender" value="male" checked> <label
										class="form-check-label" for="male"> Male </label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="gender" value="female"> <label
										class="form-check-label" for="female"> Female </label>
								</div>
							</div>
							<div class="form-group">
								<label for="studenttype"> Select student type </label> <select
									class="form-control" name="studenttype">
									<option value="old student">Old Student</option>
									<option value="new student">New Student</option>
								</select>
							</div>
							<div class="card">
								<div class="card-body">
									<label for="address"> Address</label>
									<div class="form-group">
										<input type="text" name="address.street" placeholder="Street"
											class="form-control">
									</div>
									<div class="form-group">
										<input type="text" name="address.city" placeholder="City"
											class="form-control">
									</div>
									<div class="form-group">
										<input type="text" name="address.state" placeholder="State"
											class="form-control">
									</div>
								</div>
							</div>

							<div class="container text-center">
								<button class="btn btn-primary">Submit</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>

	</div>






	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

</body>
</html>