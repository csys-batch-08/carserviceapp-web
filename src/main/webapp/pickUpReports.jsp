<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>PickUp Reports</title>
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
	href="assets/css/pickupReports.css"></link>
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
			<strong>PickUp Reports</strong>
		</h1>
		<table class="table table-bordered table-sm">
			<caption style="visibility: hidden;">customer details</caption>
			<thead class="table-dark">
				<tr>
					<th scope="col">PickUp ID</th>
					<th scope="col">Customer UserID</th>
					<th scope="col">Customer Name</th>
					<th scope="col">Customer Mobile</th>
					<th scope="col">Customer Address</th>
					<th scope="col">Center ID</th>
					<th scope="col">Status</th>
					<th scope="col">Payment</th>
				</tr>
			</thead>
			<c:forEach items="${pickuplist}" var="p">
				<tr>
					<td>${p.pickupId}</td>
					<td>${p.userId}</td>
					<td>${p.cName}</td>
					<td>${p.cMobile}</td>
					<td>${p.pickAddress}</td>
					<td>${p.centerId}</td>
					<td>${p.status}</td>
					<c:choose>
					   <c:when test="${p.status=='requested'}">
					<td><a href="billreportsone?userId=${p.userId}"><button
							type="button" class="btn btn-dark active" >Generate Bill</button> </a></td>
						</c:when>
						<c:otherwise>
							<td><a href="billreportsone?userId=${p.userId}"><button
							type="button" class="btn btn-dark disabled" >Generate Bill</button> </a></td>
						</c:otherwise>
					</c:choose>	
				</tr>
			</c:forEach>
		</table>
	</div>
	<a href="adminPage.jsp"><button type="submit" class="btn btn-dark">Back</button></a>
</body>
</html>