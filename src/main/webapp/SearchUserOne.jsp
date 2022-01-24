<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"  import="com.carserviceapp.connection.*" import ="java.sql.*" import="com.carserviceapp.daoimpl.*"  import="com.carserviceapp.dao.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SearchCenter(1)</title>
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
        margin-top:150px;
      }
      h1
      {
        position:absolute;
        left:115px;
        top:170px;
      }
.selectbtn
{
  background-color:black;
  border: none;
  color: white;
  padding: 5px 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 15px;
  margin-left:60px;
}
.selectbtn:hover
{
 background-color:white;
 color:black;
}
.navnav a
{
 color:white;
 text-decoration:none;
 float: left;
    text-align: center;
    padding: 12px;
    color: white;
    text-decoration: none;
    font-size: 17px;
    font-family:  -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
}
/*  .signupbtn
{
  background-color:black;
  border: none;
  color: white;
  padding: 10px 15px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 15px;
  position:relative;
  left:100px;
  top:15px;
}*/
.btn
{
  position:relative;
  top:10px;
  left:130px;
}
.btn:hover
{
 background-color:white;
 color:black;
}
td a
{
  position:relative;
  top:-10px;
  left:-100px;
}
</style>
</head>
<body>
<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	if ((session.getAttribute("user") == null)&&(session.getAttribute("admin")==null)&&(session.getAttribute("invalid")==null)) {
		response.sendRedirect("Index.jsp");
	}
	%>
    <div class="topnavbar">
        <div class="heading">
       <a href="#" id="firsthead"> <b>Car Service Center</b></a><br>
       <a href="#" id="secondhead">A one stop solution for all brand car service</a>  
       </div>
       <div class="navnames">
        <a href="Logout.jsp">Logout</a>
        <a href="ContactUs.jsp">Contact Us</a>
        <a href="AboutUs.jsp">About Us</a>
        <a href="UserPage.jsp" >Home</a>          
       </div>
    </div>
  <!--   <div class="navnav">
        <a href="MyOrders.jsp">My Orders</a>
       <a href="UserAccount.jsp">My Account</a>
       <a href="UserUpdatePassword.jsp">Change Password</a>
       <a href="UserDeleteAccount.jsp">Delete My Account</a>
    </div> -->
<%!ResultSet rs; %>
<%
CenterDetailsDAOImpl center1 = new CenterDetailsDAOImpl();
rs = center1.showview();
%>

<div class="container mt-1">
<h1><b>ServiceCenters</b></h1>
<table  class="table table-bordered table-sm">
<thead class="table-dark">
  <tr>
       <th>Center ID</th>
       <th>Center Name</th>
       <th>Center Location</th>
       <th>Center Contact</th>
       <th>Center Address</th>
       <th>Select Center</th>
  </tr>
  </thead>
  <%while(rs.next()) {%>
  
       <tr>
      
       <td><%=rs.getInt(1)%></td>
       <td><%=rs.getString(2)%></td>
       <td><%=rs.getString(3) %></td>
       <td><%=rs.getLong(4)%></td>
       <td><%=rs.getString(5)%></td>
       <td> <a  href="SearchUserTwo.jsp?centerId=<%=rs.getInt(1)%>"><button type="button" class="btn btn-dark">Select</button> </a></td>     
     </tr>
 
  <%} %>
</table>
</div>
<a href="UserPage.jsp" class="btn btn-dark">Back</a>
</body>
</html>