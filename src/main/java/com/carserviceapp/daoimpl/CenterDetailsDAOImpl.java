package com.carserviceapp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.carserviceapp.dao.CenterDetailsDAO;
import com.carserviceapp.model.CenterDetails;
import com.carserviceapp.util.ConnectionUtil;

public class CenterDetailsDAOImpl implements CenterDetailsDAO {
	private static final String CENTERID = "center_id";

	@Override
	public boolean insert(CenterDetails center) {
		String insertQuery = "insert into service_center(user_id,center_name,c_location,c_contact,c_email,c_address) values(?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		int i = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(insertQuery);
			stmt.setInt(1, center.getUserId());
			stmt.setString(2, center.getCenterName());
			stmt.setString(3, center.getCenterLocation());
			stmt.setLong(4, center.getCenterContact());
			stmt.setString(5, center.getCenterEmail());
			stmt.setString(6, center.getCenterAddress());
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
	public List<CenterDetails> showview() {

		String showQuery = "select center_id,center_name,c_location,c_contact,c_email,c_address from service_center where status='active'";
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement stmt = null;
		List<CenterDetails> centerlist = new ArrayList<>();
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(showQuery);
			rs = stmt.executeQuery(showQuery);
			while (rs.next()) {
				CenterDetails pickup = new CenterDetails(rs.getInt(CENTERID), rs.getString("center_name"),
						rs.getString("c_location"), rs.getLong("c_contact"), rs.getString("c_email"),
						rs.getString("c_address"));
				centerlist.add(pickup);
			}
		} catch (Exception e1) {
			e1.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return centerlist;
	}

	@Override
	public List<CenterDetails> showsview() {
		String showQuery = "select center_id,center_name,c_location,c_contact,c_email,c_address from service_center where status='active'";
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement stmt = null;
		List<CenterDetails> centerlist = new ArrayList<>();
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(showQuery);
			rs = stmt.executeQuery(showQuery);
			while (rs.next()) {
				CenterDetails customer = new CenterDetails(rs.getInt(CENTERID), rs.getString("center_name"),
						rs.getString("c_location"), rs.getLong("c_contact"), rs.getString("c_email"),
						rs.getString("c_address"));
				centerlist.add(customer);
			}
		} catch (Exception e1) {
			e1.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return centerlist;
	}

	@Override
	public int checkservicecenterid(CenterDetails center) {
		String query = "select center_id,user_id,center_name,c_location,c_contact,c_email,c_address,status from service_center where center_id in ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int centerid = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, center.getCenterId());
			rs = stmt.executeQuery();
			while (rs.next()) {
				centerid = rs.getInt(CENTERID);
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return centerid;
	}

	@Override
	public boolean delete(CenterDetails center) {
		String deleteQuery = "update service_center set status='inactive' where center_id=?";
		Connection con = null;
		PreparedStatement stmt = null;
		int k = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(deleteQuery);
			stmt.setInt(1, center.getCenterId());
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

	@Override
	public boolean update(CenterDetails center) {
		String deleteQuery = "update service_center set c_contact=? where center_id=?";
		Connection con = null;
		PreparedStatement stmt = null;
		int l = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(deleteQuery);
			stmt.setLong(1, center.getCenterContact());
			stmt.setInt(2, center.getCenterId());
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
}
