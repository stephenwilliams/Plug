package com.alta189.plug.exception;

public class UnknownDependencyException extends Exception {
	public UnknownDependencyException(String message) {
		super(message);
	}

	public UnknownDependencyException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnknownDependencyException(Throwable cause) {
		super(cause);
	}
}
