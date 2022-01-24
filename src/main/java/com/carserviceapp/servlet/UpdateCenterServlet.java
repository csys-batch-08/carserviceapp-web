package com.carserviceapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CarServicesDAOImpl;
import com.carserviceapp.daoimpl.CenterDetailsDAOImpl;
import com.carserviceapp.exception.CenterNotFoundException;
import com.carserviceapp.model.CarServices;
import com.carserviceapp.model.CenterDetails;

/**
 * Servlet implementation class UpdateCenterServlet
 */
@WebServlet("/updatecontact")
public class UpdateCenterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCenterServlet() {
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
		  int centerid=Integer.parseInt(request.getParameter("centerid"));
		  long centercontact = Long.parseLong(request.getParameter("updatecentercontact"));
		   CenterDetails obj1 = new CenterDetails(centerid,centercontact);
		   CenterDetailsDAOImpl cent = new CenterDetailsDAOImpl();
			 boolean flag = cent.update(obj1);
			 if(flag)
			 {
				  session.setAttribute("updatecenter", true);
			       response.sendRedirect("AdminPage.jsp");
			 }
			 else {
				 try
				 {
					 throw new CenterNotFoundException();
				 }
				 catch(CenterNotFoundException e)
				 {
					String invalidservice =e.getMessage();
					response.sendRedirect("UserPageWarn.jsp?message="+e.getMessage()+"&url=DeleteServiceCenter.jsp");
				 }	
			 }
	}

}
