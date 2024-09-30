package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.HomePage;
import com.e2eTests.automation.page_objects.ProductPage;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifySubscriptionCartStepDefinition {

HomePage homePage;
	public Validations validations;
	public VerifySubscriptionCartStepDefinition	() {
		homePage=new HomePage();
		validations= new Validations();
	}
	
	

	@When("Click on cart {string} button")
	public void clickOnCartButton(String string) {
		homePage.clickOnCartBtn(); 
	}



	@When("Verify text {string}")
	public void verifyText(String string) {
	    
	}
	@When("Enter email address")
	public void enterEmailAddress() {
	   homePage.scrollIntoViewFooter();
	   homePage.enterEmailSubscribe();
	}
	@When("Click arrow button")
	public void clickArrowButton() {
		homePage.clickArrow(); 
	}
	@Then("Verify success message {string} is visible")
	public void verifySuccessMessageIsVisible(String successMsgText) {
	   String actualMsg=homePage.getSucessMsg();
	   System.out.println(actualMsg);
	   Assert.assertEquals(actualMsg, successMsgText);
	}



	
	
}
