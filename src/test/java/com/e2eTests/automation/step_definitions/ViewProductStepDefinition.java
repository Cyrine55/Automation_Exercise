package com.e2eTests.automation.step_definitions;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.ViewProductPage;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewProductStepDefinition {
	
	Validations validations ; 
	ViewProductPage viewProductPage;
	public ViewProductStepDefinition() {
		validations = new Validations();
		viewProductPage= new ViewProductPage();
	}
	
	@Then("Verify that categories are visible on left side bar")
	public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
	   String actualCategoryText=viewProductPage.getCategoriesDisplayed();
	   String expectedCategoryText="CATEGORY";
	   Assert.assertEquals(actualCategoryText, expectedCategoryText);
	}
	@When("Click on Women category")
	public void clickOnWomenCategory() {
		viewProductPage.clickOnWomenCategory();  
	}
	
	@When("Click on sub Category TOPS")
	public void clickOnSubCategoryTOPS() {
		viewProductPage.clickSubCategoryTOPS();  
	}
	@Then("Verify that category page is displayed")
	public void verifyThatCategoryPageIsDisplayed() {
		boolean urlContainsSubcategory =viewProductPage.getUrlSubCategory();
		Assert.assertTrue("L'URL ne contient pas le mot-clé de la sous-catégorie", urlContainsSubcategory);
	}
	@Then("Verify that confirm text {string}")
	public void verifyThatConfirmText(String expectedConfirmMsg) {
	  String ActualConfirmText=viewProductPage.getConfirmText();
	  Assert.assertEquals(ActualConfirmText, expectedConfirmMsg);
	}
	@When("Click on category link {string}")
	public void clickOnCategoryLink(String string) {
		viewProductPage.clickOnMenCategory();  
	}
	@When("Click on sub category JEANS")
	public void clickOnSubCategoryJEANS() throws InterruptedException {
		viewProductPage.clickOnJeanscategory(); 
	}
	@Then("Verify that text {string} is displayed")
	public void verifyThatTextIsDisplayed(String expectedMenConfirmText) {
	   String ActualMenConfirmText= viewProductPage.getJeansText();
	   Assert.assertEquals(ActualMenConfirmText, expectedMenConfirmText);
	}



}
