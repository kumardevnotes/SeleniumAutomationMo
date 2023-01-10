package com.io;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ReadData {
  @Test
  public void launchAppFromPropsFile() throws Exception, Exception {
	  Properties props = new Properties();
	  String rootFolderpath = System.getProperty("user.dir");
		System.out.println(rootFolderpath);
		props.load(new FileInputStream(rootFolderpath + "/src/test/resources/app.properties"));
		
		System.out.println((props.getProperty("appBrowser")));
		System.out.println((props.getProperty("appUrl")));
		System.out.println((props.getProperty("appUserEmailID")));
		System.out.println((props.getProperty("appPwd")));
		
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(props.getProperty("appUrl"));
		Thread.sleep(3000);
		driver.quit();
  }
}
