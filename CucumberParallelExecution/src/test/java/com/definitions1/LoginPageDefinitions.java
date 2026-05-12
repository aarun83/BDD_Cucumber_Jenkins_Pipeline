package com.definitions1;

import org.testng.Assert;

import com.actions.HomePageActions;
import com.actions.LoginPageActions;
import com.utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageDefinitions {
	
	LoginPageActions objLogin = new LoginPageActions();
    HomePageActions objHomePage = new HomePageActions();
        
    @Given("User is on HRMLogin page {string}")
	public void loginTest(String url) {
    	 HelperClass.openPage(url);

	}

	@When("User enters username and password")
	public void goToHomePage() {
		// login to application
        objLogin.login();
  
        // go the next page
	}

	@Then("User should be able to login sucessfully")
	public void verifyLogin() {
		// Verify home page
        Assert.assertTrue(objHomePage.getHomePageText().contains("Dashboard"));

	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String strUserName, String strPassword) {
		objLogin.setUserName(strUserName);
		objLogin.setPassword(strPassword);
		objLogin.clickLogin();
	}

	@Then("User should be able to see error message {string}")
	public void user_should_be_able_to_see_error_message(String expectedErrorMessage) {
		
		System.out.println("Error Message :" + objLogin.getErrorMessageText());
		Assert.assertTrue(objLogin.getErrorMessageText().contains(expectedErrorMessage));
		
	}
}
