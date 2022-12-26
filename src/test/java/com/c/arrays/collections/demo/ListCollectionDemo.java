package com.c.arrays.collections.demo;

import java.util.ArrayList;
import java.util.List;

public class ListCollectionDemo {

	public static void main(String[] args) {
    //ArrayList internally implements List- So create object for ArrayLIst and assign it to List object
		List myList = new ArrayList();
		//List is an interface and we should never create object for that
		//EmpDetails -  EmpName, EMpID, EMpSAL, EMpGen, EMPStatus, EMpAddress
		//List will store any type of data but in the form of Object
		//List is dynamic in size
		//List will store duplicate elements
		//use get() to print list values based on the index
		myList.add("JohnLegend"); //0
		myList.add(1122); //2
		myList.add(40000.56);
		myList.add('M');
		myList.add(true);
		myList.add("101, APHB, Hyd, 500001");
		//System.out.println(myList);
		
		myList.add(1122);
		myList.add(1122);
		myList.add(1122);
		myList.add("JohnLegend");
		myList.add("JohnLegend");
		
		for(Object obj : myList) {
			System.out.println(obj);
		}
		
		System.out.println(myList.get(0));
		System.out.println(myList.get(2));
		
		List myChildList = new ArrayList();
		myChildList.add(3000);
		
		myList.addAll(myChildList);
		System.out.println(myList);
		
		myList.clear();
		System.out.println(myList);
		
		System.out.println(myList.isEmpty());
	}

}
