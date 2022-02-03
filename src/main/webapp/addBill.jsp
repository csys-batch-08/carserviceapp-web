<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add Bill</title>
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
<link rel="stylesheet" type="text/css" href="assets/css/addBill.css"></link>
</head>
<body>
	<div class="heading">
		<a href="#" id="firsthead"> <strong>Car Service Center</strong></a><br>
		<a href="#" id="secondhead">A one stop solution for all brand car
			service</a>
	</div>
	<div class="navnames">
		<a href="LogoutPage">Logout</a> <a href="contactUs.jsp">Contact Us</a>
		<a href="aboutUs.jsp">About Us</a> <a href="adminPage.jsp">Home</a>
	</div>
	<div class="addservice">
		<h1>Generate Bill</h1>
		<form action="addbill" method="post" class="was-validated">
			<label for="userid" class="form-label"><strong>UserId</strong></label><br>
			<input type="number" class="form-control" placeholder="Enter UserId"
				name="userid" id="userid" pattern="^[0-9]{3}$" min="100" max="999" required autofocus><br>
			<label for="servdate" class="form-label"><strong>Service
					Date</strong></label><br> <input type="date" class="form-control"
				placeholder="Enter Service Date" id="datefield" name="servdate"
				required><br> <br>
			<button type="submit" class="btn btn-dark" onclick="generatebill()">Generate
				Bill</button>
			<a href="adminPage.jsp" class="btn btn-dark" id="addbill1">Back</a>
		</form>
	</div>
	<script src="assets/js/addBill.js"></script>
</body>
</html>