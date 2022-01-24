package com.carserviceapp.exception;

public class ExistMobileNoException  extends Exception
{
	@Override
	public String getMessage()
	{
		return "Entered mobileno is  already registered...";
	}
}
