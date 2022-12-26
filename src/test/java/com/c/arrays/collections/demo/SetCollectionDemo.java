package com.c.arrays.collections.demo;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionDemo {

	public static void main(String[] args) {
    //HashSet internally implements Set- So create object for ArrayLIst and assign it to List object
		Set mySet = new HashSet();
		//Set is an interface and we should never create object for that
		//EmpDetails -  EmpName, EMpID, EMpSAL, EMpGen, EMPStatus, EMpAddress
		//Set will store any type of data but in the form of Object
		//Set is dynamic in size
		//Set will never store duplicate elements
		//no get() to get the elements based on index
		//no positioning r ordering in Set
		mySet.add("JohnLegend"); //0
		mySet.add(1122); //2
		mySet.add(40000.56);
		mySet.add('M');
		mySet.add(true);
		mySet.add("101, APHB, Hyd, 500001");
		//System.out.println(myList);
		
		mySet.add(1122);
		mySet.add(1122);
		mySet.add(1122);
		mySet.add("JohnLegend");
		mySet.add("JohnLegend");
		
		for(Object obj : mySet) {
			System.out.println(obj);
		}
		
		
		mySet.clear();
		System.out.println(mySet);
		
		System.out.println(mySet.isEmpty());
	}

}
