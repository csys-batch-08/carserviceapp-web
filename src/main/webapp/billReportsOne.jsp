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
<link rel="stylesheet" type="text/css" href="assets/css/navBar.css"/>
<link rel="stylesheet" type="text/css" href="assets/css/billReports.css"/>
<script src="https://code.jquery.com/jquery-3.5.1.js"
	integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.11.4/css/jquery.dataTables.css">
<script
	src="https://cdn.datatables.net/1.11.4/js/jquery.dataTables.min.js"
	integrity="sha384-JQOveGFp+ebVxM94coUF7x6YiAUYRPGJb1VhPi3xz7/Uv36AewFNY2AS5PxQh7Vz"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="topnavbar">
		<div class="heading">
			<a id="firsthead"> <strong>Car Service Center</strong></a><br>
			<a id="secondhead">A one stop solution for all brand car
				service</a>
		</div>
		<div class="navnames">
			<a href="LogoutPage">Logout</a> <a href="contactUs.jsp">Contact
				Us</a> <a href="aboutUs.jsp">About Us</a> <a href="adminPage.jsp">Home</a>
		</div>
		<hr>
	</div>
	<div class="container mt-1">
		<h1>
			<strong>Bill Reports</strong>
		</h1>
		<table class="table table-bordered table-sm" id="example">
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
				    <td>&#x20B9; ${p.amount}</td>
					<td>${p.status}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<a href="adminPage.jsp"><button type="submit" class="btn btn-dark">Back</button></a>
	<script>
		$(document).ready(function() {
			$('#example').DataTable();
		});
	</script>
</body>
</html>