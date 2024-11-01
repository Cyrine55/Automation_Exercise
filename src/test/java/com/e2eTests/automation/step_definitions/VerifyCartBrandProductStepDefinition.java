package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.BrandPage;
import com.e2eTests.automation.page_objects.ProductPage;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyCartBrandProductStepDefinition {
	Validations validations;
	BrandPage brandPage;
	ProductPage productPage;

	public VerifyCartBrandProductStepDefinition() {
		validations = new Validations();
		brandPage = new BrandPage();
		productPage = new ProductPage();
	}

	@Then("Verify that Brands are visible on left side bar")
	public void verifyThatBrandsAreVisibleOnLeftSideBar() {
		String ActualBrandMenuText = productPage.VerifyBrandVisible();
		String ExpectedBrandMenuText = "BRANDS";
		Assert.assertEquals(ActualBrandMenuText, ExpectedBrandMenuText);
	}

	@When("Click on {string} brand name")
	public void clickOnBrandName(String string) {
		productPage.clickOnBabyhugBrand();
	}

	@Then("Verify User navigate on Babyhug brand")
	public void verifyUserNavigateOnBabyhugBrand() {
		String expectedURL = "https://automationexercise.com/brand_products/Babyhug";
		validations.checkChangedURL(expectedURL);
	}

	@Then("Verify Baby confirm text {string} is displayed")
	public void verifyBabyConfirmTextIsDisplayed(String expectedConfirmBabyText) {
		String actualBabyConfirmBrand = brandPage.getBabyConfirmText();
		System.out.println("Expected text: '" + expectedConfirmBabyText.trim().replaceAll("\\s+", " ") + "'");
		System.out.println("Actual text: '" + actualBabyConfirmBrand.trim().replaceAll("\\s+", " ") + "'");
		Assert.assertEquals(expectedConfirmBabyText.trim().replaceAll("\\s+", " "),
				actualBabyConfirmBrand.trim().replaceAll("\\s+", " "));
	}

	@When("Click on any brand {string}")
	public void clickOnAnyBrand(String string) {
		productPage.clickMadameBrand();
	}

	@Then("Verify User navigate on Madame brand")
	public void verifyUserNavigateOnMadameBrand() {
		String ExpectedMadameContainUrl = "https://automationexercise.com/brand_products/Madame";
		validations.checkChangedURL(ExpectedMadameContainUrl);
	}

}
