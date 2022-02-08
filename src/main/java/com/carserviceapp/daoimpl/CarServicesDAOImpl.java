package com.carserviceapp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.carserviceapp.dao.CarServicesDAO;
import com.carserviceapp.model.CarServices;
import com.carserviceapp.util.ConnectionUtil;

public class CarServicesDAOImpl implements CarServicesDAO {
	private static final String SERVICEID = "service_id";

	@Override
	public boolean insert(CarServices service) {
		String insertQuery = "insert into services(service_name,service_cost,service_desc) values(?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		int i = 0;
		try {
			con = ConnectionUtil.getDBconnection();

			stmt = con.prepareStatement(insertQuery);
			stmt.setString(1, service.getServiceName());
			stmt.setInt(2, service.getServiceCost());
			stmt.setString(3, service.getServiceDesc());
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
	public boolean update(CarServices service) {
		String updateQuery = "update services set service_cost=? where service_id=?";
		Connection con = null;
		PreparedStatement stmt = null;
		int k = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(updateQuery);
			stmt.setInt(1, service.getServiceCost());
			stmt.setInt(2, service.getServiceId());
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
	public boolean delete(CarServices service) {
		int l = 0;
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			String deleteQuery = "update services set status='inactive' where service_id=?";
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(deleteQuery);
			stmt.setInt(1, service.getServiceId());
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

	@Override
	public int checkserviceid(CarServices services) {
		String query = "select service_id,service_name,service_cost,service_desc from services where service_id=?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rsone = null;
		int serviceid = 0;
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, services.getServiceId());
			rsone = stmt.executeQuery();
			while (rsone.next()) {
				serviceid = rsone.getInt(SERVICEID);
			}
		} catch (Exception e) {
			e.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return serviceid;
	}

	@Override
	public List<CarServices> view() {
		ResultSet rstwo = null;
		String showQuery = "select service_name,service_cost,service_desc,service_id from services where status='active'";
		Connection con = null;
		PreparedStatement stmt = null;
		List<CarServices> servicelist = new ArrayList<>();
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(showQuery);
			rstwo = stmt.executeQuery(showQuery);
			while (rstwo.next()) {
				CarServices pickup = new CarServices(rstwo.getString("service_name"), rstwo.getInt("service_cost"),
						rstwo.getString("service_desc"), rstwo.getInt(SERVICEID));
				servicelist.add(pickup);
			}
		} catch (Exception e1) {
			e1.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return servicelist;
	}

	@Override
	public List<CarServices> views() {
		ResultSet rsthree = null;
		String showQueryOne = "select service_name,service_cost,service_desc,service_id from services where status='active'";
		Connection con = null;
		PreparedStatement stmt = null;
		List<CarServices> servicelist = new ArrayList<>();
		try {
			con = ConnectionUtil.getDBconnection();
			stmt = con.prepareStatement(showQueryOne);
			rsthree = stmt.executeQuery(showQueryOne);
			while (rsthree.next()) {
				CarServices services = new CarServices(rsthree.getString("service_name"),
						rsthree.getInt("service_cost"), rsthree.getString("service_desc"), rsthree.getInt(SERVICEID));
				servicelist.add(services);
			}
		} catch (Exception e1) {
			e1.getCause();
		} finally {
			ConnectionUtil.closePreparedStatement(stmt, con);
		}
		return servicelist;
	}
}
