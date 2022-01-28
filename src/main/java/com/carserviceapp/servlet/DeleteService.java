package com.carserviceapp.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CarServicesDAOImpl;
import com.carserviceapp.exception.ServiceNotFoundException;
import com.carserviceapp.model.CarServices;


@WebServlet("/deleteservice")
public class DeleteService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 HttpSession session =request.getSession();
		int serviceid = Integer.parseInt(request.getParameter("serviceid"));
		CarServices obj1 = new CarServices(serviceid);
		CarServicesDAOImpl cent = new CarServicesDAOImpl();
		int checkserviceid = cent.checkserviceid(obj1);
		 try {
			if(checkserviceid!=0)
			 {
				CarServices obj2 = new CarServices(serviceid);
				CarServicesDAOImpl cent2 = new CarServicesDAOImpl();
				  boolean flag = cent2.delete(obj2);
				  session.setAttribute("deleteservice", true);
				  if(flag)
				  {
			      response.sendRedirect("adminPage.jsp");
				  }
			 }
			 else
			 {
					 throw new ServiceNotFoundException();
			 }
		} catch (IOException e)
		 {
			e.printStackTrace();
		 }
		 catch(ServiceNotFoundException e)
		 {
			response.sendRedirect("UserPageWarn?message="+e.getMessage()+"&url=deleteService.jsp");
		 }	
	}

}
