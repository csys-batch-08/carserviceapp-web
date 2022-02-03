<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Center Reports</title>
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
	href="assets/css/centerReportsOne.css"></link>
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
	</div>
	<div class="centerreports">
		<form action="centerreports" method="post" class="was-validated">
			<fieldset>
				<legend></legend>
				<label for="centerid"><h3>CenterID</h3></label><br> <input
					type="number" placeholder="Enter CenterID" class="form-control"
					name="centerid" pattern="^[0-9]{3,}$" min="100" max="999" required autofocus><br>
				<button type="submit" class="btn btn-dark">Search</button>
				<a href="adminPage.jsp" class="btn btn-dark">Back</a>
			</fieldset>

		</form>
	</div>
</body>
</html>