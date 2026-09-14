package com.student.management.system.oop;

public class PaymentRunner {

	public static void main(String[] args) {
		Payable p = new TuitionFee(30000,5000,3000);
		p.processPayment(PaymentMode.CASH);
		p.calculatePayment();
		p.generateReceipt();
		System.out.println(p.discountValue());
		
		Payable p1 = new SportsActivityFee(5000,3000,2000,1000);
		p1.processPayment(PaymentMode.CARD);
		p1.calculatePayment();
		p1.generateReceipt();
		System.out.println(p1.discountValue());
		
		Payable p2 = new TransportFee(1000,12,500);
		p2.processPayment(PaymentMode.CARD);
		p2.calculatePayment();
		p2.generateReceipt();
		System.out.println(p2.discountValue());
		
		Payable p3 = new LibraryFee(500,200,100);
		p3.processPayment(PaymentMode.UPI);
		p3.calculatePayment();
		p3.generateReceipt();
		System.out.println(p3.discountValue());
	}

}
