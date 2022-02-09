<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
<title>User Delete Account</title>
<link rel="icon" type="image/x-icon" href="assets/images/searchservice.jpg"/>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous"/>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"/>
<link rel="stylesheet" type="text/css"
	href="assets/css/userDeleteAccount.css"/>
</head>
<body>
	<div class="topnavbar">
		<div class="heading">
			<a id="firsthead"> <strong>Car Service Center</strong></a><br/>
			<a id="secondhead">A one stop solution for all brand car
				service</a>
		</div>
		<div class="navnames">
			<a href="LogoutPage">Logout</a> <a href="contactUs.jsp">Contact
				Us</a> <a href="aboutUs.jsp">About Us</a> <a href="userPage.jsp">Home</a>
		</div><hr/>
		<div class="addservice">
			<h1>Unsubscribe</h1>
			<form action="deleteaccount" method="post">
				<h2>Delete Account</h2>

				<label for="mobileno"><strong>MobileNumber</strong></label><br> <input
					type="tel" placeholder="Enter Registered MobileNumber"
					class="form-control" name="mobileno" id="mobileno" pattern="[6-9][0-9]{9}"
					required autofocus/><br> <br>
				<button type="submit" class="btn btn-dark">Unsuscribe</button>
				<a href="userUpdatePassword.jsp" class="btn btn-dark">Back</a>
			</form>
		</div>
	</div>
</body>
</html>