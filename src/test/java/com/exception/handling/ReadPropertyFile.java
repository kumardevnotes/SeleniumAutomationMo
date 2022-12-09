package com.exception.handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args)  {
		
		String projectFolderPath = System.getProperty("user.dir");
		System.out.println("projectFolderPath: "+projectFolderPath);
		
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(projectFolderPath + "//src//test//resources//app.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(props.getProperty("OperatingSystem"));
		System.out.println(props.getProperty("appBrowser"));
		System.out.println(props.getProperty("appUrl"));
		System.out.println(props.getProperty("appUserEmailID"));
		System.out.println(props.getProperty("appPwd"));

	}

}
