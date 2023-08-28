package com.tutorialsNinja.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	//Step1 declare Data members (variables) globally
	
	@FindBy(linkText="Register")
	private WebElement Register;
	
	@FindBy(id="input-firstname")
	private WebElement FirstName;
	
	@FindBy(id="input-lastname")
	private WebElement LastName;
	
	@FindBy(id="input-email")
	private WebElement Email;
	
	@FindBy(id="input-telephone")
	private WebElement Telephone;
	
	@FindBy(id="input-password")
	private WebElement Password;
	
	@FindBy(id="input-confirm")
	private WebElement ConfirmPassword;
	
	@FindBy(xpath="(//label[@class=\"radio-inline\"][2])")
	private WebElement Subscribe;
	
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private WebElement PrivacyPolicy;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement Continue;
	
	//step2 data member (variable) initialization
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Step3 Method Create
	public void register() {
		Register.click();
	}
	public void firstname() {
		FirstName.sendKeys("Akshay");
	}
	public void lastname() {
		LastName.sendKeys("Kumar");
	}
	public void email() {
		Email.sendKeys("AkshayKumar@canada.com");
	}
	public void telephone() {
		Telephone.sendKeys("0000000000");
	}
	public void password() {
		Password.sendKeys("123456");
	}
	public void confirmpassword() {
		ConfirmPassword.sendKeys("123456");
	}
	public void subscribe() {
		Subscribe.click();
	}
	public void privacypolicy() {
		PrivacyPolicy.click();
	}
	public void continue1() {
		Continue.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
