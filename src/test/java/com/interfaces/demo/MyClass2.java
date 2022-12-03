package com.interfaces.demo;

public class MyClass2 implements MyInterface{

	public static void main(String[] args) {
		
		MyClass2 obj = new MyClass2();
		obj.displayName();
		obj.displaySalary();
		obj.myMethod();

	}
	
	//method full body declaration
	public void myMethod() {
		System.out.println("I am from normal method()");
	}

	@Override
	public void displayName() {
		System.out.println("MyClass2 Employee: Mike");
	}

	@Override
	public void displaySalary() {
		System.out.println("MyClass2 EmployeeSalary: 10000");
	}

}
