<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Services</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
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
   height:360px;
   width:350px;
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
   margin-top:80px;
    margin-left:100px;
    margin-right:700px;
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
       <h1>Services Entry Form</h1>
          <form action="servicedetail" method="post" class="was-validated">
               <h2>Add Services</h2>
               <hr>
                    <div class="mt-1 mb-1">
                     <label for="services" class="form-label"><strong>Service Name</strong></label><br>
                     <input type="text" class="form-control" placeholder="Enter Service Name" name="servname" id="servname" pattern="[a-zA-Z\s-]{3,}" required>
                     </div>
                     <div class="mt-1 mb-1">
                     <label for="servicecost" class="form-label"><strong>Service Cost</strong></label><br>
                     <input type="number" class="form-control" placeholder="Enter Service Cost" name="servcost" id="servcost" pattern="^[0-9]{3,}$"required>
                     </div>
                     <div class="mt-1 mb-1">
                      <label for="servicedesc" class="form-label"><strong>Service Description</strong></label><br>
                     <input type="text" class="form-control" placeholder="Enter Service description" name="servdesc" id="servdesc" pattern="^[#.0-9a-zA-Z\s,-]+$" required>
                     </div>
                     <div class="mt-2">
                     <button type="submit" class="btn btn-dark" onclick="addservice()">Add Services</button>
                     <a href="adminPage.jsp" class="btn btn-dark">Back</a>
                     
                     <script type="text/javascript">
                      function addservice()
                       {
                    	   const sername = document.getElementById("servname");
                    	   const sercost = document.getElementById("servcost");
                    	   const serdesc = document.getElementById("servdesc");
                    	 
                    	  if((sername.value=="")||(sercost.value=="")||(serdesc.value==""))
                    		  {
                    		    sername.focus();
                    		    return;
                    		  }
                     else
                        {
            	          alert("Service is Added Sucessfully...");
                    	}
                       } 
                      </script>
                     </div>                  
            </form>
           </div>
    </div>
</body>
</html>