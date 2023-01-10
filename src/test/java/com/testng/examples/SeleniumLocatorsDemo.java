package com.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumLocatorsDemo {
  @Test
  public void verifyLoginError() throws Exception {
	  String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		
		//Opens browser
		WebDriver driver = new ChromeDriver();
		
		//browser maximized
		driver.manage().window().maximize();
		
		driver.get("https://speaklanguages.com");
		driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.tagName("div")).click();
		//driver.findElement(By.partialLinkText("Log in")).click();
		//driver.findElement(By.className("error")).click();
		driver.findElement(By.name("email_input")).sendKeys("useremail@gmail.com");
		driver.findElement(By.id("password_input")).sendKeys("pwd#2233");
		
		driver.findElement(By.id("login_button")).click();
		
		//error
		
		Thread.sleep(2000);
		driver.quit();
  }
}
