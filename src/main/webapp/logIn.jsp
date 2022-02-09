<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<head>
<title>Log-In</title>
<link rel="icon" type="image/x-icon" href="assets/images/searchservice.jpg"/>
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
	href='https://cdn.jsdelivr.net/npm/sweetalert2@10.10.1/dist/sweetalert2.min.css'/>
<script
	src="https://cdn.jsdelivr.net/npm/sweetalert2@11.3.10/dist/sweetalert2.all.min.js"
	integrity="sha384-xP+lCMUO8LdFmTT1hKJJ6XmedxWdYvUDfNWikdOfcEQEww69y4bbSlXcfDDNwvzm"
	crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="assets/css/login.css"/>
</head>
<body>
	<form action="loginpage" method="post" class="was-validated">
		<fieldset>
			<legend></legend>
			<div class="imgcontainer">
				<img src="assets/images/logo.jpg" alt="avatar" class="avatar"/>
			</div>

			<div class="container">
				<label for="uname" class="form-label"><strong>Username</strong></label>
				<input type="text" placeholder="Enter username" class="form-control"
					name="uname" id="uname"
					oninvalid="this.setCustomValidity('Enter username more than 3 charcters')"
					onchange="try{setCustomValidity('')}catch(e){}"
					oninput="setCustomValidity('')" pattern="[a-zA-Z\\s]{3,}" required
					autofocus/>
				 <label for="userpass" class="form-label"><strong>Password</strong></label>
				<input type="password" class="form-control"
					placeholder="Enter password" name="userpass" id="userpass"
					oninvalid="this.setCustomValidity('Enter password correctly')"
					onchange="try{setCustomValidity('')}catch(e){}"
					oninput="setCustomValidity('')"
					pattern="(?=.*[0-9])(?=.*[@#$%*!^()_+])(?=.*[a-z])(?=.*[A-Z]).{8,}"
					required/> 
					<input type="checkbox" class="input" id="showpassword"
					onclick="showpassword()" onKeyDown="showpassword()" onKeyPress="showpassword()" onKeyUp="showpassword()"/><label for="showpassword">Show Password</label>
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				<a href="forgotPassword.jsp">Forgot Password</a>
				<button type="submit">Login</button>
			</div>
			<div class="container">
				<a href="index.jsp"><button type="button" class="cancelbtn">Cancel</button></a>
				<a href="registerPage.jsp"><button type="button"
						class="registerbtn">Register</button></a>
			</div>
		</fieldset>
	</form>
	<script src="assets/js/logIn.js"></script>
	<script src="assets/js/popupMessages.js"></script>
	<c:set var="invaliduser" scope="request" value="${invaliduser}"></c:set>
	<c:if test="${invaliduser!=null}">
		<script type="text/javascript"> showMessage('${invaliduser}')</script>
		<c:remove var="invaliduser" scope="request" />
	</c:if>
</body>
</html>