package com.student.management.system.oop;

public class RegularStudent extends Student {

	public RegularStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		// TODO Auto-generated constructor stub
		percentage = calculatePercentage();
		grade = calculateGrade();
	}

	@Override
	public double calculatePercentage() {
		// TODO Auto-generated method stub
		double percentage = totalMarks/3.0;
		return percentage;
	}
	
	public static class RegularStudentBuilder extends StudentBuilder
	{

		public RegularStudentBuilder(String name, int age, String contactNumber, String address) {
			super(name, age, contactNumber, address);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Student Build() {
			// TODO Auto-generated method stub
			Student s1 = new RegularStudent(this);
			return s1;
			
		}
		
	}

}
