package com.carserviceapp.dao;

import java.util.List;

import com.carserviceapp.model.CenterDetails;

public interface CenterDetailsDAO
{
	public boolean insert(CenterDetails center);
	public List<CenterDetails> showview();
	public List<CenterDetails> showsview();
	public int checkservicecenterid(CenterDetails center);
	public boolean delete(CenterDetails center);
	public boolean update(CenterDetails center);
}
