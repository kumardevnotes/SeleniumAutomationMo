package com.p;

public class ArraysDemo {

	public static void main(String[] args) {
//
//		int empId = 1122;
//		System.out.println(empId);

		int empIds[] = {1122, 3344, 5566, 3366, 778, 1234}; //total 6 integer values in the array
		
//		System.out.println(empIds[0]); //index starts from 0
//		System.out.println(empIds[1]);
//		System.out.println(empIds[2]);
//		System.out.println(empIds[3]);
//		System.out.println(empIds[4]);
//		System.out.println(empIds[5]); //index ends at 5 == 6-1 = arraylength-1
		
		//declaring a for loop
		     // declaration; condition check ; inc/dec 
		for (int index = 0; index <= empIds.length-1 ; index++) { // index= 6 <= 5 --> true
//			if(index == 2)
//				break;
			System.out.println(empIds[index]); //empIds[5]
		}
		
		System.out.println("forloop ends upon condition failed and prints this message");
		

	}

}
