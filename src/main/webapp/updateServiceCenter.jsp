<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
<title>Update Service Center</title>
<link rel="icon" type="image/x-icon" href="assets/images/searchservice.jpg"/>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous"/>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css"
	href="assets/css/updateCenter.css"/>
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
				Us</a> <a href="aboutUs.jsp">About Us</a> <a href="adminPage.jsp">Home</a>
		</div><hr/>
		<div class="addservice">
			<h1>Update ServiceCenter</h1>
			<form action="updatecontact" method="post">
				<div class="mt-1 mb-1">
					<label for="centerid" class="form-label"><strong>CenterId</strong></label>
					<input type="text" class="form-control" value="${centerId}"
						placeholder="Enter CenterId" name="centerid" id="centerid" pattern="^[0-9]{3}$" readonly
						required autofocus/>
				</div>
				<div class="mt-1 mb-1">
					<label for="mob" class="form-label"><strong>New
							Contact Number</strong></label> <input type="tel" class="form-control" id="mob"
						name="mob" pattern="[6-9][0-9]{9}"
						placeholder="Enter New Center Mobilenumber" required/>
				</div>
				<div class="mt-3 mb-1">
					<button type="submit" class="btn btn-dark">Update Center
						Contact</button>
					<a href="ShowServiceCenter" class="btn btn-dark" id="addcen">Back</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>