package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Dress {

	private WebDriver driver;

	public Casual_Dress(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "(//a[.='Dresses'])[2]")
	private WebElement dresses;
	
	@FindBy(xpath = "(//a[.='Casual Dresses'])[2]")
	private WebElement cdress;
	
	@FindBy(xpath = "//div[@class='product-container']")
	private WebElement block;
	
	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement addcart;
	
	@FindBy(xpath = "(//div[@class='button-container']//child::a)[1]")
	private WebElement pcheckout;

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getCdress() {
		return cdress;
	}

	public WebElement getContainer() {
		return block;
	}

	
	public WebElement getSubmit() {
		return addcart;
	}

	public WebElement getPcheckout() {
		return pcheckout;
	}
	
	
	

}
