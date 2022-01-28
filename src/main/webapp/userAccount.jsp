<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.carserviceapp.connection.*" import ="java.sql.*" import="com.carserviceapp.model.*"
    import="javax.servlet.http.HttpSession"  import="com.carserviceapp.daoimpl.*"  import="com.carserviceapp.dao.*" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Profile</title>
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
   table,th,td
      {
          border:1px solid black;
          border-collapse: collapse;
          border-bottom: 1px solid black;
          color:white;
      }
      tr:hover {background-color: black;color:white;}
      td
      {text-align:center;
      }
      table
      {
        width:80%;
        height:50px;
        margin-top:100px;
      }
      h1
      {
        position:relative;
        left:0px;
        top:100px;
      }
      .btn
     {
        position:relative;
        top:40px;
        left:130px;
     }
     .btn:hover
     {
         background-color:white;
         color:black;
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
<h1><strong>My Account</strong></h1>
<table  class="table table-bordered table-sm">
<caption style="visibility:hidden;">show center details</caption>
<thead class="table-dark">
  <tr style="text-align:center;">
       <th scope="col">UserID </th>
       <th scope="col">Name</th>
       <th scope="col">Mobile Number</th>
       <th scope="col">Password</th>
       <th scope="col">Email </th>
       <th scope="col">Address </th>    
  </tr>
  </thead>
    <c:forEach items="${myprofile}" var="p" >
  <tr>
     <td>${p.user_id}</td>
     <td>${p.name}</td>
     <td>${p.mobileno}</td>
     <td>${p.password}</td>
     <td>${p.email}</td>
     <td>${p.address}</td>    
  </tr>
 </c:forEach>
</table>
</div>
<a href="userPage.jsp"><button type="submit" class="btn btn-dark">Back</button></a>
</body>
</html>