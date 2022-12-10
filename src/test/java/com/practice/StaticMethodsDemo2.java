package com.practice;

public class StaticMethodsDemo2 {

	public static void main(String[] args) {
		System.out.println("This is coming from main method");
		// Method calling
		dislayName();
//		dislayName();
//		dislayName();

		dislayEmpSalary(10000);
//		dislayEmpSalary(20000);
//		dislayEmpSalary(30000);

		verifyEmpMarried(false);
		
		int mySalary = getSalary();
		System.out.println(mySalary);
		
		displayEmpFullName("Mike", "Tyson");
	}

	public static void displayEmpFullName(String firstName, String lastName) {
		System.out.println("firstName:"+ firstName);
		System.out.println("lastName:"+ lastName);
	}

	public static void verifyEmpMarried(boolean maritalStatus) { //maritalStatus == true

		if (maritalStatus) {
			System.out.println("Emp is married");
		} else
			System.out.println("Emp is not married");
	}

	// Declaring a method with static keyword. Static method
	public static void dislayName() {
		System.out.println("John Miller");
	}

	public static void dislayEmpSalary(int salary) {
		System.out.println(salary);
	}
	
	public static int getSalary() {
//		System.out.println("John Miller");
//		System.out.println("John Miller");
//		System.out.println("John Miller");
//		System.out.println("John Miller");
//		System.out.println("John Miller");
//		System.out.println("John Miller");
		return 20000;
	}

}
