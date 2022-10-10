package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eveningdress_Order {

	private WebDriver driver;

	public Eveningdress_Order(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[@class='cart_navigation clearfix']//child::a[@title='Proceed to checkout']")
	private WebElement pcheckout;
	
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement paddress;
	
	@FindBy(xpath = "//input[@id='cgv']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement pcarrier;
	
	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement cheque;
	
	@FindBy(xpath = "//p[@id='cart_navigation']//child::button[@type='submit']")
	private WebElement confirm;

	public WebElement getPcheckout() {
		return pcheckout;
	}

	public WebElement getPaddress() {
		return paddress;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getPcarrier() {
		return pcarrier;
	}

	public WebElement getCheque() {
		return cheque;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	

}
