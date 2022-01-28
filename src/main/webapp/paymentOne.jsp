<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"  %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
*{
 margin: 0;
 padding: 0;   
}
body
{
    height: 100vh;
   background-image: linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)),url('assets/jeep-wrangler-rubicon-5k-pe 1.jpg');
    background-position: center;
    background-size:cover;
     color:white;
    font-size:large;
}
form{
            border: 3px solid #f1f1f1;
            margin-left:0px;
            margin-right:800px;
            padding:10px;
            height:590px;
            width:420px;
            position:absolute;
            left:10px;
            top:20px;
        }
.heading
{
  position: absolute;
  left: 10px;
  font-size: 15px;
}
#firsthead
{
    color:#fff;
    position: relative;
    left: 10px;
    top: -8px;
    font-size: 40px;
    text-decoration: none;
    font-family:Georgia, 'Times New Roman', Times, serif;
}
#secondhead
{
    color:#fff;
    position: relative;
    text-decoration: none;
    left: 10px;
    top: -18px;
    font-size: 18px;
    font-family:Georgia, 'Times New Roman', Times, serif;   
}
.navnames {
    width: 100%;
    overflow: auto;
    height: 70px;
  }

  .navnames a{
    float: right;
    text-align: center;
    padding: 12px;
    color: white;
    text-decoration: none;
    font-size: 17px;
    font-family:  -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
  }

  .navnames a:hover {
    background-color: #000;
  }
  form
  {
     margin-left:100px;
     margin-right:800px;
     margin-top:60px;
  }
  .btn
{
  position:relative;
  top:-60px;
}
.btn:hover
{
 background-color:white;
 color:black;
}
.mb-0
{
 position:relative;
 top:-10px;
 bottom:2px;
}
p
{
 position:relative;
 top:-30px;
}
#terms
{
  position:relative;
 top:-60px;
}
.cash
{
  position:relative;
 top:-40px;
}
</style>
</head>
<body>
    <div class="topnavbar">
        <div class="heading">
       <a href="#" id="firsthead"> <strong>Car Service Center</strong></a><br>
       <a href="#" id="secondhead">A one stop solution for all brand car service</a>  
       </div>
       <div class="navnames">
        <a href="logout.jsp">Logout</a>
        <a href="contactUs.jsp">Contact Us</a>
        <a href="aboutUs.jsp">About Us</a>
        <a href="userPage.jsp" >Home</a>          
       </div>
    </div>
    
   <div class="container mt-1"> 
    <form action="paymentpage" method="post" class="was-validated">
               <div class="register">
               <fieldset>
                     <h2>Payment</h2>
                     <hr>
                     <div class="mb-0 mt-0">
                      <label for="cardnum" class="form-label"><strong>Card Number</strong></label><br>
                     <input type="text" class="form-control" placeholder="Enter CardNumber" name="cardnum" required pattern="[0-9]{16}" title="please enter 16 numbers" >
                     </div>
                     <div class="mb-0 mt-0">
                     <label for="holdername" class="form-label"><strong>Card Holder Name</strong></label><br>
                    <input type="text" placeholder="Enter CardHolderName" class="form-control" name="holdername" pattern="[a-zA-Z]{3,}" required>                  
                      </div>
                      <div class="mb-0 mt-0">
                     <label for="expdate" class="form-label"><strong>Expiry Date</strong></label><br>
                     <input type="month" id="expdate" class="form-control" name="expdate" min="2022-03" max="2030-03" placeholder="Enter ExpDate" required>
                     </div>
                     <div class="mb-0 mt-0">
                     <label for="cvvno" class="form-label"><strong>CVV</strong></label><br>
                     <input type="password" class="form-control" placeholder="Enter CvvNo" name="cvvno" pattern="^[0-9]{3}$" required><br>
                     </div>
                     <p>your bill is ..<c:out value="${amount}" />	</p> 	
                    <div class="mb-0 mt-0 cash">		 
                     <label for="amountpaid" class="form-label"><strong>Amount Paid</strong></label><br>
                     <input type="number" placeholder="Enter Amount" class="form-control" name="amountpaid" <c:out value="${amount}" />	 readonly="readonly" required><br>
                    </div>
                     <p id="terms">By accepting you agree to our <a href="termsAndPrivacy.jsp" style="color:red">Terms & Privacy</a>.</p>
                     <div class="clearfix">
                         <button type="submit" class="btn btn-dark">Submit</button>
                    </div> 
               </div>
                </fieldset>
       </form>
    
</body>
</html>