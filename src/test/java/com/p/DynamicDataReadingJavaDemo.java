package com.p;

import java.util.Scanner;

public class DynamicDataReadingJavaDemo {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		/*System.out.println("Please enter empId");
		int empId  = myScan.nextInt();
		empId = empId + 100;
		System.out.println("You have entered");
		System.out.println(empId);
		*/
		
		System.out.println("Please enter emp Name");
		String empName  = myScan.nextLine();
		
		System.out.println("You have entered empName");
		System.out.println(empName);
		
	}

}
