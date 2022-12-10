package com.p.methods.demo;

public class JavaStaticMethods {

	public static void main(String[] args) {
		System.out.println("I am from main()");
		
		//Calling static methods in main()
		displayStdName();
		displayStdName();
		displayStdName();
		
		displayStdId();
		displayStdName("Kumar T");
		displayStdName("Naveen T");
		displayStdName("Lavanya T");
		
		displayStdFullName("Mike", "Tyson");
		
		int returnedValue = getStdFee();
		System.out.println(returnedValue);
	}
	
	//Declaring a method
	public static void displayStdFullName(String firstName, String lastName) {
		System.out.println("Std Full Name "+firstName + lastName);
	}
	
	//Declaring my own static method
	public static void displayStdName() {
		System.out.println("John Legend");
	}
	
	//Declaring  a method
	public static void displayStdName(String stdName) {
		System.out.println(stdName);
	}
	
	//Declaring my own static method
	public static void displayStdId() {
		System.out.println("1122");
	}
	
	//Declaring a method with return type Integer
	public static int getStdFee() {
		//
		//
		return 1000;
	}

}
