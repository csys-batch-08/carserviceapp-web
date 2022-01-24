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
import com.carserviceapp.daoimpl.CenterDetailsDAOImpl;
import com.carserviceapp.exception.ServiceNotFoundException;
import com.carserviceapp.model.CarServices;
import com.carserviceapp.model.CenterDetails;

/**
 * Servlet implementation class DeleteService
 */
@WebServlet("/deleteservice")
public class DeleteService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteService() {
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
		 HttpSession session =request.getSession();
		int serviceid = Integer.parseInt(request.getParameter("serviceid"));
		CarServices obj1 = new CarServices(serviceid);
		CarServicesDAOImpl cent = new CarServicesDAOImpl();
		ResultSet rs = cent.checkserviceid(obj1);
		 try {
			if(rs.next())
			 {
				CarServices obj2 = new CarServices(serviceid);
				CarServicesDAOImpl cent2 = new CarServicesDAOImpl();
				  boolean flag = cent2.delete(obj2);
				  session.setAttribute("deleteservice", true);
			      response.sendRedirect("AdminPage.jsp");
			 }
			 else
			 {
				 try
				 {
					 throw new ServiceNotFoundException();
				 }
				 catch(ServiceNotFoundException e)
				 {
					String invalidservice =e.getMessage();
					response.sendRedirect("UserPageWarn.jsp?message="+e.getMessage()+"&url=DeleteService.jsp");
				 }			 
			 }
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
