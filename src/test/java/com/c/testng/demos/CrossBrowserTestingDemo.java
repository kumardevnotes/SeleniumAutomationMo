package com.c.testng.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingDemo {
	//WebDriver is an interface in Selenium
	WebDriver driver;
	
	@Parameters({ "browser" }) // Edge
	@BeforeMethod (alwaysRun= true)
	public void setup(String browser) {
		String rootFolder = System.getProperty("user.dir");
		switch (browser) { // Edge
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Edge":
			System.setProperty("webdriver.edge.driver", rootFolder + "//src//test/resources/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			String errorMessage = "Invalid browser name passed";
			Assert.fail(errorMessage);
		}
		driver.manage().window().maximize();
	}


	@Test
	public void launchSpeakEnglish() throws Exception { // Edge
		driver.get("https://speaklanguages.com");
	}
	
	@Parameters({ "browser" }) // Edge
	@Test
	public void launchFacebbok() throws Exception { // Edge
		driver.get("https://facebook.com");
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() throws Exception{
		Thread.sleep(1000);
		driver.quit();
	}
}
