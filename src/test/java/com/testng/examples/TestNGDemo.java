package com.testng.examples;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	@BeforeTest
	public void setUp() {
		
		//browser launch
		//launch app
		System.out.println("setup completed");
	}
	
	@Test 
	public void testCase1() {
		//actual script run
		//pass
		//fail
		System.out.println("Testcase1 passed");
	}
	
	
	@Test 
	public void testCase2() {
		System.out.println("Testcase2 passed");
		Assert.fail("Failed this testcase intentionally");
	}
	
	@AfterTest
	public void tearDown() {
		//logout
		//close browser
		System.out.println("cleanup completed");
	}
	
	
}
