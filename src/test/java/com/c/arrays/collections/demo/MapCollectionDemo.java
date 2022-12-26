package com.c.arrays.collections.demo;

import java.util.HashMap;
import java.util.Map;

public class MapCollectionDemo {

	public static void main(String[] args) {
		//Map is an interface
		//HashMap is a class
		//HashMap class internally implements Map interface
		//Map is used to store data in the form of key and value pairs
		// Where Keys always should be unique but values can be unique or not
		//We can store null value as a key but only once
		Map myMap = new HashMap();
		myMap.put("appBrowser", "Edge");
		myMap.put("appUrl", "https://www.speaklanguages.com/english/");
		myMap.put("appUserEmailID", "johnnitesh2@gmail.com");
		myMap.put("apppassword", "Testing@123");
		myMap.put("appUserName", "nitesh");
		myMap.put("appUserID", "nitesh");
		//Map collection takes only recent value for any given key and ignores old value
		myMap.put("appBrowser", "Chrome");
		System.out.println(myMap);
		System.out.println(myMap.containsKey("appBrowser_invalid"));
		System.out.println(myMap.containsValue("nitesh"));
		myMap.remove("appBrowser"); // to remove a particular key
		System.out.println(myMap);
		myMap.clear();
		System.out.println(myMap);
	}
	

}
