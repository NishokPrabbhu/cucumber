package org.Stepdef2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	static WebDriver driver;
	
	public static void browserlaunch(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91866\\Desktop\\eclips work space\\CucumberFirstProject\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(url);
		
	}
	
	public static void entertext(WebElement element, String text) {
		element.sendKeys(text);
		
	}
	
	
}
