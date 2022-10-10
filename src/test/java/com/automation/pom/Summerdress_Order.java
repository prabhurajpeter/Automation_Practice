package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summerdress_Order {

	private WebDriver driver;

	public Summerdress_Order(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//div[@class='button-container']//child::a[@title='Proceed to checkout']")
	private WebElement pcheck;
	
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

	public WebElement getPcheck() {
		return pcheck;
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
