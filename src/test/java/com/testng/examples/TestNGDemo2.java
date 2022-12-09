package com.testng.examples;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 {

	@BeforeTest
	public void setUp() {

		// browser launch
		// launch app
		System.out.println("setup completed");
	}

	@Test
	public void testCase3() {
		int a = 100;
		int b = 200;
		if (a == b) {
     System.out.println("testCase3 passed");
		}
		else {
			Assert.fail("condition is false. So failed the test");
		}
	}

	@Test
	public void testCase4() {
		boolean empMarried = false;
		Assert.assertEquals(empMarried, true, "Emp is not married");
		
		
		Assert.assertEquals(100, 100, "both the integers are not equal");
		System.out.println("testCase4 passed and no issues");
	}
	@Test
	public void testCase5() {
		Assert.fail("intentional failing the testcase. condition is false. So failed the test");
	}


	@AfterTest
	public void tearDown() {
		// logout
		// close browser
		System.out.println("cleanup completed");
	}

}
