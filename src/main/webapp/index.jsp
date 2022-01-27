<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Service Center(index)</title>
    <link rel="stylesheet" href="carser.css">
<style>
*{
 margin: 0;
 padding: 0;   
}
body
{
    height: 100vh;
background-image: url('assets/jeep-wrangler-rubicon-5k-pe 1.jpg');
    background-position:center;
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
  .col{
    flex-basis: 50%;
    margin-left:15px;
}
h1{
    color: #fff;
    font-size: 100px;
}

p{
    color: white;
    font-size: 11px;
    line-height: 15px;
}
button{
    width: 150px;
    color: #000;
    font-size: 15px;
    padding: 12px ;
    background: #fff;
    border: 0;
    border-radius: 20px;
    outline: none;
    margin-top: 30px;
    cursor:pointer;
}

button
{
    transition: transform 0.5s;
}

button:hover{
    transform: translate(20px);
}

#paragh
{
  font-size:15px;
}
  .row{
    display: flex;
    height: 88%;
    align-items:center;
}
</style>
</head>
<body>
    <div class="container">
        <div class="heading">
       <a href="#" id="firsthead"> <b>Car Service Center</b></a><br>
       <a href="#" id="secondhead">A one stop solution for all brand car service</a>  
       </div>
       <div class="navnames">
        <a href="RegisterPage.jsp">Register</a>
        <a href="LogIn.jsp">Login</a>
        <a href="ContactUs.jsp">Contact Us</a>
        <a href="AboutUs.jsp">About Us</a>
        <a href="Index.jsp" >Home</a>          
       </div>
    </div>
     <%
   if(session.getAttribute("userinactive") != null){%>
	   <h1 style="position:absolute; top:80px; right:50px; font-size:30px; color:black;">Your Account is Successfully Removed!!</h1>   
   <%session.removeAttribute("userinactive"); 
   session =request.getSession();
   request.getSession().invalidate();
   }
   %>
  <div class="row"> 
    <div class="col">
                         <h1>MECHcent</h1>
                         <p id="paragh">Stay in the comforts of your home or office and make the most of our complimentary pick-up and drop-in service.
 Count on us to be your personal car care expert, advisor and car mechanic.</p>
                             <a href="LogIn.jsp"><button type="button">Explore</button></a>
                     </div>
    </div>                 
</body>
</html>