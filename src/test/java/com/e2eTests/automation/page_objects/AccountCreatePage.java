package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class AccountCreatePage extends BasePage {
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Account Created!']")
	private static WebElement accountCreateText;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Continue']")
	private static WebElement continueBtn;
	@FindBy(how = How.XPATH, using = "//li[10]//a[1]")
	private static WebElement loggedUsernameText;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Delete Account']")
	private static WebElement deleteAccountBtn;
	

	public SeleniumUtils seleniumUtils;

	public AccountCreatePage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();

	}

	public String getaccountCreatedText() {
		return seleniumUtils.readText(accountCreateText);
	}
	public void clickContinue() {
		seleniumUtils.click(continueBtn);
	}
public String verifyUsername() throws InterruptedException {
	Thread.sleep(2000);
	return seleniumUtils.readText(loggedUsernameText);
}

public void clickDeleteAccount() {
	seleniumUtils.click(deleteAccountBtn);
}
}
