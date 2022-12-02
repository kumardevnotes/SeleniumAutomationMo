package com.practice;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		//Method overloading
		//same method name with different signature
		displayName();
		displayName("John");
		displayName("John", "Legend");
		String empName  = displayName("John" ,1122);
	}
	
	//method signature
	private static String displayName(String empName, int empId) {
		System.out.println("emName: "+empName);
		System.out.println("empId: "+empId);
		return empName;
		
	}

	private static void displayName(String firstName, String lastName) {
		System.out.println("firstName: "+firstName);
		System.out.println("lastName: "+lastName);
	}

	private static void displayName(String empName) {
		System.out.println(empName);
	}

	private static void displayName() {
		System.out.println("John");
		
	}

}
