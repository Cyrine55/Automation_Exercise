package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class LoginPage extends BasePage{ 
	/* Retrieve element */

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='New User Signup!']")
	private static WebElement newSignupText;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private static WebElement nameInput;
	
	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-email']")
	private static WebElement mailInput;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Signup']")
	private static WebElement signupBtn;
	

/* Constructor */
	
	public SeleniumUtils seleniumUtils;
	
	public LoginPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
	}
	
	public String getVerifyText() {
		return seleniumUtils.readText(newSignupText);
	}
	
	public void enterName(String nameText) {
		seleniumUtils.writeText(nameInput, nameText);
	}
	
	public void enterEmail(String mailText) {
		seleniumUtils.writeText(mailInput, mailText);
	}
	
	public void clickOnSignUp() {
		seleniumUtils.click(signupBtn);
	}
}
