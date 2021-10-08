package org.Stepdef2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {
	
	@Given("User should open the adactine application")
	public void user_should_open_the_adactine_application() {
	    browserlaunch("https://adactinhotelapp.com/");
	}

	@When("User enters the {string} and {string} in the application")
	public void user_enters_the_and_in_the_application(String string, String string2) {
	   LoginAdactine l = new LoginAdactine();
	   entertext(l.getUsername(), string);
	   entertext(l.getPassword(), string2);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		LoginAdactine A = new LoginAdactine();
	   A.getLogin().click();
	}

	@Then("User verifies the application moved to home page")
	public void user_verifies_the_application_moved_to_home_page() throws InterruptedException {
	    Assert.assertTrue(driver.getTitle().contains("Adactine"));
	    System.out.println("verified");
	    Thread.sleep(3000);
	    driver.quit();
	}


}
