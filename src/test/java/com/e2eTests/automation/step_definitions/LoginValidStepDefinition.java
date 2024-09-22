package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginValidStepDefinition {
	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
	public Validations validations;
	
	
	public LoginValidStepDefinition() {
		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}
	
	@Then("Verify the login {string} is visible")
	public void verifyTheLoginIsVisible(String newAccountText) {
	String actualAccountText = loginPage.getVerifyAccountText();
	Assert.assertEquals(actualAccountText, newAccountText);
	}
	
	@When("Enter correct email address and password")
	public void enterCorrectEmailAddressAndPassword() {
	 loginPage.enterEmailAdress();
	 loginPage.enterPassword();
	}
	
	@When("Click on {string} button")
	public void clickOnButton(String string) {
	    loginPage.clickLogin();
	}
	@Then("Verify that loggedusername {string} is visible")
	public void verifyThatLoggedusernameIsVisible(String string) {
	    
	}
	@Then("Click {string} button")
	public void clickButton(String string) {
	    
	}



	
	
	
}
