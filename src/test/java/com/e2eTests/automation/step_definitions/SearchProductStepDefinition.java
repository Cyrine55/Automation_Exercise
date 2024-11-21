package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.SearchProductPage;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductStepDefinition {
	SearchProductPage searchProductPage;
	public Validations validations;
	public SearchProductStepDefinition() {
		searchProductPage = new SearchProductPage();
	}
	private String searchedProductName;
	@When("Enter product name {string} in search input")
	public void enterProductNameTopInSearchInput(String productname) {
		this.searchedProductName = productname;
		searchProductPage.enterProductText(productname);   
	}
	@When("Click search button")
	public void clickSearchButton() {
		searchProductPage.clickSearchBtn();  
	
	}
	@Then("Verify {string} message is visible")
	public void verifyMessageIsVisible(String ExpectedSearchedText) {
	  String actualSearchedProducts= searchProductPage.getSearchedProducts() ;
	  Assert.assertEquals(actualSearchedProducts, ExpectedSearchedText);
	}
	@Then("Verify all the products related to search are visible")
	public void verifyAllTheProductsRelatedToSearchAreVisible() {
		searchProductPage.getListProductSearched(searchedProductName); 
	}



}
