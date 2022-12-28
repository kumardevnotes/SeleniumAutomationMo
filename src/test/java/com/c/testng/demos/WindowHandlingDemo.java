package com.c.testng.demos;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlingDemo {
  @Test
  public void verifyWIndowHandling() throws Exception {
	  
	  String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://speaklanguages.com"); 
		Thread.sleep(1000);
		
		String windowSpeakLanguages = driver.getWindowHandle();
		
		System.out.println(windowSpeakLanguages);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://facebook.com"); 
		Thread.sleep(2000);
		
		String windowFacebook = driver.getWindowHandle();
		
		System.out.println(windowFacebook);
	
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(2000);
		
		Set<String> myWindows  = driver.getWindowHandles();
		for(String myWindow : myWindows) {
			if(myWindow.equals(windowSpeakLanguages)) {
				driver.switchTo().window(myWindow);
				Thread.sleep(2000);
			}
		}
		
		
		driver.close();
		
		Thread.sleep(2000);
		driver.quit();
  }
}
