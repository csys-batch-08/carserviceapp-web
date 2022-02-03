<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Update Service Center</title>
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
	href="assets/css/updateCenter.css"></link>
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
				Us</a> <a href="aboutUs.jsp">About Us</a> <a href="adminPage.jsp">Home</a>
		</div>
		<div class="addservice">
			<h2>Update ServiceCenter</h2>
			<form action="updatecontact" method="post">
				<div class="mt-1 mb-1">
					<label for="center" class="form-label"><strong>CenterId</strong></label>
					<input type="text" class="form-control"
						placeholder="Enter CenterId" name="centerid" pattern="^[0-9]{3}$"
						required autofocus>
				</div>
				<div class="mt-1 mb-1">
					<label for="newcentermob" class="form-label"><strong>New
							Contact Number</strong></label> <input type="tel" class="form-control" id="mob"
						name="updatecentercontact" pattern="[6-9][0-9]{9}"
						placeholder="Enter New Center Mobilenumber" required>
				</div>
				<div class="mt-3 mb-1">
					<button type="submit" class="btn btn-dark">Update Center
						Contact</button>
					<a href="adminPage.jsp" class="btn btn-dark" id="addcen">Back</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>