<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
<title>Update Services</title>
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
<link rel="stylesheet" type="text/css" href="assets/css/inner.css"></link>
<link rel="stylesheet" type="text/css"
	href="assets/css/updateService.css"></link>
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
				Us</a> <a href="aboutUs.jsp">About Us</a> <a href="adminPage.jsp">Home</a>
		</div><hr>
		<div class="addservice">
			<h1>Update Service Price</h1>
			<form action="updateservice" method="post">
				<div class="mb-1 mt-1">
					<label for="serviceid" class="form-label"><strong>ServiceId</strong></label><br>
					<input type="number" class="form-control"
						placeholder="Enter ServiceId" name="serviceid" id="serviceid" value="${serviceId}"
						pattern="^[0-9]{3}$" required autofocus readonly>
				</div>
				<div class="mb-2 mt-2">
					<label for="servamount" class="form-label"><strong>New
							Service Price</strong></label><br> <input type="number" id="servamount"
						class="form-control" name="servamount"
						placeholder="Enter New Price" pattern="^[0-9]{3,}$" required>
				</div>
				<div class="mb-1 mt-1">
					<button type="submit" class="btn btn-dark">Update Price</button>
					<a href="adminPage.jsp" class="btn btn-dark">Back</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>