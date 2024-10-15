package com.e2eTests.automation.step_definitions;

import java.util.Map;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.CartPage;
import com.e2eTests.automation.page_objects.HomePage;
import com.e2eTests.automation.page_objects.PaymentPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterWhileCheckoutStepDefinition {

	CartPage cartPage;
	HomePage homePage;
	PaymentPage paymentPage;

	public RegisterWhileCheckoutStepDefinition() {
		cartPage = new CartPage();
		homePage = new HomePage();
		paymentPage = new PaymentPage();
	}

	@Then("Verify that cart page is displayed")
	public void verifyThatCartPageIsDisplayed() {
		String ExpectedCartUrl = "https://automationexercise.com/view_cart";
		String ActualUrlCartPage = cartPage.verifyUrlCartPage();
		Assert.assertEquals(ActualUrlCartPage, ExpectedCartUrl);
	}

	@When("Click on register {string} button")
	public void clickOnRegisterButton(String string) {
		cartPage.clickRegisterLoginBtn();
	}

	@When("Click on cartbtn {string} button")
	public void clickOnCartBtnButton(String string) {
		cartPage.clickCartbtn();
	}

	@And("Click Proceed To Checkout")
	public void clickProceedToCheckout() {
		cartPage.clickProceedCheckoutBtn();
	}

	@Then("Verify message {string} and {string}")
	public void verifyMessageAnd(String expectedAddressDetail, String expectedReviewDetails) {
		String actualAddressDetails = cartPage.getAdressDetail();

		Assert.assertEquals(actualAddressDetails, expectedAddressDetail);

		String actualReviewDetails = cartPage.reviewOrder();

		Assert.assertEquals(actualReviewDetails, expectedReviewDetails);
	}

	@Then("Verify {string} and click {string} button")
	public void verifyAndClickButton(String string, String string2) {
		homePage.clickOnCartBtn();
	}

	@Then("Verify {string} at top")
	public void verifyAtTop(String string) {

	}

	@When("Enter description in comment text area and click {string}")
	public void enterDescriptionInCommentTextAreaAndClick(String string) {
		cartPage.enterComment();
		cartPage.clickPlaceOrderBtn();
	}

	@When("Enter payment details")
	public void enterPaymentDetails(DataTable dataTablePaymentDetails) {
		Map<String, String> dataMap = dataTablePaymentDetails.asMap(String.class, String.class);
		paymentPage.enterPaymentDetails(dataMap.get("NameOnCard"), dataMap.get("CardNumber"), dataMap.get("CVC"),
				dataMap.get("ExpirationMonth"), dataMap.get("ExpirationYear"));

	}

	@When("Click pay {string} button")
	public void clickPayButton(String string) {
		cartPage.clickPayConfirmBtn();
	}

	@Then("Verify success message {string}")
	public void verifySuccessMessage(String string) {

	}

	@When("Click delete {string} button")
	public void clickDeleteButton(String string) {
		paymentPage.clickOnDeleteBtn();
	}

	@When("click {string} button")
	public void clickButton(String string) {
		cartPage.clickProceedCheckoutBtn();
	}

	@Then("Verify that deletedd {string} is visible")
	public void verifyThatDeleteddIsVisible(String deleteMsg) {
		Assert.assertEquals(paymentPage.verifySuccessDelete(), deleteMsg);
	}

	@When("clicks {string} button")
	public void clicksButton(String string) {
		paymentPage.clickContinue();
	}
}
