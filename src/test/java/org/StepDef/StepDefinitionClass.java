package org.StepDef;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionClass {

	WebDriver driver;
	@Given("User should open the facebook application")
	public void user_should_open_the_facebook_application() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\91866\\Desktop\\eclips work space\\CucumberFirstProject\\driver\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   }
	

	@When("User enters the user name and password in the application")
	public void user_enters_the_user_name_and_password_in_the_application() {
	  driver.findElement(By.id("email")) .sendKeys("nishok");
	  driver.findElement(By.id("pass")).sendKeys("noihiuh");
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.name("login")).click();
	   
	}

	@Then("User verifies the application moved to home page")
	public void user_verifies_the_application_moved_to_home_page() {
		String title = driver.getTitle();
		boolean contains = title.contains("FaceBook");
				Assert.assertTrue(contains);
	   
	}

}
