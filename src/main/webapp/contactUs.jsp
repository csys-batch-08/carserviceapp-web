<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us</title>
    <link rel="stylesheet" href="carser.css">
<style>
*{
 margin: 0;
 padding: 0;   
}
body
{
    height: 100vh;
   background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url('assets/jeep-wrangler-rubicon-5k-pe 1.jpg');
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
  .aboutus
  {
    width:800px;
    height:500px;
    position:absolute;
    left:250px;
    top:170px;
    background-color: rgb(0,0,0);
    background-color: rgba(0,0,0, 0.4);
    border: 1px solid black;
    border-radius: 1px;
    box-shadow: 10px 25px 30px rgba(0,0,0,0.3);
    font-family: Arial, Helvetica, sans-serif;
  }
  #contactus1
  {
    position:relative;
    top:30px;
    left:30px;
  }
  #contactus2
  {
    position:relative;
    top:20px;
    left:20px;
    text-align:justify;
    padding:30px;
    line-height: 1.5;
  }
  .tel-img
  {
    width:200px;
    height:150px;
    position:absolute;
    top:75px;
    left:20px;
  }
    #contactus3
  {
    position:absolute;
    top:150px;
    left:250px;
  }
  .email-img
  {
    width:200px;
    height:180px;
    position:absolute;
    top:140px;
    left:-30px;
  }
    #contactus4
  {
    position:absolute;
    top:200px;
    left:50px;
  }
    #contactus5
  {
     position:absolute;
    top:270px;
    left:250px;
  }
  .office-img
  {
    width:200px;
    height:130px;
    position:absolute;
    top:340px;
    left:-30px;
  }
    #contactus6
  {
    position:absolute;
    top:320px;
    left:50px;
  }
    #contactus7
  {
     position:absolute;
    top:400px;
    left:250px;
  }
  .posi
  {
    position:absolute;
    top:-60px;
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
        <a href="aboutUs.jsp">About Us</a>
        <a href="index.jsp" >Home</a>          
       </div>
    </div>
 <div class="posi"> 
   <div class="aboutus">
           <h2 id="contactus1">Contact Us</h2>
           <h3 id="contactus2">Helpline Numbers</h3>
           <img src='assets/call.png' alt="telephone" class="tel-img">
           <p id="contactus3">+91-9384 79 4114,+91-8056 31 1564,+91-8428 89 1847</p>
           <h3 id="contactus4">Email</h3>
           <img src='assets/email.png' alt="email" class="email-img">
           <p id="contactus5">Customer Support:info@mechcent.in</p>
           <h3 id="contactus6">Corporate Office Address</h3>
           <img src="assets/office1.png" alt="office"  class="office-img">
           <p id="contactus7">Marketone innovations pvt ltd
3rd Floor, Landmark Tower, Moti VIhar, Ashok Marg,
South City I, Sector 41, Ambattur, Chennai 122001</p>
   </div>
   </div>
</body>
</html>