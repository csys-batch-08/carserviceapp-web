package com.carserviceapp.dao;

import java.sql.ResultSet;
import java.util.List;

import com.carserviceapp.model.CarPickUp;

public interface CarPickUpDAO 
{
	 public int insert(CarPickUp pickup) ;
	 public boolean update(CarPickUp pickup);
	 public boolean delete(CarPickUp pickup);
	 public List<CarPickUp> pickupview();
	 public List<CarPickUp> admincenterview(CarPickUp admincenter);
	 
}
