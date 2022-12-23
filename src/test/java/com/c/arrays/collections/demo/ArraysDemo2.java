package com.c.arrays.collections.demo;

public class ArraysDemo2 {

	public static void main(String[] args) {
		// 3 Disadvantages with the arrays
		//1. Arrays are fixed in length - that means we can not store more than the length of the array
		//2. If we dont store the values equal to the length, then memory will be wasted
		//3. Arrays contain only same type of data
		
		int empIds[] = new int[4]; //length =4;

	for(int index=0;index <= 5; index++ ) { //0 1 2 3 4 5
		empIds[index] = 100; //empIds[2] = 100;
		//empIds[0] = 100;
		//empIds[1] = 100;
		//empIds[2] = 100;
	}
	
	for(int index=0;index <= empIds.length-1; index++ ) { //1 ; 1<=2
		System.out.println(empIds[index]);
	}

	}

}
