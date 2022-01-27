package com.carserviceapp.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carserviceapp.daoimpl.BillDetailsDAOImpl;
import com.carserviceapp.daoimpl.CarPaymentDAOImpl;
import com.carserviceapp.daoimpl.CarPickUpDAOImpl;
import com.carserviceapp.model.BillDetails;
import com.carserviceapp.model.CarPayment;
import com.carserviceapp.model.CarPickUp;


@WebServlet("/paymentpage")
public class PaymentPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 HttpSession session =request.getSession();
		try
		{
		 int userid=Integer.parseInt(session.getAttribute("userid").toString());
		 
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
			int billnum1=Integer.parseInt(session.getAttribute("bill_num").toString());
			long cardno=Long.parseLong(request.getParameter("cardnum"));
			String holdername=request.getParameter("holdername");
				String dateStr = request.getParameter("expdate");
				Date date = null;
			    date = sdf.parse(dateStr);
			int cvvno=Integer.parseInt(request.getParameter("cvvno"));
			
			int amountpaid=Integer.parseInt(request.getParameter("amountpaid"));
			CarPayment obj1 = new CarPayment(billnum1,cardno,holdername,date,cvvno,amountpaid);
			CarPaymentDAOImpl cust = new CarPaymentDAOImpl();
			int x=cust.insert(obj1);
				if(x==1)
				{
					BillDetailsDAOImpl bdao = new BillDetailsDAOImpl();
					BillDetails pay = new BillDetails(userid);
					bdao.updatestatus(pay);
					CarPickUpDAOImpl cdao = new CarPickUpDAOImpl();
					double a=15.55;
					CarPickUp picker = new CarPickUp(userid,a);
					cdao.updatepickupstatus(picker);
					response.sendRedirect("UserThanksPage.jsp");
				} 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 } 
}
