package com.pom.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Singup {
WebDriver driver;
	
	public By firstNameField  = By.id("first_name");
	public By lastNameField  = By.xpath("//input[@name='last_name']");
	public By emailField  = By.name("email");
	public By passwordField  = By.xpath("//input[@name='password']");
	public By genderDropdown = By.xpath("//select[@name='sex']");
	public By dayDropdown = By.xpath("//select[@name='dob_day']");
	public By monthDropdown = By.xpath("//select[@name='dob_month']");
	public By yearDropdown = By.xpath("//select[@name='dob_year']");
	public By signUpButton  = By.xpath("//input[@type='submit']");
	public By signupError = By.xpath("//div[@class='error']");
	public By signUpSuccessMessage = By.xpath("//h1[contains(text(),'Thank you')]");
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void signUpSpeakLanguages() {
		driver.findElement(firstNameField).sendKeys("");
		driver.findElement(lastNameField).sendKeys("");
		driver.findElement(emailField).sendKeys("");
		driver.findElement(passwordField).sendKeys("");
		Select genderDD = new Select(driver.findElement(genderDropdown));
		genderDD.selectByVisibleText("Male");
		Select dayDD = new Select(driver.findElement(dayDropdown));
		dayDD.selectByVisibleText("1");
		Select monthDD = new Select(driver.findElement(monthDropdown));
		monthDD.selectByVisibleText("January");
		Select yearDD = new Select(driver.findElement(yearDropdown));
		yearDD.selectByVisibleText("1940");
		driver.findElement(signUpButton).click();
	}
	
	public boolean getSigupError() {
		return driver.findElement(signupError).isDisplayed();
	}
	
	public boolean getSignupSuccess() {
		return driver.findElement(signUpSuccessMessage).isDisplayed();
	}
}
