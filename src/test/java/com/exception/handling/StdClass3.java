package com.exception.handling;

import com.inheritance.demo.SchoolClass;

public class StdClass3{

	public static void main(String[] args) {
		StdClass3 objName  = new StdClass3();
		objName.displayStdName();
		objName.displayStdId();
		
		SchoolClass schoolObj = new SchoolClass();
		//schoolObj.displaySchoolFee();

	}

	public void displayStdName() {
		System.out.println("John");
	}

	public void displayStdId() {
		System.out.println(1122);
	}
}
