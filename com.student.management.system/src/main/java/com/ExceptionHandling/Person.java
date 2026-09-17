package com.ExceptionHandling;

public class Person {
	private int age;
	private String name;
	public Person(int age, String name) {
		if(validateAge(age))
		{
			this.age = age;
			this.name = name;
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean validateAge(int age)
	{
		if(age >= 18 && age <= 100)
		{
			return true;
		}
		else
		{
			try
			{
				throw new SandeepException("Age not valird");
			}catch(SandeepException e)
			{
				e.printStackTrace();
			}
			
			return false;
		}
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
}
