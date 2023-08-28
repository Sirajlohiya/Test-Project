package com.tutorialsNinja.qa.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
	
	@BeforeClass
	public void beforeClass() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@Test
	public void verify_loginWithValidCredentials() {
		
		
	}
	@AfterMethod
	public void LogOut() {
		
	}
	
	

}
