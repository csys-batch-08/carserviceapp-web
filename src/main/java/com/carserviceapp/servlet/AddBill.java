package com.carserviceapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.BillDetailsDAOImpl;
import com.carserviceapp.exception.UserIdNotFoundException;
import com.carserviceapp.model.BillDetails;

@WebServlet("/addbill")
public class AddBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session =request.getSession();
		 PrintWriter writer=response.getWriter();
		int userid = Integer.parseInt(request.getParameter("userid"));
		String date =request.getParameter("servdate");
		LocalDate servdate = null;
		servdate = LocalDate.parse(date);
		BillDetails c1 = new BillDetails(userid,servdate,userid);
        BillDetailsDAOImpl cDao = new BillDetailsDAOImpl();
        int l=cDao.insert(c1);  
        if(l==1)
		 {   
			      writer.print("<script type=\"text/javascript\"> alert('Bill is Generated'); window.location = 'adminPage.jsp';</script>");
		  }
        else {
			 try
			 {
				 throw new UserIdNotFoundException();
			 }
			 catch(UserIdNotFoundException e)
			 {
				response.sendRedirect("UserPageWarn?message="+e.getMessage()+"&url=addBill.jsp");
			 }	
		 }
	}

}
