package com.p;

public class StringMethods {

	public static void main(String[] args) {
		String empname = "Johhn"; //J - 0 o -1 h -2 n -3
		//empname[0] - J 
		//empname[1] - o
		//empname[2] - h
		//empname[3] - h
		//empname[5-1] - n
		System.out.println(empname);
		
		System.out.println(empname.toUpperCase());
		System.out.println(empname.toLowerCase());
		System.out.println(empname.charAt(3)); //
		System.out.println(empname.length()); //4
		System.out.println(empname.equals("johhn")); //false
		System.out.println(empname.equalsIgnoreCase("johhn")); //true
		System.out.println(empname.replace('h', 'r')); //Jorrn
		
		empname = "   Johhn  ";
		System.out.println(empname);
		
		System.out.println(empname.trim());
		
	}

}
