package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidLoginStepDefinition {
	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
	public Validations validations;
	
	
	public InvalidLoginStepDefinition() {
		loginPage = new LoginPage();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}
	

	@When("Enter incorrect {string} and {string}")
	public void enterIncorrectEmailaddressAndPassword(String emailaddress, String password ) {
		loginPage.enterIncorrectEmail(emailaddress);
		loginPage.enterIncorrectMdp(password);
	    
	}
	@Then("Verify error message {string} is visible")
	public void verifyErrorMessageIsVisible(String string) {
	
	}




	


	
	
}
