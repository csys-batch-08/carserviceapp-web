<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Delete Account</title>
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
            width:300px;
            padding:10px;
            height:170px;
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
  .addservice
  {
   margin-top:50px;
    margin-left:100px;
    margin-right:1000px;
  }
.btn
{
    position:relative;
    top:-50px;
}
.btn:hover
{
 background-color:white;
 color:black;
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
        <div class="addservice">
       <h1>Unsuscribe</h1>
          <form action="deleteaccount" method="post">
            <fieldset>
               <legend>Delete Account</legend>
                  
                     <label for="mobno"><b>MobileNumber</b></label><br>
                     <input type="tel" placeholder="Enter Registered MobileNumber" class="form-control" name="mobileno" pattern="[6-9][0-9]{9}" required><br>  <br>
                     <button type="submit" class="btn btn-dark">Unsuscribe</button>
                      <a href="UserUpdatePassword.jsp" class="btn btn-dark">Back</a>
                     </div>
               </fieldset>
            </form>
    </div>
</body>
</html>