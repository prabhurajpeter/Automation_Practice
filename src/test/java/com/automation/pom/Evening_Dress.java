package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evening_Dress {

	private WebDriver driver;

	public Evening_Dress(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='Evening Dresses']")
	private WebElement evedress;
	
	@FindBy(xpath = "//div[@class='product-container']")
	private WebElement block;
	
	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement cart;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement checkout;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEvedress() {
		return evedress;
	}

	public WebElement getRblock() {
		return block;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	
	
	

}
