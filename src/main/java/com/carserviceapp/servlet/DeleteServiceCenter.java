package com.carserviceapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CenterDetailsDAOImpl;
import com.carserviceapp.exception.CenterNotFoundException;
import com.carserviceapp.model.CenterDetails;

@WebServlet("/deletecenter")
public class DeleteServiceCenter extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session =request.getSession();
		int centerid = Integer.parseInt(request.getParameter("centerid"));
		CenterDetails obj1 = new CenterDetails(centerid);
		CenterDetailsDAOImpl cent = new CenterDetailsDAOImpl();
		int checkcenterid = cent.checkservicecenterid(obj1);
		 try {
				if(checkcenterid!=0)
				 {
					CenterDetails obj2 = new CenterDetails(centerid);
					CenterDetailsDAOImpl cent2 = new CenterDetailsDAOImpl();
					  boolean flag = cent2.delete(obj2);
					  session.setAttribute("deletecenter", true);
					  if(flag)
					  {
				      response.sendRedirect("adminPage.jsp");
					  }
				 }
				 else
				 {
				     throw new CenterNotFoundException(); 		 
				 }
			} 
		 catch (IOException e) 
		 {
				e.printStackTrace();
	     }
		 catch(CenterNotFoundException e)
		 {
			response.sendRedirect("UserPageWarn?message="+e.getMessage()+"&url=deleteServiceCenter.jsp");
		 }	
		 }
}
