package com.exception.handling;

public class MyClass {

	public static void main(String[] args) {

		try {
			//to read excel sheet
			int empAnnualSalary = 400000; // Integer number
			int months = 12;
			System.out.println("Salary per month: " + empAnnualSalary / months);

			String companyName = "Zen Tech";
			System.out.println(companyName.toUpperCase());

		} catch (ArithmeticException e) {
			System.out.println("Caught an exception: " + e);
		}

		catch (NullPointerException e) {
			System.out.println("Caught an exception: " + e);
		}
		
		finally {
			System.out.println("I will run always");
		}

		String empName = "John Miller";
		String empAddress = "H.No 1001, KPHB, Hyd 500071";

		System.out.println("empName: " + empName);
		System.out.println("empAddress: " + empAddress);

		System.out.println("Emp details printed without issues");

	}

}
