package com.carserviceapp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CarCustomerDAOImpl;
import com.carserviceapp.model.BillDetails;
import com.carserviceapp.model.CarCustomer;

/**
 * Servlet implementation class UserAccountServlet
 */
@WebServlet("/UserAccount")
public class UserAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	HttpSession session=request.getSession();
        String user_name=session.getAttribute("username").toString();
        String user_pass=session.getAttribute("password").toString();
        CarCustomer myaccount = new CarCustomer(user_name,user_pass);
        CarCustomerDAOImpl cust = new CarCustomerDAOImpl();
        List<CarCustomer> myprofile=null;
        myprofile = cust.view(myaccount);
        request.setAttribute("myprofile",myprofile);
		RequestDispatcher rd=request.getRequestDispatcher("UserAccount.jsp");
		rd.forward(request, response);
	}

}
