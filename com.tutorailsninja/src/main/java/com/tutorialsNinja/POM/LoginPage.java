package com.tutorialsNinja.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(linkText="login")
	private WebElement Login;
	
	@FindBy(id="input-email")
	private WebElement Email;
	
	@FindBy(id="input-password")
	private WebElement PassWord;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement LoginButton;
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void login() {
		Login.click();
	}
	public void email() {
		Email.sendKeys("AkshayKumar@canada.com");
	}
	public void password() {
		PassWord.sendKeys("123456");	
	}
	public void loginbutton() {
		LoginButton.click();
	}
	
	
	
	

}
