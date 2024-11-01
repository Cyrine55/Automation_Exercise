package com.e2eTests.automation.page_objects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Validations;

public class BrandPage extends BasePage{
	@FindBy(how = How.XPATH, using = "//h2[@class='title text-center']")
	private static WebElement confirmBabyhugMsg;
	@FindBy(how = How.XPATH, using = "//a[@href='/brand_products/Madame']")
	private static WebElement confirmMadameMsg;
	
	
	
	SeleniumUtils seleniumUtils;

	public BrandPage() {
		super(Setup.getDriver());
	seleniumUtils = new SeleniumUtils();

	}
	
	public String getBabyConfirmText() {
		String actualBbay=seleniumUtils.readText(confirmBabyhugMsg);
		return actualBbay;
		
	}
	
	
	

}
