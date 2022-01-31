<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About Us</title>
    <link rel="stylesheet" href="carser.css">
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
  .aboutus
  {
    width:850px;
    height:400px;
    position:absolute;
    left:250px;
    top:170px;
    background-color: rgb(0,0,0);
    background-color: rgba(0,0,0, 0.4);
    border: 1px solid black;
    border-radius: 1px;
    box-shadow: 10px 25px 30px rgba(0,0,0,0.3);
    font-family: Arial, Helvetica, sans-serif;
  }
  #aboutus1
  {
    position:absolute;
    top:30px;
    left:30px;
  }
  #aboutus2
  {
    position:absolute;
    top:70px;
    left:20px;
    text-align:justify;
    line-height: 1.5;
    padding:20px;
  }
   #aboutus3
  {
    position:absolute;
    top:150px;
    left:20px;
    text-align:justify;
    line-height: 1.5;
    padding:20px;
  }
   #aboutus4
  {
    position:absolute;
    top:280px;
    left:20px;
    text-align:justify;
    line-height: 1.5;
    padding:20px;
  }
</style>
</head>
<body>
    <div class="container">
        <div class="heading">
       <a href="#" id="firsthead"> <strong>Car Service Center</strong></a><br>
       <a href="#" id="secondhead">A one stop solution for all brand car service</a>  
       </div>
       <div class="navnames">
        <a href="registerPage.jsp">Register</a>
        <a href="logIn.jsp">Login</a>
        <a href="contactUs.jsp">Contact Us</a>
        <a href="index.jsp" >Home</a>          
       </div>
    </div> 
   <div class="aboutus">
           <h2 id="aboutus1">About Us</h2> 
           <p id="aboutus2">MechCent aims to be the best of both worlds - Reliable and Cost-effective Car Services
Car Servicing, Car repairs and Car cleaning - we are your one-stop solution for all things cars.</p>
<p id="aboutus3">A brainchild of 3 friends - Vinithkumar,SuryaKumar,Manikandan. MechCent a network of technology-enabled car 
service centres, offering a seamless car service experience at the convenience of a tap. With our highly skilled technicians, 
manufacturer recommended procedures and the promise of genuine spare parts we are your best bet.</p>
<p id="aboutus4">Stay in the comforts of your home or office and make the most of our complimentary pick-up and drop-in service.
 Count on us to be your personal car care expert, advisor and car mechanic.</p>
 </div>
</body>
</html>