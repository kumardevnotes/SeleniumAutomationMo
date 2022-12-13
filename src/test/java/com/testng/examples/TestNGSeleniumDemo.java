package com.testng.examples;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSeleniumDemo {
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
	public void verifyHomePage() throws Exception {
		
		boolean islogoDisplayed  = driver.findElement(By.id("logo")).isDisplayed();
		boolean isSearchfieldDisplayed  = driver.findElement(By.name("q")).isDisplayed();
		boolean isLoginDisplayed  = driver.findElement(By.linkText("Log in")).isDisplayed();
		boolean isSignupDisplayed  = driver.findElement(By.linkText("Sign up")).isDisplayed();
		isSignupDisplayed =false;
		
		if(islogoDisplayed && isSearchfieldDisplayed && isLoginDisplayed && isSignupDisplayed ) {
			//true && true && true && false --> false
		System.out.println("verifyHomePage passed");
		}
		else
		{
			String errorMessage = "verifyHomePage verification failed";
			System.out.println(errorMessage);
			
			String rootFolder = System.getProperty("user.dir");
			File src  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File(rootFolder + "//Screenshots//myImage.png");
			FileHandler.copy(src, dest);
			Assert.fail(errorMessage);
		}
	}
	
	@Test 
	public void verifyFooterSection() throws Exception {
		//Scroll to footer
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		//find an element on the footer
		WebElement element  = driver.findElement(By.id("language_menu"));
		
		//Move mouse to the element using Actions class object
		Actions action  = new Actions(driver);
		action.moveToElement(element).build().perform();
		
		Thread.sleep(4000);
		
		action.doubleClick(element);
		Thread.sleep(4000);
		
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
