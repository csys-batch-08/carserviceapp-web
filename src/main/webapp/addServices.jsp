<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Services</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
   <link rel="stylesheet" type="text/css"
	href="assets/css/navBar.css"></link>
<link rel="stylesheet" type="text/css"
	href="assets/css/addService.css"></link>
</head>
<body>
    <div class="topnavbar">
        <div class="heading">
       <a href="#" id="firsthead"> <strong>Car Service Center</strong></a><br>
       <a href="#" id="secondhead">A one stop solution for all brand car service</a>  
       </div>
       <div class="navnames">
        <a href="LogoutPage">Logout</a>
       <a href="contactUs.jsp">Contact Us</a>
        <a href="aboutUs.jsp">About Us</a>
        <a href="adminPage.jsp" >Home</a>          
       </div><hr>
        <div class="addservice">
       <h1>Services Entry Form</h1>
          <form action="servicedetail" method="post" class="was-validated">
               <h2>Add Services</h2>
               <hr>
                    <div class="mt-1 mb-1">
                     <label for="services" class="form-label"><strong>Service Name</strong></label><br>
                     <input type="text" class="form-control" placeholder="Enter Service Name" name="servname" id="servname" pattern="[a-zA-Z\s-]{3,}" required autofocus>
                     </div>
                     <div class="mt-1 mb-1">
                     <label for="servicecost" class="form-label"><strong>Service Cost</strong></label><br>
                     <input type="number" class="form-control" placeholder="Enter Service Cost" name="servcost" id="servcost" pattern="^[0-9]{3,}$" min="100" max="999"required>
                     </div>
                     <div class="mt-1 mb-1">
                      <label for="servicedesc" class="form-label"><strong>Service Description</strong></label><br>
                     <input type="text" class="form-control" placeholder="Enter Service description" name="servdesc" id="servdesc" pattern="^[#.0-9a-zA-Z\s,-]+$" required>
                     </div>
                     <div class="mt-2">
                     <button type="submit" class="btn btn-dark" onclick="addservice()">Add Services</button>
                     <a href="adminPage.jsp" class="btn btn-dark">Back</a>
                     </div>                  
            </form>
           </div>
    </div>
</body>
</html>