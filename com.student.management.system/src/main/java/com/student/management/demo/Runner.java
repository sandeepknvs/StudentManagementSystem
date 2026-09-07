package com.student.management.demo;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("sandeep",1);
		Person other = new Person(p1);
		System.out.println(other.getName());
		System.out.println(other.getId());
		System.out.println(other.getClass());
		
	}

}
