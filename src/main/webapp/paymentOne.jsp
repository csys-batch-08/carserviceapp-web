<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Payment</title>
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
<link rel="stylesheet" type="text/css" href="assets/css/paymentOne.css"></link>
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
	</div>

	<div class="container mt-1">
		<form action="paymentpage" method="post" class="was-validated">
			<div class="register">
				<h2>Payment</h2>
				<hr>
				<div class="mb-0 mt-0">
					<label for="cardnum" class="form-label"><strong>Card
							Number</strong></label><br> <input type="text" class="form-control"
						placeholder="Enter CardNumber" name="cardnum" required autofocus
						pattern="[0-9]{16}" title="please enter 16 numbers">
				</div>
				<div class="mb-0 mt-0">
					<label for="holdername" class="form-label"><strong>Card
							Holder Name</strong></label><br> <input type="text"
						placeholder="Enter CardHolderName" class="form-control"
						name="holdername" pattern="[a-zA-Z]{3,}" required>
				</div>
				<div class="mb-0 mt-0">
					<label for="expdate" class="form-label"><strong>Expiry
							Date</strong></label><br> <input type="month" id="expdate"
						class="form-control" name="expdate" min="2022-03" max="2030-03"
						placeholder="Enter ExpDate" required>
				</div>
				<div class="mb-0 mt-0">
					<label for="cvvno" class="form-label"><strong>CVV</strong></label><br>
					<input type="password" class="form-control"
						placeholder="Enter CvvNo" name="cvvno" pattern="^[0-9]{3}$"
						required><br>
				</div>
				<p>
					your bill is ..
					<c:out value="${amount}" />
				</p>
				<div class="mb-0 mt-0 cash">
					<label for="amountpaid" class="form-label"><strong>Amount
							Paid</strong></label><br> <input type="number" placeholder="Enter Amount"
						class="form-control" name="amountpaid"
						value="<c:out value="${amount}" />" readonly="readonly" required><br>
				</div>
				<p id="terms">
					By accepting you agree to our <a href="termsAndPrivacy.jsp"
						style="color: red">Terms & Privacy</a>.
				</p>
				<div class="clearfix">
					<button type="submit" class="btn btn-dark">Submit</button>
				</div>
		</form>
	</div>
</body>
</html>