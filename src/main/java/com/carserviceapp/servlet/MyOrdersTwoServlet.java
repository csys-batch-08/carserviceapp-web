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

import com.carserviceapp.daoimpl.BillDetailsDAOImpl;
import com.carserviceapp.model.BillDetails;

@WebServlet("/MyOrdersTwo")
public class MyOrdersTwoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	List<BillDetails> myorderstwo=null;
    	HttpSession session=request.getSession();
    	int userid=(int)(session.getAttribute("userid"));
    	BillDetails obj1 = new BillDetails(userid);
    	BillDetailsDAOImpl cent = new BillDetailsDAOImpl();
    	myorderstwo= cent.pendingview(obj1);
    	System.out.println(myorderstwo);
			request.setAttribute("myorderstwo",myorderstwo);
			RequestDispatcher rd=request.getRequestDispatcher("myOrdersTwo.jsp");
			rd.forward(request, response);
	}
}
