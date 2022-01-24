package com.carserviceapp.exception;

public class ServiceNotFoundException extends Exception 
{
	@Override
	public String getMessage()
	{
		return "Entered ServiceID not found in data's";
	}
}
