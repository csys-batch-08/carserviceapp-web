<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Unsubscribe</title>
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
	href="assets/css/userUnSuscribe.css"/>
</head>
<body>
	<div class="topnavbar">
		<div class="heading">
			<a href="#" id="firsthead"> <strong>Car Service Center</strong></a><br/>
			<a href="#" id="secondhead">A one stop solution for all brand car
				service</a>
		</div>
		<div class="navnames">
			<a href="RegisterPage.jsp">Register</a> <a href="logIn.jsp">Login</a>
			<a href="contactUs.jsp">Contact Us</a> <a href="aboutUs.jsp">About
				Us</a> <a href="userPage.jsp">Home</a>
		</div><hr/>
	</div>

	<h1 class="finish">Your Account is OutOfService....</h1>
	<h1 class="finish1">Please activate your account..</h1>
	<a href="UserReactivate"><button class="btn btn-dark"
			onclick="activatealrt()">Activate</button></a>
<script>
	function activatealrt() 
	{
		alert("your account is successfully reactivated");
	}
</script>
</body>
</html>