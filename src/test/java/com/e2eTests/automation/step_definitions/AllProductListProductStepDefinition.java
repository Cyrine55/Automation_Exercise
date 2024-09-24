package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.ProductPage;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllProductListProductStepDefinition {
	ProductPage productPage;
	public Validations validations;
	
	
public AllProductListProductStepDefinition() {
	productPage=new ProductPage();
}


	@Given("Click on Product button")
	public void clickOnProductButton() {
		productPage.clickProductBtn();
	}
	@Then("Verify user is navigated to ALL PRODUCTS page successfully")
	public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
	   String ActualUrl = productPage.getProductPageUrl();
	   String ExpectedUrl="https://automationexercise.com/products";
	   Assert.assertEquals(ActualUrl, ExpectedUrl);
	}
	
	@Then("The products list is visible")
	public void theProductsListIsVisible() {
		Assert.assertTrue("Le texte du produit n'est pas affiché", productPage.allProductTextIsDisplayed()); 
		String productText =productPage.getAllProductText();
		System.out.println("Le texte du produit est : " + productText);
	}
	@When("Click on {string} of first product")
	public void clickOnOfFirstProduct(String string) {
	  productPage.clickViewProductBtn();
	}
	
	
	@Then("User is landed to product detail page")
	public void userIsLandedToProductDetailPage() {
		 String actualDetailProductUrl = productPage.getDetailProductUrl();
		  String expectedDetailProductUrl="https://automationexercise.com/product_details/1";
		  Assert.assertEquals(actualDetailProductUrl, expectedDetailProductUrl);
	}
	@Then("Verify that detail product name is visible")
	public void verifyThatDetailProductNameIsVisible() {
		boolean isProductNameVisible = productPage.nameProductIsDisplayed();
	    Assert.assertTrue("name not visible", isProductNameVisible);
	}
	@Then("Verify that category is visible")
	public void verifyThatCategoryIsVisible() {
	 boolean isProductCategoryVisible=productPage.categoryProductIsDisplayed();
	 Assert.assertTrue("category not visible", isProductCategoryVisible);
	}
	@Then("Verify that price is visible")
	public void verifyThatPriceIsVisible() {
		boolean isProductPriceVisible=productPage.priceProductIsDisplayed();
		Assert.assertTrue("category not visible", isProductPriceVisible);
	}
	@Then("Verify that availability is visible")
	public void verifyThatAvailabilityIsVisible() {
		boolean isProductCategoryVisible=productPage.availabilityProductIsDisplayed();
		Assert.assertTrue("category not visible", isProductCategoryVisible); 
	}
	@Then("Verify that condition is visible")
	public void verifyThatConditionIsVisible() {
		boolean isProductConditionVisible=productPage.conditionProductIsDisplayed();
		Assert.assertTrue("category not visible", isProductConditionVisible); 
	}
	@Then("Verify that brand is visible")
	public void verifyThatBrandIsVisible() {
		boolean isProductBrandVisible=productPage.brandProductIsDisplayed();
		Assert.assertTrue("category not visible", isProductBrandVisible); 
	}



}
