package com.student.management.system.oop;

public class TuitionFee implements Payable{
	
	private final double baseFees;
	private final double scholarshipDeduction;
	private final double earlyPaymentDeduction;
	private double finalFeesAmount;
	
	

	public TuitionFee(double baseFees, double scholarshipDeduction, double earlyPaymentDeduction) {
		super();
		this.baseFees = baseFees;
		this.scholarshipDeduction = scholarshipDeduction;
		this.earlyPaymentDeduction = earlyPaymentDeduction;
	}

	@Override
	public double calculatePayment() {
		finalFeesAmount = baseFees-scholarshipDeduction-earlyPaymentDeduction;
		return finalFeesAmount;
	}

	

	@Override
	public void generateReceipt() {
		System.out.println("****Generating Fees Receipt****");
		System.out.println("Base Fees : "+baseFees);
		System.out.println("DEDUCTION OFFERED : -"+scholarshipDeduction);
		System.out.println("Early Discount : -"+earlyPaymentDeduction);
		System.out.println("Total Fees To Be Paid : "+finalFeesAmount);
		System.out.println("****Good Day****");
		
	}

	@Override
	public double discountValue() {
		return (scholarshipDeduction+earlyPaymentDeduction);
	}

}
