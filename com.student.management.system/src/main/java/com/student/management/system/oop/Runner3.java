package com.student.management.system.oop;

public class Runner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new RegularStudent.RegularStudentBuilder("Sandeep", 18, "8639772569", "Hyderabad")
				.withRollNumber(25).withMarksObtainedInEnglish(75).withMarksObtainedInMaths(75).withMarksObtainedInScience(78).Build();
		s.displayStudentInfo();
		System.out.println(s);
		
		Student s1 = new SportsStudent.SportStudentBuilder("Sandeep", 13, "8639772569", "Hyd")
				.withMarksScoredInSports(79)
				.withMarksObtainedInEnglish(75)
				.withMarksObtainedInMaths(75)
				.withMarksObtainedInScience(78)
				.withRollNumber(67)
				.Build();
		System.out.println(s1);
	}
	

}
