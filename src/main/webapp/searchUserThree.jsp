<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>SearchCenter(3)</title>
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
	href="assets/css/searchUserThree.css"></link>
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

		<div class="container mt-1	">
			<h1>
				<strong>Services</strong>
			</h1>
			<table class="table table-bordered table-sm">
				<caption style="visibility: hidden;">search user details</caption>
				<thead class="table-dark">
					<tr>
						<th scope="col">Service Name</th>
						<th scope="col">Service Cost</th>
						<th scope="col">Service Desc</th>
						<th scope="col">Service ID</th>
						<th scope="col">Select Service</th>
					</tr>
				</thead>
				<c:forEach items="${servicelist}" var="p">
					<tr>
						<td>${p.serviceName}</td>
						<td>${p.serviceCost}</td>
						<td>${p.serviceDesc}</td>
						<td>${p.serviceId}</td>
						<td><a href="chooseservices?serviceId=${p.serviceId}"><button
									type="button" class="btn btn-dark">Select service</button></a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
</body>
<script language="JavaScript">
	function showInput(val) {
		document.getElementById('services').value = val;

	}
</script>
</html>