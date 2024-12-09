package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.HomePage;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyScrollWithArrowStepDefinition {
	HomePage homePage;
	public VerifyScrollWithArrowStepDefinition() {
		homePage=new HomePage();
	}
	@When("Scroll down page to bottom")
	public void scrollDownPageToBottom() {
		homePage.scrollIntoBottom();
	}
	@Then("Verify subscription {string} text is visible")
	public void verifySubscriptionTextIsVisible(String expectedSubsriptionText) {
	   String actualSubscriptionText=homePage.getSubscriptionText();
	   Assert.assertEquals(actualSubscriptionText,expectedSubsriptionText);
	}
	

	@When("Click on arrow at bottom right side to move upward")
	public void clickOnArrowAtBottomRightSideToMoveUpward() {
		homePage.clickArrowBtn();  
	}



	@Then("Veify that page is scrolled up and {string} text is visible on screen")
	public void veifyThatPageIsScrolledUpAndTextIsVisibleOnScreen(String expected) {
	    String actualtext= homePage.getText();
	    Assert.assertEquals(actualtext,expected);
	}



}
