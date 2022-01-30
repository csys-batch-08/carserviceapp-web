package com.carserviceapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CenterDetailsDAOImpl;
import com.carserviceapp.exception.CenterNotFoundException;
import com.carserviceapp.model.CenterDetails;

@WebServlet("/updatecontact")
public class UpdateCenterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
		 PrintWriter writer=response.getWriter();
		  int centerid=Integer.parseInt(request.getParameter("centerid"));
		  long centercontact = Long.parseLong(request.getParameter("updatecentercontact"));
		  CenterDetails obj1 = new CenterDetails(centerid);
		  CenterDetailsDAOImpl cent = new CenterDetailsDAOImpl();
		  int checkcenterid = cent.checkservicecenterid(obj1);
		  try {
				if(checkcenterid!=0)
				 {
					CenterDetails obj2 = new CenterDetails(centerid,centercontact);
					   CenterDetailsDAOImpl cents = new CenterDetailsDAOImpl();
						 boolean flag = cents.update(obj2);
						 if(flag)
						 {
							 writer.print("<script type=\"text/javascript\"> alert('Service Center Detail is Updated'); window.location = 'adminPage.jsp';</script>");
						 }
				 }		 
			 else {
	                 throw new CenterNotFoundException();
				  }
		       }
				 catch(CenterNotFoundException e)
					{
						response.sendRedirect("UserPageWarn?message="+e.getMessage()+"&url=updateServiceCenter.jsp");
					}	
			 }	  	   
	}
