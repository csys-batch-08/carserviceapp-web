package com.carserviceapp.dao;

import java.sql.ResultSet;
import java.util.List;

import com.carserviceapp.model.CenterDetails;

public interface CenterDetailsDAO
{
	public boolean insert(CenterDetails center);
	public List<CenterDetails> showview();
	public boolean delete(CenterDetails center);
	public boolean update(CenterDetails center);
}
