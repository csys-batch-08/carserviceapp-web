package com.carserviceapp.exception;

public class UserIdNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Entered UserID not found in data";
	}
}
