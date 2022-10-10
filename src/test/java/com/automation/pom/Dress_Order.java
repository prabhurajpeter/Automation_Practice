package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Order {
	
	private WebDriver driver;
	
	public Dress_Order() {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkout;
	
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement paddress;
	
	@FindBy(xpath = "//input[@id='cgv']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement pcarrier;
	
	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement cheque;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirm;

	public WebElement getCheckout() {
		return checkout;
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
