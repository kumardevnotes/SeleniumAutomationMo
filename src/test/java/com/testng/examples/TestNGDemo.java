package com.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		
		//Opens browser
		driver = new ChromeDriver();
		
		//browser maximized
		driver.manage().window().maximize();
		
		driver.get("https://speaklanguages.com");
		
	}
	
	@Test 
	public void verifyHomePage() {
		boolean islogoDisplayed  = driver.findElement(By.id("logo")).isDisplayed();
		boolean isSearchfieldDisplayed  = driver.findElement(By.name("q")).isDisplayed();
		boolean isLoginDisplayed  = driver.findElement(By.linkText("Log in")).isDisplayed();
		boolean isSignupDisplayed  = driver.findElement(By.linkText("Sign up")).isDisplayed();
		//if..else
		System.out.println("verifyHomePage passed");
	}
	
	@Test 
	public void verifyFooterSection() {
		System.out.println("verifyFooterSection passed");
	}
	
	@Test 
	public void verifyLoginPage() {
		System.out.println("verifyLoginPage passed");
	}
	
	@Test 
	public void verifySignup() {
		System.out.println("verifySignup passed");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("cleanup completed");
	}
	
	
}
