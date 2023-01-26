package com.pom.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public static By logoImage = By.id("logo");
	public static By searchField = By.xpath("//input[@name='q']");
	public static By loginLink = By.linkText("Log in");
	public static By singUpLink = By.linkText("Sign up");
	public static By headerText = By.xpath("//h1[.='Phrase guides']");

	public String getPageTitle() {
		return driver.getTitle();
	}

	public boolean isLogoDisplayed() {
		return driver.findElement(logoImage).isDisplayed();
	}
	
	public boolean isSearchFiledDisplayed() {
		return driver.findElement(searchField).isDisplayed();
	}

	public boolean isLoginLinkDisplayed() {
		return driver.findElement(loginLink).isDisplayed();
	}

	public boolean isSingupLinkDisplayed() {
		return driver.findElement(singUpLink).isDisplayed();
	}

	public boolean isHeaderDisplayed() {
		return driver.findElement(headerText).isDisplayed();
	}

	public void launchLoginPage() {
		driver.findElement(loginLink).click();
	}
	
	public void launchSignupPage() {
		driver.findElement(singUpLink).click();
	}
}
