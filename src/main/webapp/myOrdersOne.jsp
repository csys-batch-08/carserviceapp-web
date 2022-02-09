<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>MyOrders(1)</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous"/>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="assets/css/inner.css"/>
<link rel="stylesheet" type="text/css" href="assets/css/myOrdersOne.css"/>
</head>
<body>
	<div class="topnavbar">
		<div class="heading">
			<a href="#" id="firsthead"> <strong>Car Service Center</strong></a><br/>
			<a href="#" id="secondhead">A one stop solution for all brand car
				service</a>
		</div>
		<div class="navnames">
			<a href="LogoutPage">Logout</a> <a href="contactUs.jsp">Contact
				Us</a> <a href="aboutUs.jsp">About Us</a> <a href="userPage.jsp">Home</a>
		</div><hr/>
	</div>

	<div class="container mt-1">
		<h1>
			<strong>My Services</strong>
		</h1>
		<table class="table table-bordered table-sm">
			<caption style="visibility: hidden;">customer details</caption>
			<thead class="table-dark">
				<tr>
					<th scope="col">Bill No</th>
					<th scope="col">Service Date</th>
					<th scope="col">Amount</th>
					<th scope="col">Status</th>
					<th scope="col">Payment</th>
				</tr>
			</thead>
			<c:forEach items="${myordersone}" var="p">
				<tr>
					<td>${p.billNum}</td>
					<td>${p.servDate}</td>
					<td>&#x20B9; ${p.amount}</td>
					<td>${p.status}</td>
					<c:choose>
					<c:when test="${p.status=='processing'}">
					<td><a href="Payment"><button
							type="submit" class="btn btn-dark active" >Payment</button> </a></td>
						</c:when>
						<c:otherwise>
							<td><a href="Payment"><button
							type="submit" class="btn btn-dark disabled" >Payment</button> </a></td>
						</c:otherwise>
					</c:choose>	
				</tr>
			</c:forEach>
		</table>
			<a href="myOrders.jsp"><button type="submit" class="btn btn-dark">Back</button></a>
	</div>
</body>
</html>