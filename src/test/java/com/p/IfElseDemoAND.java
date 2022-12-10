package com.p;

public class IfElseDemoAND {

	public static void main(String[] args) {
		int empSalary = 1000;
		int empAge =  40;
		//Control structures
		
		if(empSalary > 5000 && empAge < 50) { // 1000 > 5000 && 40 < 50 --> false && true
			//AND operator &&
			//false && false --> false
			//true && false --> false
			//true && true --> true
			//false && true --> false
			System.out.println("Employee has to pay the tax");
		}
		else {
			System.out.println("Employee no need to pay the tax");
		}
	}

}
