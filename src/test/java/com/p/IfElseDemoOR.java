package com.p;

public class IfElseDemoOR {

	/*
	 * In If..else
	 * else is optional. you can keep if and remove else. no issues
	 * if is mandatory. without if.. there is no else. it will throw error
	 * 
	 * */
	public static void main(String[] args) {
		int empSalary = 1000;
		int empAge =  40;
		//Control structures
		
		if(empSalary > 5000 || empAge < 50) { // 1000 > 5000 || 40 < 50 --> false || true --> true
			//OR operator ||
			//false || false --> false
			//true || false --> true
			//true || true --> true
			//false || true --> true
			System.out.println("Employee has to pay the tax");
		}
		else {
			System.out.println("Employee no need to pay the tax");
		}
	}

}
