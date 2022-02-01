package com.carserviceapp.controller;

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
					PrintWriter writer=response.getWriter();
					CenterDetails obj2 = new CenterDetails(centerid);
					CenterDetailsDAOImpl cent2 = new CenterDetailsDAOImpl();
					  boolean flag = cent2.delete(obj2);
					  session.setAttribute("deletecenter", true);
					  if(flag)
					  {
						  writer.print("<script type=\"text/javascript\"> alert('Service Center is Deleted'); window.location = 'adminPage.jsp';</script>");
					  }
				 }
				 else
				 {
				     throw new CenterNotFoundException(); 		 
				 }
			} 
		 catch (IOException e) 
		 {
				e.getCause();
	     }
		 catch(CenterNotFoundException e)
		 {
			response.sendRedirect("centerNotFound.jsp");
		 }	
		 }
}
