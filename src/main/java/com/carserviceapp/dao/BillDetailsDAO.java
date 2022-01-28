package com.carserviceapp.dao;

import java.util.List;

import com.carserviceapp.model.BillDetails;

public interface BillDetailsDAO
{
	public int insert(BillDetails bill);
	public boolean update(BillDetails bill);
	public List<BillDetails> view(BillDetails billPojo);
	public List<BillDetails> pendingview(BillDetails billPojo);
	public int view1(BillDetails billpojo1);
	public boolean fetch(BillDetails checkamount);
	public int fetchbillnum(BillDetails payment);
	public List<BillDetails> adminview();
	public boolean updatestatus(BillDetails bill);
}
