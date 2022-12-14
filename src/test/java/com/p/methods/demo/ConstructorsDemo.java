package com.p.methods.demo;

public class ConstructorsDemo {

	//constructor is special function whose name is same as className
	//Constructor is called automatically whenever we create an object for the class
	//we no need to call the constructor separately
	ConstructorsDemo(){
		System.out.println("I am a default constructor.....");
	}
	
	//Parameterized constructor
	ConstructorsDemo(String stdName){
		System.out.println("I am a parameterized constructor....."+stdName);
	}
	
	public static void main(String[] args) {
		//Standard java expression to create an object of a class
		ConstructorsDemo  myClassObj  = new ConstructorsDemo();	
		//Calling a method
		myClassObj.displayName();
		
		ConstructorsDemo  myClassObj2  = new ConstructorsDemo("Kumar QA");	
		myClassObj2.displayName();
		myClassObj2.displayName("Ramesh Raj");
	}
	
	//Non-static method with return type int
	public int getEmpSalary() {
		return 100; //Integer value
	}
	
	//Non-static method declaration -  no parameter
	public  void displayName() {
		System.out.println("John Miller");
	}
	
	//Non-static method with String parameter
	public  void displayName(String name) {
		System.out.println(name);
	}

}
