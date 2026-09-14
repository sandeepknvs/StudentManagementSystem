package com.student.management.system.oop;

public class SportsActivityFee implements Payable {
	private final double equipmentCharges;
	private final double tournamentFees;
	private final double teamUnifromCosts;
	private final double discountForStatePlayer;
	private double finalFeesAmount;
	
	
	
	public SportsActivityFee(double equipmentCharges, double tournamentFees, double teamUnifromCosts,
			double discountForStatePlayer) {
		super();
		this.equipmentCharges = equipmentCharges;
		this.tournamentFees = tournamentFees;
		this.teamUnifromCosts = teamUnifromCosts;
		this.discountForStatePlayer = discountForStatePlayer;
	}
	
	@Override
	public double calculatePayment() {
		finalFeesAmount = equipmentCharges + tournamentFees + teamUnifromCosts - discountForStatePlayer;
		return finalFeesAmount;
	}
	
	@Override
	public void generateReceipt() {
		System.out.println("****Generating SportsFees Receipt****");
		System.out.println("Equipment Charges : "+equipmentCharges);
		System.out.println("Tournamen Fees : "+tournamentFees);
		System.out.println("Team Uniform : "+teamUnifromCosts);
		System.out.println("Discount For State Player : -"+discountForStatePlayer);
		System.out.println("Final Fees : "+finalFeesAmount);
		System.out.println("****Good Day****");	
	}
	@Override
	public double discountValue() {
		return discountForStatePlayer;
	}
	
	
	
}
