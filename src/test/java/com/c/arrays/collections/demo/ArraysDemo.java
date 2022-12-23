package com.c.arrays.collections.demo;

public class ArraysDemo {

	public static void main(String[] args) {
	int empId = 1122; //java variable
	empId = 6655;
//	System.out.println(empId);
	//Declaring and assigning  array values ata time
	int empIds[] = {1122, 1123,1133,4411,3322, 133332, 98,776,555,56432}; //10values //Java integer array
	
//	System.out.println(empIds[0]); //1st value in the array - 1122
//	System.out.println(empIds[1]); //2nd value in the array - 1123
//	System.out.println(empIds[2]); //3rd value in the array - 1133
//	System.out.println(empIds[3]);
//	System.out.println(empIds[4]); //length()-1 = position of last value in the array = 4
	
	//declaring a for loop
	for(int index=0; index <= empIds.length-1; index++ ) { // 4 ; 4<=4 --> True
		System.out.println(empIds[index]); //empIds[3] --> 4411
	}
	
	}

}
