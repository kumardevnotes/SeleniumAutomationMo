package com.testng.examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 {

	@BeforeTest
	public void setUp() {
		
		//browser launch
		//launch app
		System.out.println("setup completed");
	}
	
	@Test 
	public void testCase3() {
		//actual script run
		//pass
		//fail
		System.out.println("Testcase3 passed");
	}
	
	
	@Test 
	public void testCase4() {
		System.out.println("Testcase4 passed");
	}
	
	@AfterTest
	public void tearDown() {
		//logout
		//close browser
		System.out.println("cleanup completed");
	}
	
	
}
