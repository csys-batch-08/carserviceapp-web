package com.carserviceapp.dao;

import java.sql.ResultSet;
import java.util.List;

import com.carserviceapp.model.BillDetails;

public interface BillDetailsDAO
{
	public int insert(BillDetails bill);
	public boolean update(BillDetails bill);
	public ResultSet view(BillDetails billPojo);
	public int view1(BillDetails billpojo1);
	public boolean fetch(BillDetails checkamount);
	public ResultSet adminview();
	public boolean updatestatus(BillDetails bill);
}
