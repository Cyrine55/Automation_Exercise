package com.e2eTests.automation.page_objects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.junit.Assert;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Wait;

public class SearchProductPage extends BasePage {

	@FindBy(how = How.ID, using = "search_product")
	private static WebElement searchInput;
	@FindBy(how = How.ID, using = "submit_search")
	private static WebElement submitSearchBtn;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Searched Products']")
	private static WebElement searchedPdtText;
	@FindBy(how = How.XPATH, using = "//div[@class='features_items']")
	private static WebElement productsBloc;

	SeleniumUtils seleniumUtils;
	Wait waitclass;

	public SearchProductPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		waitclass = new Wait(driver);
	}

	public void enterProductText(String productname) {
		seleniumUtils.writeText(searchInput, productname);
	}

	public void clickSearchBtn() {
		seleniumUtils.click(submitSearchBtn);

	}

	public String getSearchedProducts() {
		waitclass.waitUntilElementVisible(driver, searchedPdtText);
		return searchedPdtText.getText();
	}

	public void getListProductSearched(String productname) {
		List<WebElement> listeproductelements = productsBloc.findElements(By.className("product-details"));
		int size = 0;
		for (WebElement listproduct : listeproductelements) {

			String element = listproduct.getText();
			if (element.toLowerCase().contains(productname.toLowerCase()) && listproduct.isDisplayed()) {
				size = size + 1;
			}

		}
		int sizeList = listeproductelements.size();
		Assert.assertEquals(size, sizeList);
	}
}
