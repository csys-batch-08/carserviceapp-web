package com.carserviceapp.exception;


public class InvalidUserException extends Exception
{
@Override
public String getMessage()
{
	return "Username and Password does not match try again";
}
}