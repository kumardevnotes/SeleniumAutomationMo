package com.p.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoMethods1 {
	
	public static void main(String[] args) throws Exception {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("email_input")).sendKeys("johnnitesh2@gmail.com");
		driver.findElement(By.id("password_input")).sendKeys("Testing@123");
		driver.findElement(By.id("login_button")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
