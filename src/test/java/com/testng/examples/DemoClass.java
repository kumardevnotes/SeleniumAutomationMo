package com.testng.examples;

public class DemoClass {

	public static void main(String[] args) {
		
		verifyFooterPage();
		verifyLoginPage("test@gmail.com" ,"#pwd1122");
		verifyHomePage();
		verifySignUp();
		}

	//Testcase1
	private static void verifyFooterPage() {
		System.out.println("FooterPage verified without issues");
	}
	
	//Testcase2
	private static void verifySignUp() {
		System.out.println("SignupPage verified without issues");
	}

	//Testcase3
	private static void verifyLoginPage(String uname, String pwd) {
		//
		//
		//
		System.out.println("Loginpage verified without issues");
	}

	//Testcase4
	private static void verifyHomePage() {
		System.out.println("Homepage verified without issues");
	}

}
