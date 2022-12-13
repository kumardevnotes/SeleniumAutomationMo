package com.p.methods.demo;

public class JavaNonStaticMethods {

	public static void main(String[] args) {
		//System.out.println("I am from main()");
		
		//Standard java expression to create an object of a class
		JavaNonStaticMethods  obj  = new JavaNonStaticMethods();
		//Calling a non-static method using class object
		
		//Method overloading --> same method name with different parameter list
		obj.displayName();
		obj.displayId();
		
		obj.displayName("Meena Kumari");
		
		obj.displayName(5454);
		
		obj.getEmpName();
		int empSal = obj.getEmpSalary();
		System.out.println(empSal);
		
	}
	
	//Non-static method with return type int
	public int getEmpSalary() {
		return 100; //Integer value
	}
	
	public String getEmpName() {
		return "John"; //Integer value
	}
	
	
	//Non-static method declaration -  no parameter
	public  void displayName() {
		System.out.println("John Miller");
	}
	
	//Non-static method with String parameter
	public  void displayName(String name) {
		System.out.println(name);
	}
	
	public  void displayName(int id) {
		System.out.println(id);
	}
	
	//Non-static methods
	public void displayId() {
		System.out.println(8875);
	}


}
