package com.carserviceapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.CarPickUpDAOImpl;
import com.carserviceapp.model.CarPickUp;

@WebServlet("/pickuprequest")
public class PickUpForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
		 HttpSession session =request.getSession();
		int userid=Integer.parseInt(session.getAttribute("userid").toString());
		String name=request.getParameter("custname");
		String email=request.getParameter("custemail");
		Long mobileno = Long.parseLong(request.getParameter("custmob"));
		String address=request.getParameter("custaddress");
		int centerid=Integer.parseInt(request.getParameter("centerid"));
		CarPickUp obj1 = new CarPickUp(userid,name,email,mobileno,address,centerid);
		CarPickUpDAOImpl cust = new CarPickUpDAOImpl();
		int x =cust.insert(obj1);
		try {
			if(x==1)
			{
				response.sendRedirect("searchUserThree.jsp");
			}   
		} catch (IOException e) 
		{
			e.getCause();
		}		
	}

}
