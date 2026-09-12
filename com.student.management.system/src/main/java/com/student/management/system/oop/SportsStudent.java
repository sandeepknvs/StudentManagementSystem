package com.student.management.system.oop;

public class SportsStudent extends Student {
	
	private double marksScoredInSports;
	

	public double getMarksScoredInSports() {
		return marksScoredInSports;
	}

	private SportsStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		// TODO Auto-generated constructor stub
		this.marksScoredInSports = ((SportStudentBuilder)studentBuilder).marksScoredInSports;
		percentage = calculatePercentage();
		grade = calculateGrade();
	}

	
	@Override
	public String toString() {
		return "SportsStudent [marksScoredInSports=" + marksScoredInSports + ", grade=" + grade + ", percentage="
				+ percentage + ", totalMarks=" + totalMarks + ", name=" + name + ", age=" + age + ", contactNumber="
				+ contactNumber + ", address=" + address + "]";
	}

	@Override
	public double calculatePercentage() {
		// TODO Auto-generated method stub
		double academicPercentage = calculateTotalMarks()/3.0;
		double finalPercentage = (academicPercentage * 0.8) + (marksScoredInSports * 0.2);
		return finalPercentage;
	}
	
	public static class SportStudentBuilder extends StudentBuilder
	{
		private double marksScoredInSports;
		
		public SportStudentBuilder withMarksScoredInSports(double marksScoredInSports)
		{
			if(marksScoredInSports >= 0 && marksScoredInSports <= 100)
			{
				this.marksScoredInSports = marksScoredInSports;
			}
			return this;

		}

		public SportStudentBuilder(String name, int age, String contactNumber, String address) {
			super(name, age, contactNumber, address);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Student Build() {
			// TODO Auto-generated method stub
			Student s1 = new SportsStudent(this);
			return s1;
			
		}
		
	}
}
