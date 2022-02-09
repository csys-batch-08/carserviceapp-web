<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>AdminPage</title>
<link rel="stylesheet" type="text/css" href="assets/css/inner.css"/>
<link rel="stylesheet" type="text/css" href="assets/css/adminPage.css"/>
</head>
<body>
	<div class="container">
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
		<form action="adminaccess" method="post">
			<div class="cruds">
				<a href="addServiceCenter.jsp"><h2 class="btn button2">Add
						Service Center</h2></a> <a href="ShowServiceCenter"><h2
						class="btn button3">View Service Center</h2></a> <a
					href="addServices.jsp"><h2 class="btn button6">Add
						Services</h2></a> <a href="serviceshow"><h2 class="btn button7">View
						Services</h2></a> <a href="userUpdatePassword.jsp"><h2
						class="btn button14">Change Password</h2></a>
			</div>
			<div class="reportbtns">
				<a href="centerReportsOne.jsp"><h2 class="btns button10">Center
						Reports</h2></a> <a href="CustomerReports"><h2 class="btns button11">Customer
						Reports</h2></a> <a href="PickUpReports"><h2 class="btns button12">Pickup
						Report</h2></a> <a href="BillReports"><h2 class="btns button13">Bill
						Report</h2></a>
			</div>
		</form>
	</div>
	<script src="assets/js/popupMessages.js"></script>
	<c:if test="${param.result!=null}">
		<script type="text/javascript">
			showMessage('productUpdated')
		</script>
	</c:if>
</body>
</html>