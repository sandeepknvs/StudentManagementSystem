package com.student.management.system.oop;

public class LibraryFee implements Payable {
	public final double finalSubscripton;
	public final double additionalBookCharges;
	public final double lateReturnPenalties;
	public double totalLibraryFee;
	
	public LibraryFee(double finalSubscripton, double additionalBookCharges, double lateReturnPenalties) {
		super();
		this.finalSubscripton = finalSubscripton;
		this.additionalBookCharges = additionalBookCharges;
		this.lateReturnPenalties = lateReturnPenalties;
	}

	@Override
	public double calculatePayment() {
		totalLibraryFee = finalSubscripton + additionalBookCharges + lateReturnPenalties;
		return totalLibraryFee;
	}

	

	@Override
	public void generateReceipt() {
		System.out.println("****Generating LibraryFees Receipt****");
		System.out.println("Subscription Charges : "+finalSubscripton);
		System.out.println("Additional Book Charges : "+additionalBookCharges);
		System.out.println("Late Return Penalty : "+lateReturnPenalties);
		System.out.println("Final Fees : "+totalLibraryFee);
		System.out.println("****Good Day****");	
		
	}

	@Override
	public double discountValue() {
		return 0;
	}
	
	
	
	
	
}
