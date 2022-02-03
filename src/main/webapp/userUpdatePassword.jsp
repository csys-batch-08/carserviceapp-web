<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Update Password..</title>
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
			<a href="#" id="firsthead"> <strong>Car Service Center</strong></a><br>
			<a href="#" id="secondhead">A one stop solution for all brand car
				service</a>
		</div>
		<div class="navnames">
			<a href="LogoutPage">Logout</a> <a href="contactUs.jsp">Contact
				Us</a> <a href="aboutUs.jsp">About Us</a> <a href="userPage.jsp">Home</a>
		</div>
	</div>
	<div class="updation">
		<div class="container mt-3">
			<h2>Change Password</h2>
			<form action="updatepassword" method="post">
				<fieldset>
					<legend></legend>
					<div class="mb-3 mt-3">
						<label for="servnewprice"><strong>New Password</strong></label><br>
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