package com.e2eTests.automation.page_objects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class AdressCheckoutPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//ul[@id='address_delivery']//li[@class='address_address1 address_address2'][2]")
	private static WebElement firstAdsDelivery;
	@FindBy(how = How.XPATH, using = "//ul[@id='address_delivery']//li[@class='address_address1 address_address2'][3]")
	private static WebElement secondAdsDelivery;
	@FindBy(how = How.XPATH, using = "//ul[@id='address_invoice']//li[@class='address_address1 address_address2'][2]")
	private static WebElement firstAdsBilling;
	@FindBy(how = How.XPATH, using = "//ul[@id='address_invoice']//li[@class='address_address1 address_address2'][3]")
	private static WebElement secondAdsBilling;
	
	SeleniumUtils seleniumUtils;
	public AdressCheckoutPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		
	}

	public String getDeliveryAdress1() {
		return firstAdsDelivery.getText().trim();
	}
	public String getDeliveryAdress2() {
		return secondAdsDelivery.getText().trim();
	}
	public String getBillingAdress1() {
		return firstAdsBilling.getText().trim();
	}
	public String getBillingAdress2() {
		return secondAdsBilling.getText().trim();
	}
	
}
