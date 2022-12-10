package com.p;

public class IfElseMutlipleconditions {

	public static void main(String[] args) {
		int empSalary = 5000;
		
		//condition1
		if(empSalary >= 2000 && empSalary <= 5000) {  // 2000 -5000
			System.out.println("Employee has to pay 10% tax");
		}
		
		//condition2
		else if(empSalary >= 5000 && empSalary <= 10000) {  // 5000 - 10000
			System.out.println("Employee has to pay 20% tax");
		}
		else {
			System.out.println("Employee no need to pay the tax");
		}

	}

}
