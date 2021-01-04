package com.ex.demo.error;

public class ErrorType {
	private int status;
	private String message;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErrorType(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

}
