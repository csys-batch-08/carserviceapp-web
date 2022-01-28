package com.carserviceapp.dao;

import java.util.List;

import com.carserviceapp.model.ServiceDetails;

public interface ServiceDetailsDAO 
{
	public boolean insert(ServiceDetails details);
	public boolean delete(ServiceDetails service);
}
