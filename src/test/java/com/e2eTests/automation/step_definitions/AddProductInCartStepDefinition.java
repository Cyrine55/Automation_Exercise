package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.AddProductsInCart;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductInCartStepDefinition {
	
	
	AddProductsInCart addProductsInCart;
	Validations validations;
public AddProductInCartStepDefinition() {
	addProductsInCart= new AddProductsInCart();
	validations = new Validations();
}


@When("Hover over first product and click {string}")
public void hoverOverFirstProductAndClick(String string) throws InterruptedException {
	addProductsInCart.scrollInto();
	addProductsInCart.mouseHoverToFirsProduct(); 
	addProductsInCart.clickOnAddToCartBtn();
}

@When("Click on shop {string} button")
public void clickOnShopButton(String string) {

    addProductsInCart.clickContinueShoppingBtn();
}
@When("Hover over second product and click {string}")
public void hoverOverSecondProductAndClick(String string) throws InterruptedException {
	addProductsInCart.hoverSecondProduct();	
	addProductsInCart.clickOnProduct2();
	
}


@When("Click view {string} button")
public void clickViewButton(String string) {
	addProductsInCart.clickOnViewCartBtn();
}
@Then("Verify both products are added to Cart")
public void verifyBothProductsAreAddedToCart()  {
	addProductsInCart.verifNumberofProduct();	
}


@Then("Verify their prices, quantity and total price")
public void verifyTheirPricesQuantityAndTotalPrice() {
	addProductsInCart.verifyPriceQuntity();
}















}
