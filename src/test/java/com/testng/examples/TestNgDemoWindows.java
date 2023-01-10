package com.testng.examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNgDemoWindows {
	String app1 = "https://speaklanguages.com";
	String app2 = "https://facebook.com";
	String app1Title = "Speak Languages — Learn a new language online";
	String app2Title = "Facebook – log in or sign up";

	ChromeDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		// browser maximized
		driver.manage().window().maximize();
		driver.get(app1);
	}

	@Test
	public void verifyTitle() throws Exception {
		// Below line will launch new tab and switch to it
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(app2);
		Thread.sleep(3000);

		Set<String> myWindows = driver.getWindowHandles();
		
		for (String myWindow : myWindows) {
			driver.switchTo().window(myWindow);
			if (driver.getTitle().equals(app1Title)) {
				Thread.sleep(3000);
				System.out.println("Switched to app1");
			}

			else {
				Thread.sleep(3000);
				System.out.println("Switched to app2");
			}
		}

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
