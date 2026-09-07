package com.student.management.system.oop;

import java.util.Objects;

public class Teacher extends Person {

	private String employeeId;
	private String subjectTheyTeach;
	private int yearsOfExperience;
	private double salary;
	private static final double BASE_SALARY = 30000;
	private static final double EXPERIENCE_BONUS = 2000;
	private String professionalDetails;
	
	
	
	
	public Teacher(String name, int age, String contactNumber, String address, String employeeId,
			String subjectTheyTeach, int yearsOfExperience, String professionalDetails) {
		super(name, age, contactNumber, address);
		if(validateAge(age) && validateContactNumber(contactNumber) && validateEmployeeId(employeeId) && validateAddress(address) && validateExperience(yearsOfExperience))
		{
		this.employeeId = employeeId;
		this.subjectTheyTeach = subjectTheyTeach;
		this.yearsOfExperience = yearsOfExperience;
		this.professionalDetails = professionalDetails;
		calculateSalary();
	}
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(validateAge(age))
		{
			this.age = age;
		}
		
	}
	
	public boolean validateAge(int age)
	{
		if(age > 18 && age < 60)
		{
			return true;
		}
		else
		{
			System.err.println("Not a Valid Age");
			return false;
		}
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

	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		if(validateEmployeeId(employeeId))
		{
			this.employeeId = employeeId;
		}
		
	}
	public boolean validateEmployeeId(String employeeId)
	{
		
		if(employeeId != null && employeeId.matches("T\\d{3}"))
		{
			return true;
		}
		else
		{
			System.err.println("Not a Valid Employee Number");
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

	public String getSubjectTheyTeach() {
		return subjectTheyTeach;
	}
	public void setSubjectTheyTeach(String subjectTheyTeach) {
		this.subjectTheyTeach = subjectTheyTeach;
	}
	public int getYearsOfExperience() {
		
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		if(validateExperience(yearsOfExperience))
		{
			this.yearsOfExperience = yearsOfExperience;
		}

	}
	
	public boolean validateExperience(int yearsOfExperience)
	{
		if(yearsOfExperience >= 0)
		{
			return true;
		}
		else
		{
			System.err.println("Not a Valid Experience");
			return false;
		}
	}
	public double getSalary() {
		return salary;
	}
	
	public String getProfessionalDetails() {
		return professionalDetails;
	}
	public void setProfessionalDetails(String professionalDetails) {
		this.professionalDetails = professionalDetails;
	}
	public double calculateSalary()
	{
		salary = (yearsOfExperience * EXPERIENCE_BONUS)+BASE_SALARY;
		return salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, contactNumber, employeeId, name, professionalDetails, salary,
				subjectTheyTeach, yearsOfExperience);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(address, other.address) && age == other.age
				&& Objects.equals(contactNumber, other.contactNumber) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(name, other.name) && Objects.equals(professionalDetails, other.professionalDetails)
				&& salary == other.salary && Objects.equals(subjectTheyTeach, other.subjectTheyTeach)
				&& yearsOfExperience == other.yearsOfExperience;
	}
	
	public void displayTeacherInfo()
	{
		System.out.println("-----Teacher Info------");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("ContactNumber: "+contactNumber);
		System.out.println("Address: "+address);
		System.out.println("----------------------");
		System.out.println("Total Experience: "+yearsOfExperience);
		System.out.println("Subject Expertise: "+professionalDetails);
		System.out.println("Subject: "+subjectTheyTeach);
		System.out.println("Expected Salary: "+salary+"$");
	}
	
	public boolean updateInformation(String newAddress, String newContactNumber)
	{
		System.out.println("Notifying HR for Approval");
		boolean hrApproval = getHRApproval();
		
		if(hrApproval)
		{
			if(super.updateInformation(newAddress, newContactNumber))
			{
				System.out.println("Notifying the teacher that information is updated..");
				return true;
			}
			
		}
		return false;
	}
	
	public boolean updateInformation(String newAddress)
	{
		System.out.println("Notifying HR for Approval");
		boolean hrApproval = getHRApproval();
		
		if(hrApproval)
		{
			if(super.updateInformation(newAddress))
			{
				System.out.println("Notifying the teacher that information is updated..");
				return true;
			}
			
		}
		return false;
	}
	
	public boolean updateInformation(String newContactNumber, boolean update)
	{
		System.out.println("Notifying HR for Approval");
		boolean hrApproval = getHRApproval();
		
		if(hrApproval)
		{
			if(super.updateInformation(newContactNumber, update))
			{
				System.out.println("Notifying the teacher that information is updated..");
				return true;
			}
			
		}
		return false;
	}
	public boolean getHRApproval()
	{
		return true;
	}
	
	
	
}
