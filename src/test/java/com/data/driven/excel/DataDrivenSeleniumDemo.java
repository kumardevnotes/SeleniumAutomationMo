package com.data.driven.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenSeleniumDemo {
	

	public static void main(String[] args) throws Exception {
		
        String rootPath = System.getProperty("user.dir");		
		FileInputStream fileInputStream = new 
				FileInputStream(new File(rootPath + "//src//test//java//com//io//TestData1.xlsx")); 

		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

		// Get first/desired sheet from the workbook
		XSSFSheet sheet = workbook.getSheet("AppLoginInfo");
		
		for (int i = 1; i <= sheet.getLastRowNum() ; i++) {
			String userEmail = sheet.getRow(i).getCell(0).toString();
			String userPassword = sheet.getRow(i).getCell(1).toString();
			String loggedInUserName = sheet.getRow(i).getCell(2).toString();
			System.out.println(userEmail +"\t"+ userPassword +"\t"+ loggedInUserName);

			System.setProperty("webdriver.chrome.driver", rootPath + "//src//test/resources/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://speaklanguages.com");
			Thread.sleep(2000);

			driver.findElement(By.linkText("Log in")).click();

			//Entering  email address, password
			driver.findElement(By.id("email_input")).sendKeys(userEmail);
			driver.findElement(By.id("password_input")).sendKeys(userPassword);
			driver.findElement(By.id("login_button")).click();
			Thread.sleep(4000);

			boolean isNameDisplayed = driver.findElement(By.linkText(loggedInUserName)).isDisplayed();

			if (isNameDisplayed) {
				System.out.println("Login success and username verified");
			} else {
				System.out.println("Login failed or Username verification failed");
			}
			Thread.sleep(2000);

			driver.quit();
		}
		
	
	}

}
