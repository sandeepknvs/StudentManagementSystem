package com.Builder;

public class Emp {
	private final String name;
	private final double salary;
	private final int empId;
	
	private Emp(String name, double salary, int empId) {
		super();
		this.name = name;
		this.salary = salary;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	

	public double getSalary() {
		return salary;
	}

	

	public int getEmpId() {
		return empId;
	}

	

	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", empId=" + empId + "]";
	}
	
	public static class Builder{
		private String name;
		private double salary;
		private int empId;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder empId(int empId) {
			this.empId = empId;
			return this;
		}
		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}
		
		public Emp build()
		{
			Emp e1 = new Emp(name,salary,empId);
			return e1;
		}
	}
	
	
}
