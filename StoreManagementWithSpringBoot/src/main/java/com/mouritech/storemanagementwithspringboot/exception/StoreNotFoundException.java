package com.mouritech.storemanagementwithspringboot.exception;

public class StoreNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4398416117648755403L;
 
	public StoreNotFoundException(String msg) {
		
		super(msg);
		
	}
}
