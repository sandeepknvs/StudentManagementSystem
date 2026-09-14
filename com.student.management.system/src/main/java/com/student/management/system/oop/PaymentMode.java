package com.student.management.system.oop;

public enum PaymentMode {
	CASH("Payment via cash"), UPI("Gpay"), CARD("credit");
	
	private String description;
	private PaymentMode(String description)
	{
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	
}
