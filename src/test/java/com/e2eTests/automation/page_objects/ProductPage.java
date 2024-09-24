package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class ProductPage extends BasePage {
	@FindBy(how = How.XPATH, using = "//a[@href='/products']")
	private static WebElement productsBtn;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='All Products']")
	private static WebElement allProductText;
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]")
	private static WebElement addToCartBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	private static WebElement viewProductBtn;
	
	@FindBy(how = How.CSS, using = "div[class='product-information'] h2")
	private static WebElement detailNameProduct;
	@FindBy(how = How.CSS, using = "div:nth-child(2) > div:nth-child(1) > p:nth-child(3)")
	private static WebElement detailCategory;
	@FindBy(how = How.CSS, using = "div[class='product-information'] span span")
	private static WebElement detailPrice;
	@FindBy(how = How.XPATH, using = "//div[@class='product-information']/p[2]/b")
	private static WebElement detailAvailability;
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Condition:']")
	private static WebElement detailCondition;
	@FindBy(how = How.XPATH, using = "//b[normalize-space()='Brand:']")
	private static WebElement detailBrand;
	
	
	
	
	public SeleniumUtils seleniumUtils;

	public ProductPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
	}

	public void clickProductBtn() {
		seleniumUtils.click(productsBtn);
	}

	public String getProductPageUrl() {
		return Setup.getDriver().getCurrentUrl();
	}

	public String getAllProductText() {
		return allProductText.getText();
	}

	public boolean allProductTextIsDisplayed() {
		return allProductText.isDisplayed();
	}

	public void clickViewProductBtn() {
		seleniumUtils.click(viewProductBtn);
	}
	
	public String getDetailProductUrl() {
		return Setup.getDriver().getCurrentUrl();	
	}
	
	public boolean nameProductIsDisplayed() {
		return detailNameProduct.isDisplayed();
	}
	
	public boolean categoryProductIsDisplayed() {
		return detailCategory.isDisplayed();
	}
	public boolean priceProductIsDisplayed() {
		return detailPrice.isDisplayed();
	}
	
	public boolean availabilityProductIsDisplayed() {
		return detailAvailability.isDisplayed();
	}
	public boolean conditionProductIsDisplayed() {
		return detailCondition.isDisplayed();
	}
	
	public boolean brandProductIsDisplayed() {
		return detailBrand.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
