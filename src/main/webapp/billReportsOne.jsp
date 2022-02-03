<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bill Reports</title>
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
<link rel="stylesheet" type="text/css" href="assets/css/billReports.css"></link>
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
	<div class="container mt-1">
		<h1>
			<strong>Bill Reports</strong>
		</h1>
		<table class="table table-bordered table-sm">
			<caption style="visibility: hidden;">bill reports details</caption>
			<thead class="table-dark">
				<tr>
					<th scope="col">BillNo</th>
					<th scope="col">UserID</th>
					<th scope="col">Service-Date</th>
					<th scope="col">Amount</th>
					<th scope="col">Status</th>
				</tr>
			</thead>
			<c:forEach items="${billlist}" var="p">
				<tr>
					<td>${p.billNum}</td>
					<td>${p.userId}</td>
					<td>${p.servDate}</td>
					<td>${p.amount}</td>
					<td>${p.status}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<a href="adminPage.jsp"><button type="submit" class="btn btn-dark">Back</button></a>
</body>
</html>