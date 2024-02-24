<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
	<script src="<c:url value="/resources/js/script.js"/>"></script>
    <title>SearchEngine</title>
  </head>
  <body>
  	<!-- To include image in spring/jsp <img alt="myimg" src="<c:url value="/resources/image/baki.jpg"/>">-->
	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    
    <div class="container text-center mt-5">
    	<div class="card mx-auto bg-primary" style="width: 60%">
    		<div class="card-body py-5">
    			<h3 class="text-center text-white" style="text-transform:uppercase;">Searchly</h3>
    			<form class="mt-3" action="finder">
    				
    				<div class="form-group">
    					<input type="text" name="querybox" placeholder="Search" class="form-control">
    				</div>
    				<div class="container text-center">
    					<button class="btn btn-outline-light">Search</button>
    				</div>
    			</form>
    		
    		</div>
    	</div>
    </div>
  </body>
</html>