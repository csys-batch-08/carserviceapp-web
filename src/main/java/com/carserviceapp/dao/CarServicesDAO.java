package com.carserviceapp.dao;

import java.util.List;

import com.carserviceapp.model.CarServices;

public interface CarServicesDAO 
{
	public boolean insert(CarServices service);
	public boolean update(CarServices service);
	public boolean delete(CarServices service);
	public List<CarServices> view();
	public int checkserviceid(CarServices services);
	public List<CarServices> views();
}
