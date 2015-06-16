package com.mum.eriplaza.exception;

public class InvalidOrderException extends RuntimeException{
	
	private long orderId;

	public InvalidOrderException(long orderId) {
		super();
		this.orderId = orderId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	
}
