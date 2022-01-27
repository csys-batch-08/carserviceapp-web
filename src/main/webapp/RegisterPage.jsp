<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        *{box-sizing: border-box;}
        body
        {
        background-image: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)),url('assets/jeep-wrangler-rubicon-5k-pe 1.jpg');
        }
        form
        {
          border: 3px solid #f1f1f1;
          margin-left:300px;
          margin-right:300px;
          background-color:white;
        }
        input[type=text], input[type=password],input[type=tel],input[type=email] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}
button:hover {
  opacity:1;
}
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}
.container {
  padding: 16px;
}
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
    width: 100%;
  }
    </style>
</head>
<body>
<div class="container mt-1">
       <form action="carserviceuser12" method="post" class="was-validated">
               <div class="register">
                     <h1>Sign Up</h1>
                     <p>Please fill in this form to create an account</p>
                     <hr>
                   <div class="mb-1 mt-1">
                     <label for="user" class="form-label"><strong>Username</strong></label>
                     <input type="text"  placeholder="Enter username" class="form-control" pattern="[a-zA-Z\s]{3,}" oninvalid="this.setCustomValidity('Enter username more than 3 charcters')" onchange="try{setCustomValidity('')}catch(e){}" oninput="setCustomValidity('')" name="user" required>
                   </div>
                   
                   <div class="mb-1 mt-1">
                     <label for="mob" class="form-label"><strong>Mobilenumber</strong></label>
                     <input type="tel" id="mob" name="mob" class="form-control" oninvalid="this.setCustomValidity('mobile number should be 10 numbers and starts with 6-9 only')" onchange="try{setCustomValidity('')}catch(e){}" oninput="setCustomValidity('')"  pattern="[6-9]{1}[0-9]{9}" placeholder="Enter Mobilenumber" required>
                   </div>
                   
                   <div class="mb-1 mt-1">
                     <label for="password" class="form-label"><strong>Password</strong></label>
                     <input type="password" id="password" class="form-control" name="password" pattern="(?=.*[0-9])(?=.*[@#$%*!^()_+])(?=.*[a-z])(?=.*[A-Z]).{8,}" oninvalid="this.setCustomValidity('Enter password should be more dhan 8 digits and 1 UpperCase,1 SpecialCase,1 number')" onchange="try{setCustomValidity('')}catch(e){}" oninput="setCustomValidity('')" placeholder="Enter password" required>
                   </div>
                   
                   <div class="mb-1 mt-1">
                     <label for="email" class="form=label"><strong>Email</strong></label>
                     <input type="email" id="email" class="form-control" name="email" placeholder="Enter email" pattern="[a-zA-Z0-9.]+[@][a-zA-Z]+[.][a-z]+{15,}" oninvalid="this.setCustomValidity('Gmail id should be in correct formate of abc@gmail.com')" onchange="try{setCustomValidity('')}catch(e){}" oninput="setCustomValidity('')" required>
                   </div>
                   
                   <div class="mb-1 mt-1">
                     <label for="address" class="form-label"><strong>Address</strong></label>
                     <input type="text"  placeholder="Enter Address" class="form-control" name="address" pattern="^[#.0-9\a-zA-Z\s,-]+$" oninvalid="this.setCustomValidity('entered address should be in correct formate')" onchange="try{setCustomValidity('')}catch(e){}" oninput="setCustomValidity('')" required>
                   </div> 			
                    
                   <div class="form-check mb-3">
                    <input class="form-check-input" type="checkbox" id="myCheck" name="remember" required>
                    <label class="form-check-label" for="myCheck">By creating an account you agree to our <a href="TermsAndPrivacy.jsp" style="color:dodgerblue">Terms & Privacy</a>.</label>
                    <div class="valid-feedback">Valid.</div>
                    <div class="invalid-feedback">Check this Checkbox to continue.</div>
                   </div>

                     <div class="clearfix">
                         <a href="Index.jsp"><button type="button" class="cancelbtn">Cancel</button></a>
                        <button type="submit" class="signupbtn">Sign Up</button>
                     </div>
                     
               </div>

       </form>
       </div>
</body>
</html>