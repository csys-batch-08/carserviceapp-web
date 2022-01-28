<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored ="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PickUp Reports</title>
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
    background-repeat:no-repeat;
    background-attachment: fixed;
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
      table
      {
        width:80%;
        height:100px;
        margin-top:45px;
      }
      h1
      {
        position:relative;
        left:10px;
        top:40px;
      }
.btn
{
 position:relative;
 top:10px;
 left:120px;
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
        <a href="adminPage.jsp" >Home</a>          
       </div>
    </div>

<div class="container mt-1">
<h1><strong>PickUp Reports</strong></h1>
<table  class="table table-bordered table-sm">
 <caption style="visibility:hidden;">customer details</caption>
<thead class="table-dark">
  <tr>
       <th scope="col">PickUp ID</th>
       <th scope="col">Customer UserID</th>
       <th scope="col">Customer Name</th>
       <th scope="col">Customer Email</th>
       <th scope="col">Customer Mobile</th>
       <th scope="col">Customer Address</th>
       <th scope="col">Center ID</th>  
       <th scope="col">Status</th>
  </tr>
  </thead>
   <c:forEach items="${pickuplist}" var="p" >
  <tr> 
     <td>${p.pickupId}</td>
     <td>${p.userId}</td>
     <td>${p.cName}</td>
     <td>${p.cEmail}</td>
     <td>${p.cMobile}</td>
     <td>${p.pickAddress}</td>
     <td>${p.centerId}</td>
     <td>${p.status}</td>
  </tr>
     </c:forEach>
</table>
</div>
<a href="adminPage.jsp"><button type="submit"  class="btn btn-dark">Back</button></a>
</body>
</html>