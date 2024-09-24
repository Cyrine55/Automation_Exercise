package com.e2eTests.automation.step_definitions;

import java.util.Map;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.ContactUsPage;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsStepDefinition {
public ContactUsPage contactUsPage;
public Validations validations;


public ContactUsStepDefinition() {
	contactUsPage=new ContactUsPage();
	validations = new Validations();
}

@When("click on {string} button")
public void clickOnButton(String string) {
  contactUsPage.clickContact(); 
}

@When("Verify Texxt {string} is visible")
public void verifyTexxtIsVisible(String expectedContacttext) {
	String actualContactText=contactUsPage.getContactText();
	Assert.assertEquals(actualContactText, expectedContacttext);
}

@Then("User enters the details into Contact Us Form fields")
public void userEntersTheDetailsIntoContactUsFormFields(DataTable dataTableContact) {
	Map<String, String> dataMap = dataTableContact.asMap(String.class, String.class);
	contactUsPage.enterName(dataMap.get("name"));
	contactUsPage.enterEmail(dataMap.get("email"));
	contactUsPage.enterSubject(dataMap.get("subject"));
	contactUsPage.enterMessage(dataMap.get("message")); 
}

@Then("User Upload file")
public void userUploadFile() {
  contactUsPage.chooseFile();
}

@Then("Click submit {string} button")
public void clickSubmitButton(String string) {
	contactUsPage.clickSubmitBtn();
}
@Then("Click OK button")
public void clickOKButton() {
    contactUsPage.acceptAlert();
}
@Then("Verify the success message {string} is visible")
public void verifyTheSuccessMessageIsVisible(String expectedsuccess) {	
String actualsuccess=contactUsPage.getsuccess();
Assert.assertEquals(actualsuccess, expectedsuccess);
}
@Then("Verify that landed to home page successfully")
public void verifyThatLandedToHomePageSuccessfully() {
  
}




}
