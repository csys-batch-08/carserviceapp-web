<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AdminPage</title>
    <link rel="stylesheet" type="text/css"
	href="assets/css/inner.css"></link>
	 <link rel="stylesheet" type="text/css"
	href="assets/css/adminpage.css"></link>
</head>
<body>
    <div class="container">
        <div class="heading">
       <a href="#" id="firsthead"> <strong>Car Service Center</strong></a><br>
       <a href="#" id="secondhead">A one stop solution for all brand car service</a>  
       </div>
       <div class="navnames">
        <a href="LogoutPage">Logout</a>
        <a href="contactUs.jsp">Contact Us</a>
        <a href="aboutUs.jsp">About Us</a>
        <a href="adminPage.jsp" >Home</a>          
       </div>
    <form action="adminaccess" method="post">  
    <div class="cruds">
      <a href="addBill.jsp"><h2 class="btn button1">Add Bill</h2></a>
        <a href="addServiceCenter.jsp"><h2 class="btn button2">Add Service Center</h2></a>
       <a href="ShowServiceCenter"><h2 class="btn button3">View Service Center</h2></a>
       <a href="updateServiceCenter.jsp"><h2 class="btn button4">Update Service Center</h2></a>
       <a href="deleteServiceCenter.jsp"><h2 class="btn button5">Delete Service Center</h2></a>
       <a href="addServices.jsp"><h2 class="btn button6">Add Services</h2></a>
       <a href="serviceshow"><h2 class="btn button7">View Services</h2></a>
       <a href="updateService.jsp"><h2 class="btn button8">Update Services</h2></a>
       <a href="deleteService.jsp"><h2 class="btn button9">Delete Services</h2></a>
       <a href="userUpdatePassword.jsp"><h2 class="btn button14">Change Password</h2></a>
     </div>  
     <div class="reportbtns">  
      <a href="centerReportsOne.jsp"><h2 class="btns button10">Center Reports</h2></a>
       <a href="CustomerReports"><h2 class="btns button11">Customer Reports</h2></a>
       <a href="PickUpReports"><h2 class="btns button12">Pickup Report</h2></a>
       <a href="BillReports"><h2 class="btns button13">Bill Report</h2></a>
       </div>
       
    </form> 
    </div>
</body>
</html>