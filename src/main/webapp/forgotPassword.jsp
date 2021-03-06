<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Forgot Password..</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous"/>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="assets/css/inner.css"/>
<link rel="stylesheet" type="text/css" href="assets/css/forgotPassword.css"/>
</head>
<body>
	<div class="topnavbar">
		<div class="heading">
			<a href="#" id="firsthead"> <strong>Car Service Center</strong></a><br>
			<a href="#" id="secondhead">A one stop solution for all brand car
				service</a>
		</div>
		<div class="navnames">
			<a href="LogoutPage">Logout</a> <a href="contactUs.jsp">Contact
				Us</a> <a href="aboutUs.jsp">About Us</a> <a href="userPage.jsp">Home</a>
		</div><hr>
	</div>

	<div class="container mt-3">
		<h2>Forgot Password</h2>
		<form action="forgotpassword" method="post">
			<fieldset>
				<legend></legend>
				<div class="mb-1 mt-1">
					<label for="servnewprice"><strong>Registered
							MobileNumber</strong></label><br> <input type="tel" id="updatepassword"
						class="form-control" name="forgotpassword"
						placeholder="Enter Registered Mobilenumber"
						pattern="[6-9][0-9]{9}" required autofocus/>
				</div>
				<div class="m-1 mt-1">
					<label for="updatepassword"><strong>New Password</strong></label><br>
					<input type="password" id="updatepassword" class="form-control"
						name="updatepassword" placeholder="Enter New Password"
						pattern="(?=.*[0-9])(?=.*[@#$%*!^()_+])(?=.*[a-z])(?=.*[A-Z]).{8,}"
						required/><br/>
					<br>
				</div>
				<button type="submit" class="btn btn-dark">Change Password</button>
			</fieldset>
		</form>
	</div>
</body>
</html>