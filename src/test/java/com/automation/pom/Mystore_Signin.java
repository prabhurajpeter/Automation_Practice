package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mystore_Signin {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;
	

	public Mystore_Signin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return signin;
	}

}
