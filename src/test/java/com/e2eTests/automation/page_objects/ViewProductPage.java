package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Validations;
import com.e2eTests.automation.utils.Wait;

public class ViewProductPage extends BasePage {
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Category']")
	private static WebElement categoryText;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Women']")
	private static WebElement womenCategorylink;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Tops']")
	private static WebElement TopssubCategory;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Men']")
	private static WebElement menCategorylink;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Jeans']")
	private static WebElement jeanssubCategory;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Women - Tops Products']")
	private static WebElement confirmMsg;
	@FindBy(how = How.XPATH, using = "//h2[@class='title text-center']")
	private static WebElement confirmJeansMsg;

	SeleniumUtils seleniumUtils;

	public ViewProductPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();

	}

	public String getCategoriesDisplayed() {
		return seleniumUtils.readText(categoryText);
	}

	public void clickOnWomenCategory() {
		seleniumUtils.click(womenCategorylink);
	}

	public void clickSubCategoryTOPS() {
		seleniumUtils.waitForElementToBeClickable(TopssubCategory);
		seleniumUtils.click(TopssubCategory);
	}

	public boolean getUrlSubCategory() {
		String url = driver.getCurrentUrl();
		return url.contains("category_products");
	}

	public String getConfirmText() {

		return seleniumUtils.readText(confirmMsg);
	}

	public void clickOnMenCategory() {
		seleniumUtils.click(menCategorylink);
	}

	public void clickOnJeanscategory() throws InterruptedException {
		seleniumUtils.waitForElementToBeClickable(jeanssubCategory);
		seleniumUtils.click(jeanssubCategory);
		Thread.sleep(3000);
	}

	public String getJeansText() {

		return seleniumUtils.readText(confirmJeansMsg);
	}
}
