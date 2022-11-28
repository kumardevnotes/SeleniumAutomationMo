package com.practice;

public class ArraysDemo {

	public static void main(String[] args) {
		//Variable stores only single value
		//If you updpate var with new value, old value will be gone
		int empId = 100;
		//System.out.println(empId);
		
		//Arrsy will store more than 1 value into a single variable
		//It stores only homegeneous data or same type of data
		//Arrays are fixed in size
		
		String cities[]  = {"NewDelhi", "Hyd", "pune"};
		char chars[] = {'M', 'K', 'M'};
		
		int empIds[] = {1011, 1122, 3344, 2321, 6565}; //length-1 == 4
		
		//empIds[0] = 1011 empIds[1] = 1122 empIds[2] = 3344 empIds[3] = 1011
//		System.out.println(empIds[0]); //1st value in array
//		System.out.println(empIds[1]);
//		System.out.println(empIds[2]);
//		System.out.println(empIds[3]);
		
		//for (initialization; condition; increment/decrement)
		for(int i=0; i < empIds.length  ; i++) { // 4 ; 4 < 5 // 0 1 2 3 4 5 < 5
			System.out.println(empIds[i]); //empIds[5] = 2321
		}
		
		for(int i=empIds.length-1; i >=0  ; i--) {  //3 ; -1 >= 0
			System.out.println(empIds[i]); //empIds[0] = 1011
		}
		
		
		
	}

}
