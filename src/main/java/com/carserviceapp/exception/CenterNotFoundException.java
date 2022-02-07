package com.carserviceapp.exception;

public class CenterNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Entered Center not found in data";
	}
}
