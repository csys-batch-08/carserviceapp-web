package com.carserviceapp.exception;

public class UserIdNotFoundException extends Exception
{
	@Override
	public String getMessage()
	{
		return "Entered UserID not found in data's";
	}
}
