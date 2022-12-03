package com.interfaces.demo;

public class MyClass implements MyInterface{

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
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
		System.out.println("MyClass Employee: John");
	}

	@Override
	public void displaySalary() {
		System.out.println("MyClass EmployeeSalary: 20000");
	}

}
