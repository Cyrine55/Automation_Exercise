package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class SignupPage extends BasePage{
	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Home']")
	private static WebElement homeBtn;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Signup / Login']")
	private static WebElement signupBtn;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='New User Signup!']")
	private static WebElement newSignupText;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private static WebElement nameInput;
	
	/* Constructor */
	
	public SignupPage() {
		super(Setup.getDriver());
	}

}
