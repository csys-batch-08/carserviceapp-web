<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Register Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous"/>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
	<link rel='stylesheet'
	href='https://cdn.jsdelivr.net/npm/sweetalert2@10.10.1/dist/sweetalert2.min.css'>
<script
	src="https://cdn.jsdelivr.net/npm/sweetalert2@11.3.10/dist/sweetalert2.all.min.js"
	integrity="sha384-xP+lCMUO8LdFmTT1hKJJ6XmedxWdYvUDfNWikdOfcEQEww69y4bbSlXcfDDNwvzm"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="assets/css/register.css"/>
</head>
<body>
	<div class="container mt-1">
		<form action="carserviceuserone" method="post" class="was-validated">
			<div class="register">
				<h1>Sign Up</h1>
				<p>Please fill in this form to create an account</p>
				<hr/>
				<div class="mb-1 mt-1">
					<label for="user" class="form-label"><strong>Username</strong></label>
					<input type="text" placeholder="Enter username"
						class="form-control" pattern="[a-zA-Z\s]{3,}"
						oninvalid="this.setCustomValidity('Enter username more than 3 charcters')"
						onchange="try{setCustomValidity('')}catch(e){}"
						oninput="setCustomValidity('')" name="user" id="user" required autofocus/>
				</div>

				<div class="mb-1 mt-1">
					<label for="mob" class="form-label"><strong>Mobilenumber</strong></label>
					<input type="tel" id="mob" name="mob" class="form-control"
						oninvalid="this.setCustomValidity('mobile number should be 10 numbers and starts with 6-9 only')"
						onchange="try{setCustomValidity('')}catch(e){}"
						oninput="setCustomValidity('')" pattern="[6-9]{1}[0-9]{9}"
						placeholder="Enter Mobilenumber" required/>
				</div>

				<div class="mb-1 mt-1">
					<label for="password" class="form-label"><strong>Password</strong></label>
					<input type="password" id="password" class="form-control"
						name="password"
						pattern="(?=.*[0-9])(?=.*[@#$%*!^()_+])(?=.*[a-z])(?=.*[A-Z]).{8,}"
						oninvalid="this.setCustomValidity('Enter password should be more dhan 8 digits and 1 UpperCase,1 SpecialCase,1 number')"
						onchange="try{setCustomValidity('')}catch(e){}"
						oninput="setCustomValidity('')" placeholder="Enter password"
						required/>
				</div>

				<div class="mb-1 mt-1">
					<label for="email" class="form=label"><strong>Email</strong></label>
					<input type="email" id="email" class="form-control" name="email"
						placeholder="Enter email"
						pattern="[a-zA-Z0-9.]+[@][a-zA-Z]+[.][a-z]+{15,}"
						oninvalid="this.setCustomValidity('Gmail id should be in correct formate of abc@gmail.com')"
						onchange="try{setCustomValidity('')}catch(e){}"
						oninput="setCustomValidity('')" required/>
				</div>

				<div class="mb-1 mt-1">
					<label for="address" class="form-label"><strong>Address</strong></label>
					<input type="text" placeholder="Enter Address" class="form-control"
						name="address" id="address" pattern="^[#.0-9\a-zA-Z\s,-]+$"
						oninvalid="this.setCustomValidity('entered address should be in correct formate')"
						onchange="try{setCustomValidity('')}catch(e){}"
						oninput="setCustomValidity('')" required/>
				</div>

				<div class="form-check mb-3">
					<input class="form-check-input" type="checkbox" id="myCheck"
						name="remember" required> <label class="form-check-label"
						for="myCheck">By creating an account you agree to our <a
						href="termsAndPrivacy.jsp" style="color: dodgerblue">Terms &amp;
							Privacy</a>.
					</label>
					<div class="valid-feedback">Valid.</div>
					<div class="invalid-feedback">Check this Checkbox to
						continue.</div>
				</div>

				<div class="clearfix">
					<a href="index.jsp"><button type="button" class="cancelbtn">Cancel</button></a>
					<button type="submit" class="signupbtn">Sign Up</button>
				</div>
			</div>
		</form>
	</div>
	<script src="assets/js/popupMessages.js"></script>
	<c:set var="existmobile" scope="request" value="${existmobile}"></c:set>
	<c:if test="${existmobile!=null}">
		<script type="text/javascript"> showMessage('${existmobile}')</script>
		<c:remove var="existmobile" scope="request" />
     </c:if>
	<c:set var="existemail" scope="request" value="${existemail}"></c:set>
	<c:if test="${existemail!=null}">
		<script type="text/javascript"> showMessage('${existemail}')</script>
		<c:remove var="existemail" scope="request" />
	</c:if>
</body>
</html>