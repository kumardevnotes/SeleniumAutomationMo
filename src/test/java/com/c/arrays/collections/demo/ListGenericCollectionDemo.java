package com.c.arrays.collections.demo;

import java.util.ArrayList;
import java.util.List;

public class ListGenericCollectionDemo {

	public static void main(String[] args) {
   
		//Java Collection Generics  - It will store only given data type
		List<String> myList = new ArrayList<String>();
		
		myList.add("JohnLegend"); //0
		myList.add("1122"); //2
		myList.add("40000.56");
		myList.add("40000.56");
		myList.add("true");
		myList.add("101, APHB, Hyd, 500001");
		//System.out.println(myList);
	
		
		for(String myString : myList) {
			System.out.println(myString);
		}
		
		List<Integer> myListInt = new ArrayList<Integer>();
		myListInt.add(1122);
		myListInt.add(4455);
		myListInt.add(6677);
		System.out.println(myListInt);
	}

}
