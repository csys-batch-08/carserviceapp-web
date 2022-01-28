package com.carserviceapp.dao;

import java.util.List;

import com.carserviceapp.model.CarCustomer;

public interface CarCustomerDAO 
{
	public boolean insert(CarCustomer user);
	public String fetch(CarCustomer userpasscheck);
	public List<CarCustomer> view(CarCustomer myaccount);
	public boolean update(CarCustomer user);
	public boolean delete(CarCustomer user);
	public List<CarCustomer> view();
	public String getEmail(CarCustomer email);
	public Long getMobile(CarCustomer mobile);
	public int fetchid(CarCustomer myaccount);
	public boolean forgotpassword(CarCustomer user);
	public int reactivate(CarCustomer user);
}
