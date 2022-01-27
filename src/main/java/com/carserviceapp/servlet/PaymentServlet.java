package com.carserviceapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.BillDetailsDAOImpl;
import com.carserviceapp.model.BillDetails;

/**
 * Servlet implementation class PaymentServlet
 */
@WebServlet("/Payment")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   {
	   HttpSession session =request.getSession();
	   int userid=Integer.parseInt(session.getAttribute("userid").toString());
	   int billnum1=Integer.parseInt(session.getAttribute("bill_num").toString());
		  int amount; 
	      BillDetailsDAOImpl bDao = new BillDetailsDAOImpl(); 
	      String dummy="23";
	      BillDetails billpay = new BillDetails(userid,billnum1,dummy);	 
	      amount=bDao.view1(billpay);	  
	      request.setAttribute("amount",amount);
	      RequestDispatcher rd=request.getRequestDispatcher("PaymentOne.jsp");
	      rd.forward(request, response);
	}

}
