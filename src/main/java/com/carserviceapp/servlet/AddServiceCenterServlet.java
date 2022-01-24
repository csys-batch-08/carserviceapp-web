package com.carserviceapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CarCustomerDAOImpl;
import com.carserviceapp.daoimpl.CenterDetailsDAOImpl;
import com.carserviceapp.model.CarCustomer;
import com.carserviceapp.model.CenterDetails;

/**
 * Servlet implementation class AddServiceCenter
 */
@WebServlet("/centerdetail")
public class AddServiceCenterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServiceCenterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    HttpSession session =request.getSession();
		   int userid=Integer.parseInt(session.getAttribute("userid").toString());
		   String centername = request.getParameter("centername");
		   String centerlocation = request.getParameter("centerlocation");
		   long centercontact = Long.parseLong(request.getParameter("centercontact"));
		   String centeremail=request.getParameter("centeremail");
		   String centeraddress=request.getParameter("centeraddress");
		   System.out.println(centeraddress);
		   String dummy=" ";
		   CenterDetails obj1 = new CenterDetails(userid,centername,centerlocation,centercontact,centeremail,centeraddress,dummy);
		   CenterDetailsDAOImpl cent = new CenterDetailsDAOImpl();
		   cent.insert(obj1);
		   if(true)
		   {
			   response.sendRedirect("AdminPage.jsp");
		   }
	}

}
