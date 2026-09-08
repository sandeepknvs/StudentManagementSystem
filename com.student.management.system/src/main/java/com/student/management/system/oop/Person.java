package com.student.management.system.oop;

public class Person {
	protected String name;
	protected int age;
	protected String contactNumber;
	protected String address;
	protected static int totalPersonCount;
	public Person(String name, int age, String contactNumber, String address) {
		super();
		if(validateAddress(address) && validateContactNumber(contactNumber))
		{
			
		this.name = name;
		this.age = age;
		this.contactNumber = contactNumber;
		this.address = address;
		totalPersonCount++;
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
		this.age = age;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(validateAddress(address))
		{
			this.address = address;
		}
	
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ "]";
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
	
	protected boolean updateInformation(String newAddress, String newContactNumber)
	{
		if(validateAddress(newAddress) && validateContactNumber(newContactNumber))
		{
			this.address = newAddress;
			this.contactNumber = newContactNumber;
			System.out.println("Address and ContactNumber Updated Successfully...");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	protected boolean updateInformation(String newAddress)
	{
		if(validateAddress(newAddress)) 
		{
			this.address = newAddress;
			System.out.println("Address Updated Successfully...");
			return true;
		}
		else
		{
			return false;
		}
	}
	protected boolean updateInformation(String newContactNumber, boolean update)
	{
		if(validateContactNumber(newContactNumber))
		{
			this.contactNumber = newContactNumber;
			System.out.println("Address and ContactNumber Updated Successfully...");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int getTotalPersonCount()
	{
		
		//System.out.println("Total Person Count is "+totalPersonCount);
		return totalPersonCount;
	}
	
	

}
