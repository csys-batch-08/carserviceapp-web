<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Service Center(User)</title>
    
<style>
*{
 margin: 0;
 padding: 0;   
}
body
{
    height: 100vh;
   background-image: linear-gradient(rgba(0,0,0,0.2),rgba(0,0,0,0.2)),url('assets/jeep-wrangler-rubicon-5k-pe Flip.jpg');
    background-position: center;
    background-size:cover;
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
    top: 1px;
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
    top: -2px;
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
  h2 a
  {
  text-decoration: none;
    color: #000;
    color:white;
  }
  .row{
    display: flex;
    height: 88%;
    align-items:center;
}

.col{
    flex-basis: 50%;
  visibility: hidden;
}

.col1{
    flex-basis: 50%;
}

h1{
    color: #fff;
    font-size: 100px;
}

p{
    color: white;
    font-size: 11px;
    line-height: 15px;
}

button{
    width: 150px;
    color: #000;
    font-size: 12px;
    padding: 12px 0;
    background: #fff;
    border: 0;
    border-radius: 20px;
    outline: none;
    margin-top: 30px;
    cursor:pointer;
}

h5{
    color: #900C3F;
    font-style: bold;
}
#paragh
{
  font-size:15px;
}
.card{
    width: 240px;
    height: 230px;
    display: inline-block;
    border-radius: 10px;
    padding: 15px 25px;
    box-sizing: border-box;
    cursor: pointer;
    margin: 10px 15px ;
    background-position: center;
    background-size: cover;
    transition: transform 0.5s;
}

.card:hover{
    transform: translateY(-10px);
}
.card1{
    background-image: url(https://st2.depositphotos.com/3682225/11228/v/950/depositphotos_112288198-stock-illustration-automotive-repair-icon-car-service.jpg);
}
.card2{
    background-image: url(https://www.pngitem.com/pimgs/m/252-2523555_order-transparent-background-png-order-logo-png-png.png);
}
.card3{
    background-image: url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFBC_k0U5wAT7uxRM4j6V-vgyi3MpbZdZi0Q&usqp=CAU);
      filter:brightness(96%);
}
.card4{
    background-image: url(data:image/png;base64,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);
}
</style>
</head>
<body>
     <%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	if ((session.getAttribute("user") == null)&&(session.getAttribute("admin")==null)&&(session.getAttribute("supplier")==null)) {
		response.sendRedirect("index.jsp");
	}
	%>
	
    <div class="container">
        <div class="heading">
       <a href="#" id="firsthead"> <strong>Car Service Center</strong></a><br>
       <a href="#" id="secondhead">A one stop solution for all brand car service</a>  
       </div>
       <div class="navnames">
        <a href="logout.jsp">LogOut</a>
        <a href="contactUs.jsp">Contact Us</a>
        <a href="aboutUs.jsp">About Us</a>
        <a href="userPage.jsp" >Home</a>          
       </div>
    </div>
    
               <div class="row">
                     <div class="col" >
                         <h1>MECHcent</h1>
                         <p id="paragh">Stay in the comforts of your home or office and make the most of our complimentary pick-up and drop-in service.
 Count on us to be your personal car care expert, advisor and car mechanic.</p>
                             <a href="searchUserOne.jsp"><button type="button">Explore</button></a>
                     </div>
                     <div class="col1">
                         <a href="SearchUserOne"><div class="card card1">
                             <h5>Search Service Center</h5>
                         </div></a>
                         
                          <a href="myOrders.jsp"><div class="card card2">
                           <h5>MyOrders</h5>
                        </div></a>
                        
                        
                        <a href="UserAccount"> <div class="card card3">
                           <h5>MyAccount</h5>
                        </div></a>
                        
                       <a href="userUpdatePassword.jsp"> <div class="card card4">
                           <h5>Edit Account</h5>
                        </div></a>
                     </div>
                 </div>
</body>
</html>