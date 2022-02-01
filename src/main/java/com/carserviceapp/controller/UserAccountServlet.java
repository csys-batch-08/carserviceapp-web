package com.carserviceapp.controller;

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
import com.carserviceapp.model.CarCustomer;

@WebServlet("/UserAccount")
public class UserAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	HttpSession session=request.getSession();
        String username=session.getAttribute("username").toString();
        String userpass=session.getAttribute("password").toString();
        CarCustomer myaccount = new CarCustomer(username,userpass);
        CarCustomerDAOImpl cust = new CarCustomerDAOImpl();
        List<CarCustomer> myprofile=null;
        myprofile = cust.view(myaccount);
        request.setAttribute("myprofile",myprofile);
		RequestDispatcher rd=request.getRequestDispatcher("userAccount.jsp");
		rd.forward(request, response);
	}

}
