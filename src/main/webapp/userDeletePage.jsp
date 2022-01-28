<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Delete Account(1)</title>
    <link rel="stylesheet" href="carser.css">
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
    top: 1px;
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
    top: -2px;
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
  .finish
  {
    position:relative;
    left:450px;
    top:60px;
  }
  .finish1
  {
    position:relative;
    left:410px;
    top:60px;
  }
</style>
</head>
<body>
	
    <div class="container">
        <div class="heading">
       <a href="#" id="firsthead"> <strong>Car Service Center</strong></a><br>
       <a href="#" id="secondhead">A one stop solution for all brand car service</a>  
       </div>
       <div class="navnames">
        <a href="registerPage.jsp">Register</a>
        <a href="logIn.jsp">Login</a>
        <a href="contactUs.jsp">Contact Us</a>
        <a href="aboutUs.jsp">About Us</a>
        <a href="userPage.jsp" >Home</a>          
       </div>
    </div>
    <form action="useraccess" method="post">  
       <h2><a href="searchUserOne.jsp">Search Service Center</a></h2>
      <h2> <a href="myOrders.jsp">My Orders</a></h2>
       <h2><a href="userAccount.jsp">My Account</a></h2>
       <h2><a href="userUpdatePassword.jsp">Change Password</a></h2>
       <h2><a href="userDeleteAccount.jsp">Delete My Account</a></h2>
       <h2><a href="index.jsp">Logout</a></h2>
    </form> 
    <h1 class="finish">Thanks For Using MechCent....</h1>
     <h1 class="finish1">Your Account is Deleted Successfully....</h1>
</body>
</html>