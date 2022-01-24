<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Services</title>
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
            height:230px;
            width:330px;
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
   margin-top:110px;
    margin-left:140px;
    margin-right:800px;
  }
.btn:hover
{
 background-color:white;
 color:black;
}
h2
{
 display:inline;
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
        <a href="AdminPage.jsp" >Home</a>          
       </div>
        <div class="addservice">
       <h2>Update Service Price</h2>
          <form action="updateservice" method="post">
                  <div class="mb-1 mt-1">
                     <label for="service" class="form-label"><b>ServiceId</b></label><br>
                     <input type="number" class="form-control" placeholder="Enter ServiceId" name="serviceid" pattern="^[0-9]{3}$" required>
                   </div>
                   <div class="mb-2 mt-2">
                     <label for="servnewprice" class="form-label"><b>New Service Price</b></label><br>
                     <input type="number" id="servamount" class="form-control" name="updateservcost" placeholder="Enter New Price" pattern="^[0-9]{3,}$" required>
                  </div>
                  <div class="mb-1 mt-1">
                     <button type="submit" class="btn btn-dark">Update Price</button>
                     <a href="AdminPage.jsp" class="btn btn-dark">Back</a>
                  </div>   
                     </div>
            </form>
    </div>
</body>
</html>