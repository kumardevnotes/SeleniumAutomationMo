package com.pom.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public By emailField  = By.xpath("//input[@id='email_input']");
	public By passwordField  = By.xpath("//input[@id='password_input']");
	public By loginButton  = By.xpath("//input[@id='login_button']");
	public By loginErrorMessage = By.id("error_messages_list");
	public By loggedinUserText = By.xpath("//li[@id='nav_user']//a");
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void loginIntoApp(String email, String pwd) {
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(passwordField).sendKeys(pwd);
		driver.findElement(loginButton).click();
	}
	
	public String getLoginError() {
		return driver.findElement(loginErrorMessage).getText();
	}
	
	public String getLoggedInUserName() {
		return driver.findElement(loggedinUserText).getText();
	}
}
