package com.alta189.plug.exception;

public class InvalidPluginException extends Exception {
	public InvalidPluginException(String message) {
		super(message);
	}

	public InvalidPluginException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidPluginException(Throwable cause) {
		super(cause);
	}
}
