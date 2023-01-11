package com.io;

import java.io.File;

public class DemoFiles {

	public static void main(String[] args) throws Exception {
		String rootFolder = System.getProperty("user.dir");

		//Creating and deleting folder example
		File myFolder = new File(rootFolder + "//src//test//resources//KumarDocs");

		if (myFolder.mkdir()) {
			System.out.println("New folder created successfully");
		} else {
			System.out.println("Folder already exists");
			if (myFolder.delete()) {
				System.out.println("Folder deleted successfully");
			} else {
				System.out.println("Unable to delete the Folder");
			}
		}

		//Creating and deleting file example
		File myFile = new File(rootFolder + "//src//test//resources//Kumar.xlsx");

		if (myFile.createNewFile()) {
			System.out.println("New file created successfully");
		} else {
			System.out.println("File already exists");
			if (myFile.delete()) {
				System.out.println("File deleted successfully");
			} else {
				System.out.println("Unable to delete the file");
			}
		}
	}

}
