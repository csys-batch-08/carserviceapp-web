<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
<title>Update Password..</title>
<link rel="icon" type="image/x-icon" href="assets/images/searchservice.jpg">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css"
	href="assets/css/userUpdatePassword.css"></link>
</head>
<body>
	<div class="topnavbar">
		<div class="heading">
			<a id="firsthead"> <strong>Car Service Center</strong></a><br>
			<a id="secondhead">A one stop solution for all brand car
				service</a>
		</div>
		<div class="navnames">
			<a href="LogoutPage">Logout</a> <a href="contactUs.jsp">Contact
				Us</a> <a href="aboutUs.jsp">About Us</a> <a href="userPage.jsp">Home</a>
		</div><hr>
	</div>
	<div class="updation">
		<div class="container mt-3">
			<h1>Change Password</h1>
			<form action="updatepassword" method="post">
				<fieldset>
					<legend></legend>
					<div class="mb-3 mt-3">
						<label for="updatepassword"><strong>New Password</strong></label><br>
						<input type="password" id="updatepassword" class="form-control"
							name="updatepassword" placeholder="Enter New Password"
							pattern="(?=.*[0-9])(?=.*[@#$%*!^()_+])(?=.*[a-z])(?=.*[A-Z]).{8,}"
							required autofocus><br> <br>
					</div>
					<button type="submit" class="btn btn-dark">Change Password</button>
					<a href="userDeleteAccount.jsp" class="btn btn-dark">Delete
						Account</a> <a href="updateback11" class="btn btn-dark" id="backbtn">Back</a>
				</fieldset>
			</form>
		</div>
	</div>
</body>
</html>