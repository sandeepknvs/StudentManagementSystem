package com.Builder;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Emp e1 = new Emp("Sandeep",101,1500);
		//System.out.println(e1);
		Emp e2 = new Emp.Builder().empId(1).name("Sandeep").salary(12555).build();
		System.out.println(e2);
	}
	
	

}
