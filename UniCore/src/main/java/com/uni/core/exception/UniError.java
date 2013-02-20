package com.uni.core.exception;

public enum UniError {
	
	/** joined object not found
	 * for example, cannot add student to group, group not exist */
	ES001,
	
	/** object is busy,
	 * for example student already study */
	ES002,
	
	/**
	 * account already register
	 */
	EU001,
	
	/**
	 * dao trouble
	 */
	ED001
}
