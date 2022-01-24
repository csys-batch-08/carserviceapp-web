package com.carserviceapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carserviceapp.daoimpl.CarServicesDAOImpl;
import com.carserviceapp.daoimpl.CenterDetailsDAOImpl;
import com.carserviceapp.model.CarServices;
import com.carserviceapp.model.CenterDetails;

/**
 * Servlet implementation class addservices
 */
@WebServlet("/servicedetail")
public class AddServicesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServicesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		   String servicename = request.getParameter("servname");
		   int servicecost=Integer.parseInt(request.getParameter("servcost"));  
		   String servicedesc = request.getParameter("servdesc");
		   CarServices obj1 = new CarServices(servicename,servicecost,servicedesc);
		   CarServicesDAOImpl cent = new CarServicesDAOImpl();
		   boolean a =cent.insert(obj1);
		   if(true)
		   {
			   response.sendRedirect("AdminPage.jsp");
		   }
	}

}
