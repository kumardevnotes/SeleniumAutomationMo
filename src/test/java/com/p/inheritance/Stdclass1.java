package com.p.inheritance;

//Inheritance using extends keyword -  ChildClass extends ParentClass
//Advantage - Re-usability of the existing code
public class Stdclass1 extends SchoolClass { //Child class extends Parent class

	public static void main(String[] args) {
		Stdclass1 stdClass1Obj = new Stdclass1();
		stdClass1Obj.displaySchoolName();
		stdClass1Obj.displaySchoolAddress();
		
		//Call the method using existing object
		stdClass1Obj.dislayStdId();
	}
	
	public void dislayStdId() {
		System.out.println(1133);
	}

}
