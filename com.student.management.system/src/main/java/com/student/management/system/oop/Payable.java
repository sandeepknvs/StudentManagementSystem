package com.student.management.system.oop;

public interface Payable {
	public abstract double calculatePayment();
	public default boolean processPayment(PaymentMode paymentMode) {
		if(paymentMode == PaymentMode.CARD || paymentMode == PaymentMode.CARD || 
				paymentMode == PaymentMode.UPI)
		{
			System.out.println("Processing Payment...");
			System.out.println("Payment Successful");
			return true;
		}
		else
		{
			System.err.println("Smething went wrong!!!");
			return false;
		}
	}
	public abstract void generateReceipt();
	public abstract double discountValue();
}
