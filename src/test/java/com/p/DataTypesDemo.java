package com.p;

public class DataTypesDemo {

	public static void main(String[] args) {
	
		System.out.println("Printing employee details:");
		
		//Datatypes In java
		int empId = 1001; //int Stores only int values -2 -1 0 1 2 3 4 10000 10001....
		String empname = "John"; //group of chars in double quotes
		char gender = 'M'; //Single char in single quotes
		float empsalary = 10000.4545454878787f;
		double empIncentive = 500.757576767676;
		boolean empmarried  = true; //false if unmarried
		
		System.out.println(empId + "\t" + empname + "\t" + gender + "\t" + empsalary + "\t" + 
				empIncentive + "\t" + empmarried + "\t");
	} 

}
