<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Service Center</title>
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
form
{
   border:3px solid #f1f1f1;
   padding:10px;
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
  
   margin-top:100px;
    margin-left:100px;
    margin-right:500px;
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
        <div class="addservice">
       <h2>Update ServiceCenter</h2>
          <form action="updatecontact" method="post">
                  <div class="mt-1 mb-1">
                     <label for="center" class="form-label"><strong>CenterId</strong></label>
                     <input type="text" class="form-control" placeholder="Enter CenterId" name="centerid" pattern="^[0-9]{3}$" required>
                   </div>
                   <div class="mt-1 mb-1">
                     <label for="newcentermob" class="form-label"><strong>New Contact Number</strong></label>
                     <input type="tel" class="form-control" id="mob" name="updatecentercontact" pattern="[6-9][0-9]{9}" placeholder="Enter New Center Mobilenumber" required>
                   </div>
                   <div class="mt-3 mb-1"> 
                     <button type="submit" class="btn btn-dark">Update Center Contact</button>
                     <a href="adminPage.jsp" class="btn btn-dark" id="addcen">Back</a>
                   </div>
            </form>
         </div>
    </div>
</body>
</html>