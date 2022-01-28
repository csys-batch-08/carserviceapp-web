package com.carserviceapp.exception;

public class ExistEmailIdException  extends Exception
{
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage()
	{
		return "Entered MailID is  already registered...";
	}
}
