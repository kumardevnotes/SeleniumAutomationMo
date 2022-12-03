package com.methodoverrding.demos;

public class StdClass extends SchoolClass{ //Child extends Parent

	public static final int stdID = 3344;
	public static void main(String[] args) {
		
		StdClass myStdObj  = new StdClass(); //5kb
		myStdObj.displayStudentName();
		myStdObj.displayStudentId();
		myStdObj.displaySchoolName();
		myStdObj.displaySchoolAddress();

	}
	
	//non-static
	public void displayStudentName() {
		System.out.println("John");
	}
	
	//non-static
	public void displayStudentId() {
		//stdID = 6666;
		System.out.println(stdID);
	}


}
