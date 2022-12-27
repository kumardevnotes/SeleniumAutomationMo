package com.c.arrays.collections.demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumListCollectionDemo {
	
  @Test
  public void verifyImages() throws Exception {
			String rootFolder = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test/resources/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://speaklanguages.com"); 
			List<WebElement> myImageElements = driver.findElements(By.xpath("//img"));
			
			List<String> myImageUrls = new ArrayList<String>();
			for(WebElement element : myImageElements) {
				myImageUrls.add(element.getAttribute("src"));
			}
			
			for(String imageurl : myImageUrls) {
				Thread.sleep(1000);
				driver.get(imageurl);
				boolean pageTitleEmptyOrNot  = driver.getTitle().isEmpty();
				pageTitleEmptyOrNot = true;
				if(pageTitleEmptyOrNot) {
					driver.quit();
					Assert.fail("Image is not loaded");
				}
				else {
					System.out.println("Image is loaded");
					driver.quit();
				}
			}
			
			
  }
}
