package com.e2eTests.automation.step_definitions;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.PaymentPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DownloadInvoiceStepDefinition {

	PaymentPage paymentPage;

	public DownloadInvoiceStepDefinition() {
		paymentPage = new PaymentPage();
	}
	
	
	@When("Click download invoice {string} button")
	public void clickDownloadInvoiceButton(String string) {
		paymentPage.clickDownloadInvoice();    
	}
	@Then("Verify invoice is downloaded cuccessfully")
	public void verifyInvoiceIsDownloadedCuccessfully() {
		  boolean isDownloaded = paymentPage.verifyDownlodedInvoice();  
		  Assert.assertTrue("L'invoice n'a pas été téléchargée avec succès", isDownloaded);
	}
	@When("Click on continue btn")
	public void clickOnContinueBtn() {
	   
	}



	
	
	
	
	
}
