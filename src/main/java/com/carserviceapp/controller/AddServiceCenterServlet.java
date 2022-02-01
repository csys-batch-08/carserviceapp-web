package com.carserviceapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CenterDetailsDAOImpl;
import com.carserviceapp.model.CenterDetails;

@WebServlet("/centerdetail")
public class AddServiceCenterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		    HttpSession session =request.getSession();
		   int userid=Integer.parseInt(session.getAttribute("userid").toString());
		   String centername = request.getParameter("centername");
		   String centerlocation = request.getParameter("centerlocation");
		   long centercontact = Long.parseLong(request.getParameter("centercontact"));
		   String centeremail=request.getParameter("centeremail");
		   String centeraddress=request.getParameter("centeraddress");
		   String dummy=" ";
		   CenterDetails obj1 = new CenterDetails(userid,centername,centerlocation,centercontact,centeremail,centeraddress,dummy);
		   CenterDetailsDAOImpl cent = new CenterDetailsDAOImpl();
		   cent.insert(obj1);
		   if(true)
		   {
			   response.sendRedirect("adminPage.jsp");
		   }
	}

}
