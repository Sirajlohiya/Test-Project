package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver OpenFirefoxBrowser() {
		WebDriver driver = new FirefoxDriver();
		return driver ;
		
	}
	
	public WebDriver OpenChromeBrowser() {
		WebDriver driver = new ChromeDriver();
		return driver ;
		
	}
	public void BrowserOpeningCode() {
		
		
	}

}
