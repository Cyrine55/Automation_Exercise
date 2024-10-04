package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.HomePage;
import com.e2eTests.automation.page_objects.ProductDetailPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyProductCuantityCartStepDefinition {

	public ProductDetailPage productDetailPage;
	public HomePage homePage;
	private String expectedQuantity;

	public VerifyProductCuantityCartStepDefinition() {
		productDetailPage = new ProductDetailPage();
		homePage = new HomePage();

	}

	@When("Click on view {string} for any product on home page")
	public void clickOnViewForAnyProductOnHomePage(String string) {
		homePage.clickOnProduct();
	}

	@Then("Verify product detail is opened")
	public void verifyProductDetailIsOpened() {
		boolean resultat = productDetailPage.verifyProductNameIsVisible();
		Assert.assertTrue("resultat incorrecte", resultat);
	}

	@When("Increase quantity to {string}")
	public void increaseQuantityTo(String quantity) {
		expectedQuantity = quantity;
		productDetailPage.increaseQuantity(quantity);
	}

	@When("Click on add {string} button")
	public void clickOnAddButton(String string) {
		productDetailPage.clickOnAddCartBtn();
	}

	@When("Click on view {string} button")
	public void clickOnViewButton(String string) {
		productDetailPage.clickOnViewCartBtn();
	}

	@Then("Verify that product is displayed in cart page with exact quantity")
	public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
		productDetailPage.verifyQuantityOfProduct(expectedQuantity);
	}

}
