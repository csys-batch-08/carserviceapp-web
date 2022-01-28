package com.carserviceapp.exception;

public class ServiceNotFoundException extends Exception 
{
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage()
	{
		return "Entered ServiceID not found in data's";
	}
}
