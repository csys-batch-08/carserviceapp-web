<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Service Center</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  <link rel="stylesheet" type="text/css"
	href="assets/css/navBar.css"></link>
<link rel="stylesheet" type="text/css"
	href="assets/css/addServiceCent.css"></link>
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
       <h1>ServiceCenter Entry Form</h1>
          <form action="centerdetail" method="post" class="was-validated">
               <h2>Add Service Center</h2>
                      <hr>
                      <div class="mt-1 mb-1">
                     <label for="centername" class="form-label"><strong>Service Center Name</strong></label>
                     <input type="text" class="form-control" placeholder="Enter CenterName" name="centername" id="centername" pattern="^[#.0-9a-zA-Z\s,-]+$" required autofocus>
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
                     <a href="adminPage.jsp" class="btn btn-dark">Back</a>
                     </div>
            </form>
             </div>
    </div>          
</body>
</html>