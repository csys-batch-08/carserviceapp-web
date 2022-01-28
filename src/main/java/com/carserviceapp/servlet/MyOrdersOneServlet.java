package com.carserviceapp.servlet;

import java.io.IOException;
import java.sql.SQLException;
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


@WebServlet("/MyOrdersOne")
public class MyOrdersOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		int userid=Integer.parseInt(session.getAttribute("userid").toString());
		System.out.println(userid);
		BillDetails payment = new BillDetails(userid);
		BillDetailsDAOImpl dao1 = new BillDetailsDAOImpl();
		int billnum=0;
		List<BillDetails> myordersone=null;
		billnum=dao1.fetchbillnum(payment);
		if(billnum!=0)
		{
		session.setAttribute("bill_num",billnum);
		BillDetails obj1 = new BillDetails(userid);
		BillDetailsDAOImpl cent = new BillDetailsDAOImpl();
		myordersone = cent.view(obj1);
		}	
			request.setAttribute("myordersone",myordersone);
			RequestDispatcher rd=request.getRequestDispatcher("myOrdersOne.jsp");
			rd.forward(request, response);
	}

}
