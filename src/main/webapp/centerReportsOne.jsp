<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script
	src="https://cdn.jsdelivr.net/npm/sweetalert2@11.3.10/dist/sweetalert2.all.min.js"
	integrity="sha384-xP+lCMUO8LdFmTT1hKJJ6XmedxWdYvUDfNWikdOfcEQEww69y4bbSlXcfDDNwvzm"
	crossorigin="anonymous"></script>
<link rel='stylesheet'
	href='https://cdn.jsdelivr.net/npm/sweetalert2@10.10.1/dist/sweetalert2.min.css'>

<title>Center Reports</title>
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
	href="assets/css/centerReportsOne.css"></link>
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
		<hr>
	</div>
	<div class="centerreports">
		<form action="centerreports" method="post" class="was-validated">
			<fieldset>
				<legend></legend>
				<label for="centerid"><h3>CenterID</h3></label><br> <input
					type="number" placeholder="Enter CenterID" class="form-control"
					id="centerid" name="centerid" pattern="^[0-9]{3,}$" min="100"
					max="999" required autofocus><br>
				<button type="submit" class="btn btn-dark">Search</button>
				<a href="adminPage.jsp" class="btn btn-dark">Back</a>
			</fieldset>
		</form>
	</div>
	<script src="assets/js/popupMessages.js"></script>
	<c:set var="centerNotFound" scope="request" value="${centernotfound}"></c:set>
	<c:if test="${centerNotFound!=null}">
		<script type="text/javascript"> showMessage('${centerNotFound}')</script>
		<c:remove var="centerNotFound" scope="request" />
	</c:if>

	<script src="assets/js/popupMessages.js"></script>
	<c:if test="${param.errormsg!=null}">
		<script type="text/javascript">showMessage('${centerNotFound}'')</script>
	</c:if>

</body>
</html>