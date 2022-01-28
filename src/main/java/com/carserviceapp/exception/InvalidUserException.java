package com.carserviceapp.exception;


public class InvalidUserException extends Exception
{
  private static final long serialVersionUID = 1L;
@Override
public String getMessage()
{
	return "Username and Password does not match try again";
}
}