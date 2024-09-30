package com.e2eTests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
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

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Cart']")
	private static WebElement cartBtn;
	@FindBy(how = How.ID, using = "susbscribe_email")
	private static WebElement subscriptionInput;
	@FindBy(how = How.ID, using = "subscribe")
	private static WebElement subscribBtn;
	@FindBy(how = How.XPATH, using = "//*[@id=\"success-subscribe\"]/div")
	private static WebElement successMsg;

	public SeleniumUtils seleniumUtils;

	public HomePage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
	}

	public String getActualUrl() {
		return Setup.getDriver().getCurrentUrl();
	}

	public void clickOnSignUpBtn() {
		seleniumUtils.click(signuploginBtn);
	}

	public static void scrollIntoViewFooter() {
		JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", subscriptionInput);
	}

	public void enterEmailSubscribe() {
		seleniumUtils.writeText(subscriptionInput, "test@test.com");
	}

	public void clickOnCartBtn() {
		seleniumUtils.click(cartBtn);
	}
public void clickArrow() {
	seleniumUtils.click(subscribBtn);
}
	public String getSucessMsg() {
		return successMsg.getText();
	}
}
