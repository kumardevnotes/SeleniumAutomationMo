package com.io;

public class ChildClass extends ParentClass {
	boolean feePaid = true;

	public void displayName() {
		System.out.println("John @ChildClass");
		super.displayName();
		System.out.println(this.feePaid);
		System.out.println(super.feePaid);
	}
	
	public void displayID() {
		System.out.println("1122 @ChildClass");
		super.displayID();
	}
	
	public void displayAddress() {
		System.out.println("HNo 101, APHB, Hyd 500001 @ChildClass");
	}
	
}
