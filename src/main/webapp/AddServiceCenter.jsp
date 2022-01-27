<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Service Center</title>
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
  .addservice
  {
   margin-top:40px;
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
        <a href="Logout.jsp">Logout</a>
        <a href="ContactUs.jsp">Contact Us</a>
        <a href="AboutUs.jsp">About Us</a>
        <a href="AdminPage.jsp" >Home</a>          
       </div>
        <div class="addservice">
       <h1>ServiceCenter Entry Form</h1>
          <form action="centerdetail" method="post" class="was-validated">
               <h2>Add Service Center</h2>
                      <hr>
                      <div class="mt-1 mb-1">
                     <label for="centername" class="form-label"><strong>Service Center Name</strong></label>
                     <input type="text" class="form-control" placeholder="Enter CenterName" name="centername" id="centername" pattern="^[#.0-9a-zA-Z\s,-]+$" required>
                     </div>
                     <div class="mt-1 mb-1">
                      <label for="centerlocation" class="form-label"><strong>Service Center Location</strong></label>
                     <input type="text" class="form-control" placeholder="Enter Center Location" name="centerlocation" id="centerlocation" pattern="^[#.0-9a-zA-Z\s,-]+$" required>
                     </div>
                     <div class="mt-1 mb-1">
                     <label for="centermob" class="form-label"><strong>Service Center Contact</strong></label>
                     <input type="tel" class="form-control" name="centercontact" pattern="[6-9][0-9]{9}" id="centercontact" placeholder="Enter Center Mobilenumber" required>
                     </div>
                     <label for="email" class="form-label"><strong>Service Center Email</strong></label>
                     <input type="email" class="form-control" name="centeremail" id="centeremail" placeholder="Enter Center Email" pattern="[a-zA-Z0-9.]+[@][a-zA-Z]+[.][a-z]+{15,}" required>
                     <div class="mt-1 mb-1">
                     <label for="address" class="form-label"><strong>Service Center Address</strong></label>
                     <input type="text" class="form-control" placeholder="Enter Center Address" id="centeraddress" name="centeraddress" pattern="^[#.0-9/a-zA-Z\s,-]+$" required>
                     </div>
                     <div class="mt-3 mb-0">
                     <button type="submit" class="btn btn-dark" onclick="addcenter()">Add Center</button>
                     <a href="AdminPage.jsp" class="btn btn-dark">Back</a>
                     </div>
                    
            </form>
             </div>
    </div>          
            <script type="text/javascript">
            function addcenter()
             {
          	   const cenname = document.getElementById("centername");
          	   const cenloc = document.getElementById("centerlocation");
          	   const cencont = document.getElementById("centercontact");
          	 const cenemail = document.getElementById("centeremail");
          	const cenaddr = document.getElementById("centeraddress");
          	 
          	  if((cenname.value=="")||(cenloc.value=="")||(cencont.value=="")||(cenemail.value=="")||(cenaddr.value==""))
          		  {
          		    
          		    sername.focus();
          		    return;
          		  }
           else
              {
        	   alert("Service Center is Added Successfully..");
          	  }
             } 
      </script>
</body>
</html>