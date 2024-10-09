package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class PaymentPage extends BasePage{
	
	@FindBy(how = How.XPATH, using = "//input[@name='name_on_card']")
	private static WebElement nameOnCartField;
	@FindBy(how = How.XPATH, using = "//input[@name='card_number']")
	private static WebElement cartNumberField;
	@FindBy(how = How.XPATH, using = "//input[ @name='cvc']")
	private static WebElement cvcField;
	@FindBy(how = How.XPATH, using = "//input[@name='expiry_month']")
	private static WebElement expirationMonthField;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='YYYY']")
	private static WebElement expirationYearField;
	
SeleniumUtils seleniumUtils;
	public PaymentPage() {
		super(Setup.getDriver());
		seleniumUtils =  new SeleniumUtils();
	}

	
	public void enterPaymentDetails(String nameOnCartText, String cartNumberText, String cvcText, String expirationMonthText, String expirationYearText) {
		seleniumUtils.writeText(nameOnCartField, nameOnCartText);
		seleniumUtils.writeText(cartNumberField, cartNumberText);
		seleniumUtils.writeText(cvcField, cvcText);
		seleniumUtils.writeText(expirationMonthField, expirationMonthText);
		seleniumUtils.writeText(expirationYearField, expirationYearText);
	}
}
