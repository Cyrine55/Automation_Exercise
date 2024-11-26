package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.RecommendedItemPage;
import com.e2eTests.automation.utils.Validations;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddRecommendedItemStepDefinition {
	
	RecommendedItemPage recommendedItemPage;
	Validations validations;
	
	public AddRecommendedItemStepDefinition() {
		recommendedItemPage= new RecommendedItemPage();
		validations= new  Validations();
	}


	@When("Scroll to bottom of page")
	public void scrollToBottomOfPage() {
		recommendedItemPage.scrollBottomPage();
	}
	@Then("Verify {string} are visible")
	public void verifyAreVisible(String expectedRecommendedText) {
	   String actualRecommendedText =recommendedItemPage.verifyRecommendedTextVisible();
	   Assert.assertEquals(actualRecommendedText, expectedRecommendedText);
	}
	@When("Click on Add To Cart on Recommended product")
	public void clickOnAddToCartOnRecommendedProduct() {
		recommendedItemPage.addRecomendedProduct();  
	}
	

	@When("Click onn {string} button")
	public void clickOnnButton(String string) {
		recommendedItemPage.clickViewCart();    
	}



	
	@Then("Verify that product is displayed in cart page")
	public void verifyThatProductIsDisplayedInCartPage() {
		Assert.assertTrue(recommendedItemPage.verifyRecommendedProductDisplay());
	}




}
