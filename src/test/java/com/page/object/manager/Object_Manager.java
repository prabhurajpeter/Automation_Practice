package com.page.object.manager;

import org.openqa.selenium.WebDriver;

import com.automation.pom.Casual_Dress;
import com.automation.pom.Casualdress_Order;
import com.automation.pom.Dress_Order;
import com.automation.pom.Evening_Dress;
import com.automation.pom.Eveningdress_Order;
import com.automation.pom.Login_Page;
import com.automation.pom.Logout_Page;
import com.automation.pom.Mystore_Signin;
import com.automation.pom.Summer_Dress;
import com.automation.pom.Summerdress_Order;

public class Object_Manager {
	
	private WebDriver driver;
	private Logout_Page logout;
	private Mystore_Signin signin;
	private Login_Page login;
	private Evening_Dress evening;
	private Eveningdress_Order eveorder;
	private Casual_Dress cdress;
	private Casualdress_Order corder;
	private Summer_Dress sdress;
	private Summerdress_Order sorder;
	private Dress_Order order;
	
	public Dress_Order getOrder() {
		if (order==null) {
			
			order = new Dress_Order();
			
		}
		return order;
	}

	

	public Object_Manager(WebDriver driver) {
		this.driver=driver;
	
	}
	
	public Logout_Page getLogout() {
		
		if (logout == null) {
			
			logout = new Logout_Page(driver);
		}
		return logout;
	}


	public Mystore_Signin getSignin() {
		if (signin == null) {
			
			signin = new Mystore_Signin(driver);
			
		}
		return signin;
	}


	public Login_Page getLogin() {
		
		if (login == null ) {
			
			login = new Login_Page(driver);
			
		}
		return login;
	}


	public Evening_Dress getEvening() {
		
		if (evening == null) {
			
			evening = new Evening_Dress(driver);
			
		}
		return evening;
	}


	public Eveningdress_Order getEveorder() {
		
		if (eveorder == null) {
			
			eveorder = new Eveningdress_Order(driver);
			
		}
		return eveorder;
	}


	public Casual_Dress getCdress() {
		if (cdress == null ) {
			
			cdress = new Casual_Dress(driver);
			
		}
		return cdress;
	}


	public Casualdress_Order getCorder() {
		
		if (corder == null ) {
			
			corder = new Casualdress_Order(driver);
			
		}
		return corder;
	}


	public Summer_Dress getSdress() {
		
		if (sdress==null) {
			sdress = new Summer_Dress(driver);
			
		}
		return sdress;
	}


	public Summerdress_Order getSorder() {
		
		if (sorder == null) {
			
			sdress = new Summer_Dress(driver);
			
		}
		return sorder;
	}


	
	
	

}
