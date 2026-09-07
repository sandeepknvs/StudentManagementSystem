package com.student.management.system.oop;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Sandeep",18, "8639772569","Hyderabad",25,100,100,100);
		student.displayStudentInfo();
		student.updateInformation("Hyderabd", "8639772569");
		
		Teacher teacher = new Teacher("Philippines English Teacher",25,"8639772569","Hyderabad","T999","English",5,"English");
		teacher.updateInformation("hyd", "8639772569");
		teacher.displayTeacherInfo();
		
	}

}
