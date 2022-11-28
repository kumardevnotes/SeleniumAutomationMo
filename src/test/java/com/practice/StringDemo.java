package com.practice;

public class StringDemo {

	public static void main(String[] args) {
		
		String empName = "John";
		//empName[0] = J empName[1] = o empName[2] = h empName[3] = n
		
		System.out.println(empName);
		System.out.println(empName.toUpperCase()); //JOHN
		System.out.println(empName.toLowerCase()); //john
		System.out.println(empName.charAt(0)); //J
		System.out.println(empName.equals("Jame")); //false
		System.out.println(empName.equals("John")); //true
		System.out.println(empName.equalsIgnoreCase("john")); //true
		System.out.println(empName.replace('J', 'R')); //Rohn
		
		System.out.println(empName + "Miller"); // JohnMiller
		System.out.println(empName.concat("Miller")); // JohnMiller
		
		empName = "  John  ";
		
		System.out.println(empName);
		System.out.println(empName.trim());

	}

}
