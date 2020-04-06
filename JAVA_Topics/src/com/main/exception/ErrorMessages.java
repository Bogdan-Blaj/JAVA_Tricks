package com.main.exception;

public enum ErrorMessages {
	
	INVALID_OPTION("Invalid option provided"),
	INVALID_FILE("There is no file");
	
	private String errorMessage;
	
	ErrorMessages(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
