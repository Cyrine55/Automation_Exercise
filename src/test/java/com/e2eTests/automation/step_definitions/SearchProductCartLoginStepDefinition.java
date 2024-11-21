package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.SearchProductCartLoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductCartLoginStepDefinition {
	SearchProductCartLoginPage searchProductCartLoginPage;
	
	
	public SearchProductCartLoginStepDefinition(){
		searchProductCartLoginPage=new SearchProductCartLoginPage();
	}
	
	@When("Add those products to cart")
	public void addThoseProductsToCart() {
		searchProductCartLoginPage.addCarts();  
	}
	@Then("Verify that products are visible in cart")
	public void verifyThatProductsAreVisibleInCart() {
	    
	}
	@Then("Verify that those products are visible in cart after login as well")
	public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
	  
	}



	
}
