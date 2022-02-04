<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>SearchCenter(1)</title>
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
	href="assets/css/searchUserOne.css"></link>
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
		<h1>
			<strong>ServiceCenters</strong>
		</h1>
		<table class="table table-bordered table-sm">
			<caption style="visibility: hidden;">service center details</caption>
			<thead class="table-dark">
				<tr>
					<th scope="col">Center ID</th>
					<th scope="col">Center Name</th>
					<th scope="col">Center Location</th>
					<th scope="col">Center Contact</th>
					<th scope="col">Center Address</th>
					<th scope="col">Select Center</th>
				</tr>
			</thead>
			<c:forEach items="${centerlist}" var="p">
				<tr>
					<td>${p.centerId}</td>
					<td>${p.centerName}</td>
					<td>${p.centerLocation}</td>
					<td>${p.centerContact}</td>
					<td>${p.centerAddress}</td>
					<td><a href="SearchUserTwo?centerId=${p.centerId}"><button
								type="button" class="btn btn-dark">Select</button> </a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<a href="userPage.jsp" class="btn btn-dark">Back</a>
</body>
</html>