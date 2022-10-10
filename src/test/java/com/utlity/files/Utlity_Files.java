package com.utlity.files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utlity_Files {

	public static WebDriver driver;

	public static WebDriver get_Browser(String type) {


		 if (type.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "D:\\Demo Projects\\shopping_cucumber\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();

		}
		return driver;

	}

	public static void get_Url(String url) {

		driver.get(url);
	}

	public static void click(WebElement element) {

		element.click();

	}

	public static void send_Keys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clear(WebElement element) {
		element.clear();

	}
	
	public static void actions(WebDriver driver, WebElement element) {
		
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();

	}

	public static void dropdown(WebElement element , String value) {
		
		Select dropdown = new Select(element);
		dropdown.selectByValue(value);
		
	}
}
