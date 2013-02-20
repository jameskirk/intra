package com.uni.core.exception;

public class UniException extends Exception {
	
	private static final long serialVersionUID = -4554091750095252220L;

	private UniError error;
	
	public UniException(UniError error) {
		super();
		this.error = error;
	}

	public UniError getError() {
		return error;
	}

}
