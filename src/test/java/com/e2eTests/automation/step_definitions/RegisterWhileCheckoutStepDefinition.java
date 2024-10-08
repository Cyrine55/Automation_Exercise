package com.e2eTests.automation.step_definitions;



import org.junit.Assert;

import com.e2eTests.automation.page_objects.CartPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class RegisterWhileCheckoutStepDefinition {
	
CartPage cartPage;
public RegisterWhileCheckoutStepDefinition() {
	cartPage = new CartPage();	
}


	@Then("Verify that cart page is displayed")
	public void verifyThatCartPageIsDisplayed() {
	  String ExpectedCartUrl="https://automationexercise.com/view_cart";
	  String ActualUrlCartPage=cartPage.verifyUrlCartPage();
	  Assert.assertEquals(ActualUrlCartPage, ExpectedCartUrl);
	}
	@When("Click Proceed To Checkout")
	public void clickProceedToCheckout() {
	    cartPage.clickProceedCheckoutBtn();
	}
	@When("Click on register {string} button")
	public void clickOnRegisterButton(String string) {
		cartPage.clickRegisterLoginBtn();
	}
	@When("Fill all details in Signup and create account")
	public void fillAllDetailsInSignupAndCreateAccount() {
	    
	}
	@Then("Verify {string} and click {string} button")
	public void verifyAndClickButton(String string, String string2) {
	   
	}
	@Then("Verify {string} at top")
	public void verifyAtTop(String string) {
	   
	}
	@Then("Verify Address Details and Review Your Order")
	public void verifyAddressDetailsAndReviewYourOrder() {
	    
	}
	@When("Enter description in comment text area and click {string}")
	public void enterDescriptionInCommentTextAreaAndClick(String string) {
	
	}
	@When("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
	public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
	   
	}
	@Then("Verify success message {string}")
	public void verifySuccessMessage(String string) {
	  
	}
	@When("Click delete {string} button")
	public void clickDeleteButton(String string) {
	 
	}
	@When("click {string} button")
	public void clickButton(String string) {
	   
	}



	
	
	
	
	
	
	
	
	
}
