package com.tutorialsNinja.qa.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialsNinja.POM.HomePage;
import com.tutorialsNinja.POM.RegistrationPage;

import Base.base;

public class registeration extends base {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
	driver = new FirefoxDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	@Test
	public void verify_RegistrationOfNewUser() {
		RegistrationPage registrationpage = new RegistrationPage(driver);
		HomePage homepage = new HomePage(driver);
		homepage.myaccount();
		registrationpage.register();
		registrationpage.firstname();
		registrationpage.lastname();
		registrationpage.email();
		registrationpage.telephone();
		registrationpage.password();
		registrationpage.confirmpassword();
		registrationpage.subscribe();
		registrationpage.privacypolicy();
		//registrationpage.continue1();
		//driver.close();
		
	}

}
