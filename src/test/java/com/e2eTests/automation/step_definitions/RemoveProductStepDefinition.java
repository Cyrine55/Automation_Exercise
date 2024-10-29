package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.CartPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemoveProductStepDefinition {
	CartPage cartPage;
	public RemoveProductStepDefinition() {
		cartPage=new CartPage();
	}
	

	@When("click on X button corresponding to particular product {string}")
	public void clickOnXButtonCorrespondingToParticularProduct(String productDes) throws InterruptedException {
		cartPage.clickRemoveIcon(productDes);
	}
	@Then("Verify that product {string} is removed from the cart")
	public void verifyThatProductIsRemovedFromTheCart(String productDescription) {
		cartPage.removedProduct(productDescription);
	}

	

	




	
}
