package com.carserviceapp.exception;

public class CenterNotFoundException extends Exception
{
	@Override
	public String getMessage()
	{
		return "Entered Center not found in data's";
	}
}
