<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Page Warn</title>
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
<link rel="stylesheet" type="text/css" href="assets/css/existEmail.css"></link>
</head>
<body>
	<div class="heading">
		<a href="#" id="firsthead"> <strong>Car Service Center</strong></a><br>
		<a href="#" id="secondhead">A one stop solution for all brand car
			service</a>
	</div>
	<div class="navnames">
		<a href="LogoutPage">Logout</a> <a href="contactUs.jsp">Contact Us</a>
		<a href="aboutUs.jsp">About Us</a> <a href="userPage.jsp">Home</a>
	</div><hr>

	<h1 class="finish">Entered ServiceID not found in data's</h1>
	<a href="adminPage.jsp"><button class="btn btn-dark">Retry</button></a>
</body>
</html>