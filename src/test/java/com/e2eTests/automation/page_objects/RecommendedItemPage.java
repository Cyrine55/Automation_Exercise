package com.e2eTests.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Wait;

public class RecommendedItemPage extends BasePage{

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='recommended items']")
	private static WebElement recommendedItemsText;
	@FindBy(how = How.CLASS_NAME, using = "recommended_items")
	private static WebElement recommendedContainer;
	@FindBy(how = How.XPATH, using = "//div[@class='item active']//div[2]//div[1]//div[1]//div[1]//a[1]")
	private static WebElement addCartPdt;
	@FindBy(how = How.XPATH, using = "//u[normalize-space()='View Cart']")
	private static WebElement viewCart;
	@FindBy(how = How.XPATH, using = "//div[@id='cart_info']/table/tbody/tr")
	private static WebElement tableProduct;
	
	SeleniumUtils seleniumUtils;
	Wait wait;
	public RecommendedItemPage() {
		super(Setup.getDriver());
		seleniumUtils= new SeleniumUtils();
		wait= new Wait(driver);

	}

	public void scrollBottomPage() {
		seleniumUtils.scrollIntoElement(recommendedContainer);
	}
	public String verifyRecommendedTextVisible() {
		return recommendedItemsText.getText();
	}
	
	public void addRecomendedProduct() {
		seleniumUtils.click(addCartPdt);
	}
	
	public void clickViewCart() {
		wait.waitUntilElementVisible(driver, viewCart);
		seleniumUtils.click(viewCart);
	}
	
	public boolean verifyRecommendedProductDisplay() {
		return tableProduct.isDisplayed();
		
	}
	
}
