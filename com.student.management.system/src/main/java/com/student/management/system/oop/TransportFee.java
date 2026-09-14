package com.student.management.system.oop;

public class TransportFee implements Payable {
	private final double baseFee;
	private final int paymentMonths;
	private final double siblingDiscount;
	private double totalTransportFee;
	
	public TransportFee(double baseFee, int paymentMonths, double siblingDiscount) {
		super();
		this.baseFee = baseFee;
		this.paymentMonths = paymentMonths;
		this.siblingDiscount = siblingDiscount;
	}

	@Override
	public double calculatePayment() {
		totalTransportFee = (baseFee * paymentMonths) - siblingDiscount;
		return totalTransportFee;
	
	}

	
	@Override
	public void generateReceipt() {
		System.out.println("****Generating TransportFees Receipt****");
		System.out.println("BASE FEE : "+baseFee);
		System.out.println("MONTHS : "+paymentMonths);
		System.out.println("SIBLINGS DISCOUNT: -"+siblingDiscount);
		System.out.println("Final Transprt Fees : "+totalTransportFee);
		System.out.println("****Good Day****");	
		
	}

	@Override
	public double discountValue() {
		// TODO Auto-generated method stub
		return siblingDiscount;
	}
	
	
	
	
}
