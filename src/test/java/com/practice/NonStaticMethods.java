package com.practice;

public class NonStaticMethods {
	
	//constructor is special fucntion whose name should be same as class name
	//default constructor
	NonStaticMethods(){
		System.out.println("I am a default constructor"); //No params
	}
	
	//Param constructor
	NonStaticMethods(String message){
		System.out.println("I am a parameterized constructor: "+ message); // params
	}


	public static void main(String[] args) {
		
		//Standard expression to create an object of a class
		NonStaticMethods object = new NonStaticMethods();
		object.displayStdName();
		object.displayStdFee(2000);
		object.displaystdAddress();
		displaystdAddress();
		
		NonStaticMethods object2 = new NonStaticMethods("Hello QA");
		object2.displayStdName();
	}
	
	//Declaring a non-static method
	public void displayStdName() {
		System.out.println("Sam");
	}
	
	public void displayStdFee(int fee) {
		System.out.println(fee);
	}
	
   public static void displaystdAddress() {
	   System.out.println("Flat 1001, HGTB Colony, Hyd, 50071");
   }

}
