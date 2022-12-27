package com.c.testng.demos;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class TestNGDemo1 {
	//TestNG --> Test Next Generation
	//Testing framework
  @Test
  public void loadAppChrome() throws Exception {
			String rootFolder = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test/resources/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://speaklanguages.com"); 
			Thread.sleep(1000);
			driver.quit();
  }
  
  @Test
  public void loadAppEdge() throws Exception {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", rootFolder + "//src//test/resources/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com"); 
		Thread.sleep(1000);
		driver.quit();
}
}
