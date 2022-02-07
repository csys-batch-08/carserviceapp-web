<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Service Centers</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="assets/css/navBar.css"></link>
<link rel="stylesheet" type="text/css"
	href="assets/css/serviceCenterShow.css"></link>
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
		</div><hr>
	</div>
	<div class="container mt-1">
		<h1>
			<strong>ServiceCenters</strong>
		</h1>
		<table class="table table-bordered table-sm">
			<caption style="visibility: hidden;">show center details</caption>
			<thead class="table-dark">
				<tr>
					<th scope="col">Center ID</th>
					<th scope="col">Center Name</th>
					<th scope="col">Center Location</th>
					<th scope="col">Center Contact</th>
					<th scope="col">Center Email</th>
					<th scope="col">Center Address</th>
					<th scope="col">Update</th>
					<th scope="col">delete</th>
				</tr>
			</thead>
			<c:forEach items="${showcenter}" var="p">
				<tr>
					<td>${p.centerId}</td>
					<td>${p.centerName}</td>
					<td>${p.centerLocation}</td>
					<td>${p.centerContact}</td>
					<td>${p.centerEmail}</td>
					<td>${p.centerAddress}</td>
					<td><a href="updateCenterOne?centerId=${p.centerId}"><button
								type="button" class="btn btn-dark">update</button> </a></td>
					<td><a href="deleteCenterOne?centerId=${p.centerId}"><button
								type="button" class="btn btn-dark">delete</button> </a></td>
				</tr>
			</c:forEach>
		</table>
		<a href="adminPage.jsp"><button type="submit" class="btn btn-dark">Back</button></a>
	</div>
</body>
</html>

