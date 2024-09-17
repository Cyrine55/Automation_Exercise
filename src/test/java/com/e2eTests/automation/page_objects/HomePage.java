package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class HomePage extends BasePage {
	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Home']")
	private static WebElement homeBtn;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Signup / Login']")
	private static WebElement signuploginBtn;
	
	
	
	public SeleniumUtils seleniumUtils;
	public HomePage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
	}
	
	public String getActualUrl() {
		return  Setup.getDriver().getCurrentUrl();
	}
	
	public void clickOnSignUpBtn() {
		seleniumUtils.click(signuploginBtn);
	}
	
}
