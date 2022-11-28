package com.practice;

public class IfElseDemo {

	public static void main(String[] args) {

		int emSalary = 60000;
		int empAge = 20;

		if (emSalary > 30000 && empAge < 25) { 
			//AND oprator
			// true && true --> true
			// true && false --> false
			// false && true --> false
			// false && false --> false
			System.out.println("Employee has to pay the tax");
		} else {
			System.out.println("Employee no need to pay any tax");
		}
		
		//OR oprator
		// true || true --> true
		// true || false --> true
		// false || true --> true
		// false && false --> false

	}

}
