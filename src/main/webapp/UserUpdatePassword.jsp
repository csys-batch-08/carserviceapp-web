<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.carserviceapp.servlet.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Password..</title>
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
    background-image: linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url('assets/jeep-wrangler-rubicon-5k-pe 1.jpg');
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
            height:170px;
            width:400px;
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
  .btn
  {
    position:relative;
    bottom:50px; 
  }
.btn:hover
{
 background-color:white;
 color:black;
}
#backbtn
{
  position:relative;
  top:-50px;
  left:0px;
}
.updation
{
  margin-top:100px;
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
 <div class="updation">    
 <div class="container mt-3">
    <h2>Change Password</h2>
          <form action="updatepassword" method="post">
            <fieldset>
                 <div class="mb-3 mt-3">
                     <label for="servnewprice"><b>New Password</b></label><br>
                     <input type="password" id="updatepassword" class="form-control" name="updatepassword" placeholder="Enter New Password" pattern="(?=.*[0-9])(?=.*[@#$%*!^()_+])(?=.*[a-z])(?=.*[A-Z]).{8,}" required><br><br>
                  </div>   
                     <button type="submit" class="btn btn-dark">Change Password</button>
                      <a href="UserDeleteAccount.jsp" class="btn btn-dark">Delete Account</a>
                      <a href="updateback11" class="btn btn-dark" id="backbtn">Back</a>
               </fieldset>
            </form>
   </div>   
   </div> 
</body>
</html>