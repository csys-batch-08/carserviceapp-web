package com.carserviceapp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.carserviceapp.dao.BillDetailsDAO;
import com.carserviceapp.model.BillDetails;
import com.carserviceapp.util.ConnectionUtil;

public class BillDetailsDAOImpl implements BillDetailsDAO {
	private static final String BILLNUM = "bill_num";
	private static final String AMOUNT = "amount";
	private static final String STATUS = "status";
	private static final String SERVDATE = "serv_date";

	@Override
	public int insert(BillDetails bill) {
		String insertQuery = "insert into bill(user_id,serv_date,amount) values (?,?,(SELECT sum(service_cost) from services where service_id in (select service_id from service_details where user_id in ?)))";
		Connection con = null;
		int i = 0;
		PreparedStatement stmt = null;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(insertQuery);
			stmt.setInt(1, bill.getUserId());
			stmt.setString(2, (bill.getServDate()));
			stmt.setInt(3, bill.getUserId());
			i = stmt.executeUpdate();
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return i;
	}

	@Override
	public boolean update(BillDetails bill) {
		String updateQuery = "update bill set amount=? where bill_num=?";
		Connection con = null;
		PreparedStatement stmt = null;
		int k = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(updateQuery);
			stmt.setInt(1, bill.getAmount());
			stmt.setInt(2, bill.getBillNum());
			k = stmt.executeUpdate();
			if (k > 0) {
				return true;
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return false;
	}

	// user myorder option yes
	@Override
	public List<BillDetails> view(BillDetails billPojo) {
		String showQuery = "select bill_num,serv_date,amount,status from bill where user_id in ? and status like 'processing'";
		Connection con = null;
		ResultSet rsone = null;
		PreparedStatement stmt = null;
		List<BillDetails> orderslist = new ArrayList<>();
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(showQuery);
			stmt.setInt(1, billPojo.getUserId());
			rsone = stmt.executeQuery();
			while (rsone.next()) {
				BillDetails customer = new BillDetails(rsone.getInt(BILLNUM), rsone.getDate(SERVDATE).toLocalDate(),
						rsone.getInt(AMOUNT), rsone.getString(STATUS));
				orderslist.add(customer);
			}
		} catch (Exception e1) {
			e1.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return orderslist;
	}

	// user myorders option no
	@Override
	public List<BillDetails> pendingview(BillDetails billPojo) {
		String showQueryOne = "select bill_num,serv_date,amount,status from bill where user_id in ? and status like 'paid'";

		Connection con = null;
		ResultSet rstwo = null;
		PreparedStatement stmt = null;
		List<BillDetails> orderslist = new ArrayList<>();
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(showQueryOne);
			stmt.setInt(1, billPojo.getUserId());
			rstwo = stmt.executeQuery();
			while (rstwo.next()) {
				BillDetails customer = new BillDetails(rstwo.getInt(BILLNUM), rstwo.getDate(SERVDATE).toLocalDate(),
						rstwo.getInt(AMOUNT), rstwo.getString(STATUS));
				orderslist.add(customer);
			}
		} catch (Exception e1) {
			e1.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return orderslist;
	}

	// after payment option
	@Override
	public int view1(BillDetails billpojo1) {
		String showQueryTwo = "select amount from bill where user_id in ? and bill_num in ?";
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(showQueryTwo);
			stmt.setInt(1, billpojo1.getUserId());
			stmt.setInt(2, billpojo1.getBillNum());
			rs = stmt.executeQuery();
			while (rs.next()) {
				return rs.getInt(AMOUNT);
			}
		} catch (Exception e1) {
			e1.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return 0;
	}

	@Override
	public boolean fetch(BillDetails checkamount) {
		String query = "select bill_num,user_id,serv_date,amount,status from bill where bill_num in ? and amount in ?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConnectionUtil.getDBconnection();

			stmt = con.prepareStatement(query);
			stmt.setInt(1, checkamount.getBillNum());
			stmt.setInt(2, checkamount.getAmount());
			ResultSet rs = null;
			rs = stmt.executeQuery();
			while (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return false;
	}

	// for payment to get bill num
	@Override
	public int fetchbillnum(BillDetails payment) {
		String queryOne = "select bill_num from bill where user_id  in ? and status='processing'";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int i = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(queryOne);
			stmt.setInt(1, payment.getUserId());
			rs = stmt.executeQuery();
			if (rs.next()) {
				i = rs.getInt(BILLNUM);
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return i;
	}

	@Override
	public List<BillDetails> adminview() {
		String showQueryThree = "select bill_num,user_id,serv_date,amount,status from bill order by serv_date desc";
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;
		List<BillDetails> billlist = new ArrayList<>();
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(showQueryThree);
			rs = stmt.executeQuery();
			while (rs.next()) {
				BillDetails bills = new BillDetails(rs.getInt(BILLNUM), rs.getInt("user_id"),
						rs.getDate(SERVDATE).toLocalDate(), rs.getInt(AMOUNT), rs.getString(STATUS));
				billlist.add(bills);
			}
		} catch (Exception e1) {
			e1.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return billlist;
	}

	@Override
	public boolean updatestatus(BillDetails bill) {
		String updateQueryOne = "update bill set status='paid' where user_id=?";
		Connection con = null;
		PreparedStatement stmt = null;
		int k = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(updateQueryOne);
			stmt.setInt(1, bill.getUserId());
			k = stmt.executeUpdate();
			if (k > 0) {
				return true;
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return false;
	}
}
