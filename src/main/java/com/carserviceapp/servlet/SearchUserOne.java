package com.carserviceapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.ServiceDetailsDAOImpl;
import com.carserviceapp.model.ServiceDetails;

/**
 * Servlet implementation class SearchUserOne
 */
@WebServlet("/chooseservices")
public class SearchUserOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchUserOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(); 
		int userid =(int) session.getAttribute("userid");
		int serviceid=Integer.parseInt(request.getParameter("serviceId"));
		ServiceDetailsDAOImpl userserv = new ServiceDetailsDAOImpl();
		ServiceDetails serv = new ServiceDetails(userid,serviceid);
		userserv.insert(serv);
		if(true)
		{
			response.sendRedirect("SearchUserFour.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(); 
		int userid =(int) session.getAttribute("userid");
		int serviceid=Integer.parseInt(request.getParameter("serviceId"));
		ServiceDetailsDAOImpl userserv = new ServiceDetailsDAOImpl();
		ServiceDetails serv = new ServiceDetails(userid,serviceid);
		userserv.insert(serv);
		if(true)
		{
			response.sendRedirect("SearchUserFour.jsp");
		}
	}
}
