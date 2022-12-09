package com.inheritance.demo;

public class StdClass extends SchoolClass {

	public static void main(String[] args) {
		StdClass objName  = new StdClass();
		objName.displayStdName();
		objName.displayStdId();
		objName.displaySchoolFee();
		
		SchoolClass schoolObj = new SchoolClass();
		schoolObj.displaySchoolFee();
	}

	public void displayStdName() {
		System.out.println("John");
	}

	public void displayStdId() {
		System.out.println(1122);
	}
}
