package com.tutorialsNinja.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(className="dropdown")
	private WebElement MyAccount;
	
	@FindBy(linkText="Shopping Cart")
	private WebElement ShoppingCart;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void myaccount() {
		MyAccount.click();
	}

}
