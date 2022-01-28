package com.carserviceapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.*;
import com.carserviceapp.exception.ServiceNotFoundException;
import com.carserviceapp.model.*;

@WebServlet("/updateservice")
public class UpdateService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
		 HttpSession session =request.getSession();
		 int serviceid=Integer.parseInt(request.getParameter("serviceid"));
		 int newprice=Integer.parseInt(request.getParameter("updateservcost"));
		 CarServices obj1 = new CarServices(serviceid);
	     CarServicesDAOImpl cent = new CarServicesDAOImpl();
	     int checkserviceid = cent.checkserviceid(obj1); 
	     try {
				if(checkserviceid!=0)
				 {
					 CarServices obj2 = new CarServices(serviceid,newprice);
					 CarServicesDAOImpl cents = new CarServicesDAOImpl ();
					 boolean flag = cents.update(obj2);
					 if(flag)
					 {
						  session.setAttribute("updateprice",true);
					       response.sendRedirect("adminPage.jsp");
					 }
				 } 
				 else
				 {
				    throw new ServiceNotFoundException();
				 }
			}
	     catch(ServiceNotFoundException e)
		 {
			response.sendRedirect("UserPageWarn?message="+e.getMessage()+"&url=updateService.jsp");
		 }
			
		 }
	}
