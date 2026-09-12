package com.student.management.system.oop;

import java.util.Objects;

public class Student extends Person{
	
	private final int rollNumber;
	private final double marksObtainedInEnglish;
	private final double marksObtainedInMaths;
	private final double marksObtainedInScience;
	private String grade;
	private final double percentage;
	private final double totalMarks;
	private static int totalStudentCount;
	
	

	public Student(StudentBuilder studentBuilder)
	{
		super(studentBuilder.name,studentBuilder.age,studentBuilder.address,studentBuilder.contactNumber);
		this.rollNumber = studentBuilder.rollNumber;
		this.marksObtainedInEnglish = studentBuilder.marksObtainedInEnglish;
		this.marksObtainedInMaths = studentBuilder.marksObtainedInMaths;
		this.marksObtainedInScience = studentBuilder.marksObtainedInScience;
		totalMarks = calculateTotalMarks();
		percentage = calculatePercentage();
		grade = calculateGrade();
		totalStudentCount++;
	}
	
	

//	public Student(String name, int age, String contactNumber, String address, int rollNumber,
//			double marksObtainedInEnglish, double marksObtainedInMaths, double marksObtainedInScience) {
//		super(name, age, contactNumber, address);
//		if(validateAge(age) && validateRollNumber(rollNumber) && validateMarks(marksObtainedInScience) && validateMarks(marksObtainedInEnglish) && validateMarks(marksObtainedInMaths) && validateContactNumber(contactNumber) && validateAddress(address))
//		{
//		this.rollNumber = rollNumber;
//		this.marksObtainedInEnglish = marksObtainedInEnglish;
//		this.marksObtainedInMaths = marksObtainedInMaths;
//		this.marksObtainedInScience = marksObtainedInScience;
//		calculateTotalMarks();
//		calculatePercentage();
//		calculateGrade();
//		totalStudentCount++;
//		
//	}
//	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", marksObtainedInEnglish="
				+ marksObtainedInEnglish + ", marksObtainedInMaths=" + marksObtainedInMaths
				+ ", marksObtainedInScience=" + marksObtainedInScience + ", grade=" + grade + ", percentage="
				+ percentage + ", totalMarks=" + totalMarks + ", contactNumber=" + contactNumber + ", address="
				+ address + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(address, age, contactNumber, grade, marksObtainedInEnglish, marksObtainedInMaths,
				marksObtainedInScience, name, percentage, rollNumber, totalMarks);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(contactNumber, other.contactNumber) && Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(marksObtainedInEnglish) == Double
						.doubleToLongBits(other.marksObtainedInEnglish)
				&& Double.doubleToLongBits(marksObtainedInMaths) == Double.doubleToLongBits(other.marksObtainedInMaths)
				&& Double.doubleToLongBits(marksObtainedInScience) == Double
						.doubleToLongBits(other.marksObtainedInScience)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& rollNumber == other.rollNumber
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}



	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		if(validateContactNumber(contactNumber))
		{
			this.contactNumber = contactNumber;
		}
		
	}
	
	public boolean validateContactNumber(String contactNumber)
	{
		if(contactNumber != null && contactNumber.matches("\\d{10}"))
		{
			return true;
		}
		else 
		{	
			System.err.println("Not a Valid Contact Number");
			return false;
		}
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		if(validateAddress(address))
		{
			this.address = address;
		}
	}
	
	public boolean validateAddress(String address)
	{
		if(!address.isEmpty())
		{
			return true;
		}
		else
		{	System.err.println("Not a Valid Address");
			return false;
		}
	}


	public double calculatePercentage() {
		double percentage = totalMarks/3;
		return percentage;
	}
	
	public String calculateGrade()
	{
		String grade;
		if(totalMarks == 0)
		{
			grade = "Grade Cannot Be Calculated";
		}
		else
		{
			grade = GradePolicy.calculateGrade(percentage);
		}
		return grade;
	}

	public String getName() {
		return name;
	}
	public double getPercentage() {
		return percentage;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age > 10 && age < 21)
		{
			this.age = age;
		}
		else
		{
			System.out.println("Not a Valid Age");
		}
		
	}
	
	public boolean validateAge(int age)
	{
		if(age > 10 && age < 21)
		{
			return true;
		}
		else
		{
			System.err.println("Not a Valid Age");
			return false;
		}
	}
	public boolean validateRollNumber(int rollNumber)
	{
		if(rollNumber > 0)
		{
			return true;
		}
		else
		{
			System.err.println("Not a Valid RollNumber");
			return false;
		}
	}
	
	public boolean validateMarks(double marksForTheSubject)
	{
		if(marksForTheSubject< 0 || marksForTheSubject > 100)
		{
			System.err.println("Not a Valid Marks");
			return false;
		}
		else
		{
			return true;
		}
	}


	public int getRollNumber() {
		return rollNumber;
	}


	


	public double getMarksObtainedInEnglish() {
		
		return marksObtainedInEnglish;
	}


	


	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}


	


	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}


	


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public double calculateTotalMarks()
	{
		 double totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
		 return totalMarks;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("-----Student Info------");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("ContactNumber: "+contactNumber);
		System.out.println("Address: "+address);
		System.out.println("English Marks: "+marksObtainedInEnglish);
		System.out.println("Science Marks: "+marksObtainedInScience);
		System.out.println("Maths Marks: "+marksObtainedInMaths);
		System.out.println("----------------------");
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Total Percentage: "+percentage+"%");
		System.out.println("Grade: "+grade);
	}
	
	public boolean updateInformation(String newAddress, String newContactNumber)
	{
		System.out.println("Requesting Parent approval");
		boolean parentApprovalStatus = parentApproval();
		if(parentApprovalStatus)
		{
			if(super.updateInformation(newAddress, newContactNumber))
			{
				System.out.println("Notifying the Parent...");
				return true;
			}
			else
			{
				System.err.println("No Approval from Parent...");
				return false;
			}
			
		}
		
		return false;
	}
	public boolean updateInformation(String newAddress)
	{
		System.out.println("Requesting Parent approval");
		boolean parentApprovalStatus = parentApproval();
		if(parentApprovalStatus)
		{
			if(super.updateInformation(newAddress))
			{
				System.out.println("Notifying the Parent...");
				return true;
			}
			else
			{
				System.err.println("No Approval from Parent...");
				return false;
			}
			
		}
		
		return false;
	}
	
	public boolean updateInformation(String newContactNumber, boolean update)
	{
		System.out.println("Requesting Parent approval");
		boolean parentApprovalStatus = parentApproval();
		if(parentApprovalStatus)
		{
			if(super.updateInformation(newContactNumber, update))
			{
				System.out.println("Notifying the Parent...");
				return true;
			}
			else 
			{
				System.err.println("No Approval from Parent...");
				return false;
			}
			
		}
		
		return false;
	}
	
	

	
	public boolean parentApproval()
	{
		return true;
	}
	
	public static int getTotalStudentCount()
	{
		//System.out.println("Total Student Count is "+totalStudentCount);
		return totalStudentCount;
	}
	
	public static class StudentBuilder
	{
		//Optional
		private int rollNumber;
		private double marksObtainedInEnglish;
		private double marksObtainedInMaths;
		private double marksObtainedInScience;
		//Mandatory
		private String name;
		private int age;
		private String contactNumber;
		private String address;
		
		public StudentBuilder(String name, int age, String contactNumber, String address) {
			if(validateAge(age) && validateContactNumber(contactNumber) && validateAddress(address))
			{
			this.name = name;
			this.age = age;
			this.contactNumber = contactNumber;
			this.address = address;
			}
		}
		@Override
		public String toString() {
			return "StudentBuilder [rollNumber=" + rollNumber + ", marksObtainedInEnglish=" + marksObtainedInEnglish
					+ ", marksObtainedInMaths=" + marksObtainedInMaths + ", marksObtainedInScience="
					+ marksObtainedInScience + ", name=" + name + ", age=" + age + ", contactNumber=" + contactNumber
					+ ", address=" + address + "]";
		}
		public StudentBuilder withRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
			return this;
		}
		public StudentBuilder withMarksObtainedInEnglish(double marksObtainedInEnglish) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			return this;
		}
		public StudentBuilder withMarksObtainedInMaths(double marksObtainedInMaths) {
			this.marksObtainedInMaths = marksObtainedInMaths;
			return this;
		}
		public StudentBuilder withMarksObtainedInScience(double marksObtainedInScience) {
			this.marksObtainedInScience = marksObtainedInScience;
			return this;
		}
		
		public Student Build()
		{
			Student student = new Student(this);
			return student;
		}
		
		public boolean validateAge(int age)
		{
			if(age > 10 && age < 21)
			{
				return true;
			}
			else
			{
				System.err.println("Not a Valid Age");
				return false;
			}
		}
		
		public boolean validateContactNumber(String contactNumber)
		{
			if(contactNumber.matches("\\d{10}"))
			{
				return true;
			}
			else
			{
				System.err.println("Invalid PhoneNumber");
				return false;
			}
		}
		public boolean validateAddress(String address)
		{
			if(address.isEmpty() || address == "null")
			{
				
				System.err.println("Invalid Address");
				return false;
				
			}
			else
			{
				return true;
			}
		}
		

		
		
	}
	
}
