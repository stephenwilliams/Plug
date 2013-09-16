package com.alta189.plug.exception;

public class InvalidDescriptionException extends Exception {
	public InvalidDescriptionException(String message) {
		super(message);
	}

	public InvalidDescriptionException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidDescriptionException(Throwable cause) {
		super(cause);
	}
}
