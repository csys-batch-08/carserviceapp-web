package com.carserviceapp.dao;

import java.sql.ResultSet;
import java.util.List;

import com.carserviceapp.model.CarCustomer;

public interface CarCustomerDAO 
{
	public boolean insert(CarCustomer user);
	public String fetch(CarCustomer userpasscheck);
	public ResultSet view(CarCustomer myaccount);
	public boolean update(CarCustomer user);
	public boolean delete(CarCustomer user);
	public List<CarCustomer> view();
}
