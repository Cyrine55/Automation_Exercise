package com.e2eTests.automation.page_objects;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Wait;

public class SearchProductCartLoginPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//div[@class='features_items']")
	private static WebElement blocProducts;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue Shopping']")
	private static WebElement continuShopCarts;
	@FindBy(how = How.ID, using = "cart_info")
	private static WebElement tableInfo;
	
	SeleniumUtils seleniumUtils;
	Wait waitclass;

	public SearchProductCartLoginPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		waitclass = new Wait(driver);
	}

	public void addCarts() {
		List<WebElement> products = blocProducts.findElements(By.className("product-image-wrapper"));
		Actions action = new Actions(Setup.getDriver());
		int productSize = products.size();
		System.out.println("Nombre de produits : " + productSize);
		int i = 1;

		// Parcours chaque bouton dans la liste
		for (WebElement a : products) {
			System.out.println("Traitement du produit n° : " + (i));
			action.moveToElement(a).perform();
			seleniumUtils.clickOnElementUsingJs(a.findElement(By.className("add-to-cart")));
			System.out.println("click effectué : " + i);
			if (i < productSize) {
				seleniumUtils.waitForElementToBeClickable(continuShopCarts);
				seleniumUtils.click(continuShopCarts);
				seleniumUtils.waitForElementToInvisible(continuShopCarts);
				
			}
			i++;

		}

	}
	
	public boolean verifyProductAfterLogin() {
	List<WebElement> products =tableInfo.findElements(By.xpath("//tr"));
	int display=0;
	for(WebElement p:products) {
		if(p.isDisplayed()) {
		display++;	
		}
	}
	System.out.println(display);
	return true;
	}
	
}
