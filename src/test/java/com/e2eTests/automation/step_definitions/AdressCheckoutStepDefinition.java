package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.AdressCheckoutPage;

import io.cucumber.java.en.Then;

public class AdressCheckoutStepDefinition {

	RegisterUserStepDefinition registerUserStepDefinition = new RegisterUserStepDefinition();
	AdressCheckoutPage adressCheckoutPage;

	public AdressCheckoutStepDefinition() {
		registerUserStepDefinition = new RegisterUserStepDefinition();
		adressCheckoutPage = new AdressCheckoutPage();

	}

	@Then("Verify that the delivery address is same address filled at the time registration of account")
	public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
		String actualAddress1 = adressCheckoutPage.getDeliveryAdress1();
		String actualAddress2 = adressCheckoutPage.getDeliveryAdress2();

		String expectedAdress1 = registerUserStepDefinition.expectedAdress1;
		String expectedAdress2 = registerUserStepDefinition.expectedAdress2;
		System.out.println(expectedAdress1);
		System.out.println(expectedAdress2);
		System.out.println("Actual Address 1: " + actualAddress1);
		System.out.println("Actual Address 2: " + actualAddress2);
		Assert.assertEquals("fausse adress 1", expectedAdress1, actualAddress1);
		Assert.assertEquals("fausse adress2", expectedAdress2, actualAddress2);
	}

	@Then("Verify that the billing address is same address filled at the time registration of account")
	public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
		String actualBillingAds1 = adressCheckoutPage.getBillingAdress1();
		String actualBillingAds2 = adressCheckoutPage.getBillingAdress2();

		String expectedBillingAds1 = registerUserStepDefinition.expectedAdress1;
		String expectedBillingAds2 = registerUserStepDefinition.expectedAdress2;
		Assert.assertEquals("fausse Billing adress 1", expectedBillingAds1, actualBillingAds1);
		Assert.assertEquals("fausse Billing adress2", expectedBillingAds2, actualBillingAds2);
	}

}
