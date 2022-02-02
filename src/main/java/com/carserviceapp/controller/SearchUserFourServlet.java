package com.carserviceapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.ServiceDetailsDAOImpl;
import com.carserviceapp.model.ServiceDetails;

@WebServlet("/chooseservices")
public class SearchUserFourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession(); 
		int userid =(int)session.getAttribute("userid");
		int serviceid=Integer.parseInt(request.getParameter("serviceId"));
		ServiceDetailsDAOImpl userserv = new ServiceDetailsDAOImpl();
		ServiceDetails serv = new ServiceDetails(userid,serviceid);
		userserv.insert(serv);
        response.sendRedirect("searchUserFour.jsp");
	}
}
