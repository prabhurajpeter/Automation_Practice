package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;
	private WebDriver driver;

	public Logout_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

}
