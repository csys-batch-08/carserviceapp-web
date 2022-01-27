package com.carserviceapp.servlet;

import java.io.IOException;
import java.sql.ResultSet;
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
import com.carserviceapp.model.CarPickUp;


@WebServlet("/MyOrdersOne")
public class MyOrdersOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		int userid=Integer.parseInt(session.getAttribute("userid").toString());
		BillDetails payment = new BillDetails(userid);
		BillDetailsDAOImpl dao1 = new BillDetailsDAOImpl();
		int bill_num=0;
		List<BillDetails> myordersone=null;
		try {
			bill_num=dao1.fetchbillnum(payment);
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		if(bill_num!=0)
		{
		session.setAttribute("bill_num",bill_num);
		int user_id=(int)(session.getAttribute("userid"));
		BillDetails obj1 = new BillDetails(user_id);
		BillDetailsDAOImpl cent = new BillDetailsDAOImpl();
		myordersone = cent.view(obj1);
		}	
		if (!myordersone.isEmpty())
		{
			request.setAttribute("myordersone",myordersone);
			RequestDispatcher rd=request.getRequestDispatcher("MyOrdersOne.jsp");
			rd.forward(request, response);
		}
	}

}
