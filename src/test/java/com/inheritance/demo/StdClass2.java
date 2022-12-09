package com.inheritance.demo;

public class StdClass2{

	public static void main(String[] args) {
		StdClass2 objName  = new StdClass2();
		objName.displayStdName();
		objName.displayStdId();
		
		SchoolClass schoolObj = new SchoolClass();
		schoolObj.displaySchoolFee();
		schoolObj.displaySchoolName();

	}

	public void displayStdName() {
		System.out.println("John");
	}

	public void displayStdId() {
		System.out.println(1122);
	}
}
