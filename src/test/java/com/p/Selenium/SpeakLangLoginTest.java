package com.p.Selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpeakLangLoginTest {
	
	static Properties props  = null;

	public static void main(String[] args) throws Exception {
		//To get the project folder path in my computer
		String rootFolder = System.getProperty("user.dir");
		
		//Load properties file with the date
		props = new Properties();
		props.load(new FileInputStream(rootFolder + "//src//test//resources//app.properties"));
		
		//Get the email address, password and username using getProperty() as shown below
		String userEmailID =  props.getProperty("appUserEmailID");
		String userPwd  = props.getProperty("apppassword");
		String userName =  props.getProperty("appUserName");
		
		
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Log in")).click();

		//Entering  email address, password
		driver.findElement(By.id("email_input")).sendKeys(userEmailID);
		driver.findElement(By.id("password_input")).sendKeys(userPwd);
		driver.findElement(By.id("login_button")).click();
		Thread.sleep(4000);

		boolean isNameDisplayed = driver.findElement(By.linkText(userName)).isDisplayed();

		if (isNameDisplayed) {
			System.out.println("Login success and username verified");
		} else {
			System.out.println("Login failed or Username verification failed");
		}
		Thread.sleep(2000);

		driver.quit();
	}

}
