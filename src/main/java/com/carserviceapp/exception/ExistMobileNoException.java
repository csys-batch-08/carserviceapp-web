package com.carserviceapp.exception;

public class ExistMobileNoException  extends Exception
{
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage()
	{
		return "Entered mobileno is  already registered...";
	}
}
