package com.rohan.lego.exception;

public class DataAccessException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;
	private Throwable cause;

	public DataAccessException() {

		super();
	}

	public DataAccessException(String message) {

		super(message);
		this.message = message;
	}

	public DataAccessException(String message, Throwable cause) {

		super(message, cause);
		this.message = message;
		this.cause = cause;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getCause() {
		return cause;
	}
}
