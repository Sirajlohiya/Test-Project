package com.tutorialsNinja.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	@FindBy(linkText="logout")
	private WebElement LogOut;
	
	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void logout() {
		LogOut.click();
	}
	
	

}
