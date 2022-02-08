package com.carserviceapp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.carserviceapp.dao.CarCustomerDAO;
import com.carserviceapp.model.CarCustomer;
import com.carserviceapp.util.ConnectionUtil;

public class CarCustomerDAOImpl implements CarCustomerDAO {
	private static final String USERID = "user_id";
	private static final String MOBNO = "mobileno";
	private static final String PASSWORD = "u_password";
	private static final String EMAIL = "u_email";

	@Override
	public boolean insert(CarCustomer user) {
		String insertQuery = "insert into userdetails(u_name,mobileno,u_password,u_email,u_address) values(?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		int i = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(insertQuery);
			stmt.setString(1, user.getName());
			stmt.setLong(2, user.getMobileNo());
			stmt.setString(3, user.getPassword());
			stmt.setString(4, user.getEmail());
			stmt.setString(5, user.getAddress());
			i = stmt.executeUpdate();
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return false;
	}

	@Override
	public String fetch(CarCustomer userpasscheck) {
		String query = "select u_name,u_password from userdetails where u_name in ? and u_password in ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(query);
			stmt.setString(1, userpasscheck.getName());
			stmt.setString(2, userpasscheck.getPassword());
			rs = stmt.executeQuery();
			if (rs.next()) {
				String query1 = "select usertype from userdetails where u_name in ?";
				pstmt = con.prepareStatement(query1);
				pstmt.setString(1, userpasscheck.getName());
				ResultSet rs1 = pstmt.executeQuery();
				rs1.next();
				return rs1.getString("usertype");
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
			ConnectionUtil.closePreparedStatementOne(pstmt);
		}
		return "incorrect";
	}

	// my account option in user profile
	@Override
	public List<CarCustomer> view(CarCustomer myaccount) {
		String query = "select user_id,u_name,mobileno,u_password,u_email,u_address from userdetails where u_name in ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<CarCustomer> custdetails = new ArrayList<>();
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(query);
			stmt.setString(1, myaccount.getName());
			rs = stmt.executeQuery();
			while (rs.next()) {
				CarCustomer customer = new CarCustomer(rs.getInt(USERID), rs.getString("u_name"), rs.getLong(MOBNO),
						rs.getString(PASSWORD), rs.getString(EMAIL), rs.getString("u_address"));
				custdetails.add(customer);
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return custdetails;
	}

	// email check
	@Override
	public String getEmail(CarCustomer email) {
		String query = "select user_id,u_name,mobileno,u_password,u_email,u_address,usertype from userdetails where u_email in ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String useremail = null;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(query);
			stmt.setString(1, email.getEmail());
			rs = stmt.executeQuery();
			while (rs.next()) {
				useremail = rs.getString(EMAIL);
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return useremail;
	}

	// mobile no check
	@Override
	public Long getMobile(CarCustomer mobile) {
		String query = "select user_id,u_name,mobileno,u_password,u_email,u_address,usertype from userdetails where mobileno in ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		long usermobile = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(query);
			stmt.setLong(1, mobile.getMobileNo());
			rs = stmt.executeQuery();
			while (rs.next()) {
				usermobile = rs.getLong(MOBNO);
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return usermobile;
	}

	@Override
	public int fetchid(CarCustomer myaccount) {
		String query = "select user_id from userdetails where u_name in ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int userid = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(query);
			stmt.setString(1, myaccount.getName());
			rs = stmt.executeQuery();
			while (rs.next()) {
				userid = rs.getInt(USERID);
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return userid;
	}

	@Override
	public boolean update(CarCustomer user) {
		String updateQuery = "update userdetails set u_password=? where user_id=?";
		Connection con = null;
		int k = 0;
		PreparedStatement stmt = null;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(updateQuery);
			stmt.setString(1, user.getPassword());
			stmt.setInt(2, user.getUserId());
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

	// forgot password
	@Override
	public boolean forgotpassword(CarCustomer user) {
		String updateQuery = "update userdetails set u_password=? where mobileno=?";
		Connection con = null;
		int k = 0;
		PreparedStatement stmt = null;
		try {
			con = ConnectionUtil.getDBconnection();

			stmt = con.prepareStatement(updateQuery);
			stmt.setString(1, user.getPassword());
			stmt.setLong(2, user.getMobileNo());
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

	// update usertype as invalid
	@Override
	public boolean delete(CarCustomer user) {
		String deleteQuery = "update userdetails set usertype='invalid' where mobileno=?";
		Connection con = null;
		PreparedStatement stmt = null;
		int l = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(deleteQuery);
			stmt.setLong(1, user.getMobileNo());
			l = stmt.executeUpdate();
			if (l > 0) {
				return true;
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return false;
	}

	// user account reactivate
	@Override
	public int reactivate(CarCustomer user) {
		String deleteQuery = "update userdetails set usertype='user' where u_name=? and u_password=?";
		Connection con = null;
		PreparedStatement stmt = null;
		int l = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(deleteQuery);
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getPassword());
			l = stmt.executeUpdate();
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return l;
	}

	@Override
	public List<CarCustomer> view() {
		ResultSet rs = null;
		String showQuery = "select u_name,mobileno,u_email,u_address,user_id from userdetails where usertype='user' or usertype='invalid' order by user_id";
		Connection con = null;
		PreparedStatement stmt = null;
		List<CarCustomer> custlist = new ArrayList<>();
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(showQuery);
			rs = stmt.executeQuery(showQuery);
			while (rs.next()) {
				CarCustomer customer = new CarCustomer(rs.getString("u_name"), rs.getLong(MOBNO), rs.getString(EMAIL),
						rs.getString("u_address"), rs.getInt(USERID));
				custlist.add(customer);
			}

		} catch (Exception e1) {
			e1.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return custlist;
	}
}
