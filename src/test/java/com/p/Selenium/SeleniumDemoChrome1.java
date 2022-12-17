package com.p.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoChrome1 {
	
	public static void main(String[] args) throws Exception {
		//to get the root folder of the application
		String rootFolder = System.getProperty("user.dir");
		System.out.println(rootFolder);
		
		//to set the driver file property and driver file location
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test/resources/chromedriver.exe");
		
		//Launching browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximizing the browser
		driver.manage().window().maximize();
		
		//Launch application by passing application full url 
		driver.get("https://speaklanguages.com"); //https://facebook.com
		
		//Wait for 2 seconds
		Thread.sleep(2000); //5000milli seconds == 5seconds
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Close browser
		driver.quit();
		
	}

}
