package com.p.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandlingDemo {
	@Test
	public void verifyAlert() throws Exception {

		try {
			WebDriver driver = null;

			System.out.println("Launch the selenium script");
			// To get the root folder
			String rootFolder = System.getProperty("user.dir");

			// Need to setProperty with driver file, before you run the script
			System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
			// System.setProperty("webdriver.edge.driver", rootFolder +// "//src//test//resources//edgedriver.exe");

			driver = new ChromeDriver(); // it opens a chrome browser
			// driver = new MicrosoftEdgeDriver();

			// maximize browser
			driver.manage().window().maximize();

			// launching my app as shown below
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

			Thread.sleep(3000); // 3000ms == 3seconds

			// Click on sign in to enable the Alert box on the screen
			// driver.findElement(By.name("proceed")).click();

			// Capture the Alert and then accept it (OK)
			Alert alert = driver.switchTo().alert();
			alert.accept(); // to accept and click on OK button
			// alert.dismiss(); //to dismiss and click on cancel button
		} catch (InterruptedException e) {
			System.out.println("caught an exception " + e);
		} catch (NoAlertPresentException e) {
			System.out.println("caught an exception " + e);
		}
	}
}
