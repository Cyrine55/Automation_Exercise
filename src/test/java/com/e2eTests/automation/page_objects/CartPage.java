package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class CartPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Proceed To Checkout']")
	private static WebElement proceedToCheckoutBtn;
	@FindBy(how = How.XPATH, using = "//u[normalize-space()='Register / Login']")
	private static WebElement registerLoginBtn;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Address Details']")
	private static WebElement adressDetail;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Review Your Order']")
	private static WebElement reviewOrderText;
	
	
	
	
	
	
	
	
	public SeleniumUtils seleniumUtils;
	public CartPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
	}
	
	public String verifyUrlCartPage() {
		String actualCartPageUrl= Setup.getDriver().getCurrentUrl();
		return actualCartPageUrl;
	}
	public void clickProceedCheckoutBtn() {
		seleniumUtils.click(proceedToCheckoutBtn);	
	}
	public void clickRegisterLoginBtn() {
		seleniumUtils.click(registerLoginBtn);	
	}
	
	public void getAdressDetail() {
		adressDetail.getText();
	}
	public void reviewOrder() {
		reviewOrderText.getText();
	}

}
