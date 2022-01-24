package com.carserviceapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.BillDetailsDAOImpl;
import com.carserviceapp.exception.CenterNotFoundException;
import com.carserviceapp.exception.UserIdNotFoundException;
import com.carserviceapp.model.BillDetails;

/**
 * Servlet implementation class AddBill
 */
@WebServlet("/addbill")
public class AddBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBill() {
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
		int userid = Integer.parseInt(request.getParameter("userid"));
		String date =request.getParameter("servdate");
		System.out.println(date);
		LocalDate servdate = null;
		servdate = LocalDate.parse(date);
		System.out.println(servdate);
		BillDetails c1 = new BillDetails(userid,servdate,userid);
        BillDetailsDAOImpl cDao = new BillDetailsDAOImpl();
        int l=cDao.insert(c1);  
        if(l==1)
		 {
			  session.setAttribute("addbill",true);
		       response.sendRedirect("AdminPage.jsp");
		  }
        else {
			 try
			 {
				 throw new UserIdNotFoundException();
			 }
			 catch(UserIdNotFoundException e)
			 {
				String invaliduserid =e.getMessage();
				response.sendRedirect("UserPageWarn.jsp?message="+e.getMessage()+"&url=AddBill.jsp");
			 }	
		 }
	}

}
