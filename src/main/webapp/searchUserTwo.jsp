<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>SearchCenter(2)</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="assets/css/inner.css"></link>
<link rel="stylesheet" type="text/css"
	href="assets/css/searchUserTwo.css"></link>
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

	<div class="container mt-1">
		<form action="pickuprequest" method="post" class="was-validated">
			<div class="register">
				<h1>PickUp Request Form</h1>
				<p>Please fill in this form for pickup purposes</p>
				<hr>
				<div class="mb-0 mt-1">
					<label for="cusname" class="form-label"><strong>Customer
							Name</strong>></label><br> <input type="text" placeholder="Enter Name"
						class="form-control"
						title="username should be more than 3 characters" name="custname"
						pattern="[a-zA-Z\\s]{3,}" required autofocus>
				</div>
				<div class="mb-0 mt-1">
					<label for="email" class="form-label"><strong>Customer
							Email</strong></label><br> <input type="email" id="email" name="custemail"
						class="form-control" placeholder="Enter email"
						pattern="[a-zA-Z0-9.]+[@][a-zA-Z]+[.][a-z]+{15,}" required>
				</div>
				<div class="mb-0 mt-1">
					<label for="contact" class="form-label"><strong>Customer
							Contact</strong></label><br> <input type="tel" id="mob" name="custmob"
						class="form-control" title="mobile number should be 10 numbers"
						pattern="[6-9][0-9]{9}" placeholder="Enter Mobilenumber" required>
				</div>
				<div class="mb-0 mt-1">
					<label for="address" class="form-label"><strong>Car
							PickupAddress</strong></label><br> <input type="text"
						placeholder="Enter PickUp Address.." class="form-control"
						name="custaddress" pattern="^[#.0-9a-zA-Z\s,-]+$" required>
				</div>

				<div class="mb-0 mt-1">
					<label for="centerid" class="form-label"><strong>Center
							ID</strong></label><br> <input type="number" placeholder="Enter CenterID"
						name="centerid" class="form-control"
						value="<c:out value="${centerId}" />" readonly="readonly"
						pattern="^[0-9]{3}$" required>
				</div>

				<div class="form-check mb-1">
					<input class="form-check-input" type="checkbox" id="myCheck"
						name="remember" required> <label class="form-check-label"
						for="myCheck">By creating an account you agree to our <a
						href="termsAndPrivacy.jsp" style="color: dodgerblue">Terms &
							Privacy</a>.
					</label>
					<div class="valid-feedback">Valid.</div>
					<div class="invalid-feedback">Check this checkbox to
						continue.</div>
				</div>

				<div class="clearfix mt-0">
					<a href="searchUserOne.jsp" class="btn btn-dark">Back</a>
					<button type="submit" class="btn btn-dark">Submit</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>