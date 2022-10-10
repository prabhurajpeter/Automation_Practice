package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summer_Dress {

	private WebDriver driver;

	public Summer_Dress(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "(//a[@title='Summer Dresses'])[1]")
	private WebElement sdress;
	
	@FindBy(xpath = "(//div[@class='product-container'])[3]")
	private WebElement block;
	
	@FindBy(xpath = "(//a[@title='Add to cart'])[3]")
	private WebElement cart;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement pcheckout;

	public WebElement getSdress() {
		return sdress;
	}

	public WebElement getBlock() {
		return block;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getPcheckout() {
		return pcheckout;
	}
	

}
