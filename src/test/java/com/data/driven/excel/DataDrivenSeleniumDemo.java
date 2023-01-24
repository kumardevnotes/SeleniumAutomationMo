package com.data.driven.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenSeleniumDemo {
	

	public static void main(String[] args) throws Exception {
		
        String rootPath = System.getProperty("user.dir");		
		FileInputStream fileInputStream = new 
				FileInputStream(new File(rootPath + "//src//test//java//com//io//TestData1.xlsx")); 

		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

		// Get first/desired sheet from the workbook
		XSSFSheet sheet = workbook.getSheet("AppLoginInfo");
		
		for (int i = 1; i <= 2 ; i++) {
			String userEmail = sheet.getRow(i).getCell(0).toString();
			String userPassword = sheet.getRow(i).getCell(1).toString();
			String loggedInUserName = sheet.getRow(i).getCell(2).toString();
			System.out.println(userEmail +"\t"+ userPassword +"\t"+ loggedInUserName);
		}
		
	
	}

}
