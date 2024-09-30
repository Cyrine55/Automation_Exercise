package com.e2eTests.automation.page_objects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Wait;
import org.junit.Assert;

public class AddProductsInCart extends BasePage {
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	private static WebElement add;
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]")
	private static WebElement firstProduct;
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]")
	private static WebElement addToCartBtn;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Continue Shopping']")
	private static WebElement continueShoppingBtn;
	@FindBy(how = How.XPATH, using = "//div[3]//div[1]//div[1]//div[2]//div[1]//a[1]")
	private static WebElement assPdt2;

	@FindBy(how = How.XPATH, using = "//div[3]//div[1]//div[1]//div[2]")
	private static WebElement product2;
	@FindBy(how = How.XPATH, using = "//u[normalize-space()='View Cart']")
	private static WebElement viewCartBtn;

	@FindBy(how = How.ID, using = "cart_info_table")
	private static WebElement table;

	SeleniumUtils seleniumUtils;
	Wait waitclass;

	public AddProductsInCart() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		waitclass = new Wait(driver);
	}

	public static void scrollInto() {
		JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", add);
	}

	public void mouseHoverToFirsProduct() {
		Actions action = new Actions(Setup.getDriver());
		action.moveToElement(firstProduct).build().perform();

	}

	public void clickContinueShoppingBtn() {
		waitclass.waitUntilClic(driver, continueShoppingBtn);
		seleniumUtils.click(continueShoppingBtn);

	}

	public void hoverSecondProduct() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", product2);
		seleniumUtils.mouseHover(product2);
	}

	public void clickOnAddToCartBtn() throws InterruptedException {
		Thread.sleep(2000);
		seleniumUtils.click(addToCartBtn);

	}

	public void clickOnProduct2() throws InterruptedException {
		Thread.sleep(2000);
		seleniumUtils.click(assPdt2);
	}

	public void clickOnViewCartBtn() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", viewCartBtn);

	}

	public void verifNumberofProduct() {

		List<WebElement> listeProduitsDansPanier = table.findElements(By.xpath("//tr"));
		int nbrProduits = listeProduitsDansPanier.size();
		System.out.println(nbrProduits);
	}

	public void verifyPriceQuntity() {
		List<WebElement> listeProduitsDansPanier = table.findElements(By.xpath("//tr"));
		Integer succesValidation = 0;
		for (WebElement element : listeProduitsDansPanier) {
			String strprice = element.findElement(By.xpath("//td[@class='cart_price']")).getText();
			String price = strprice.substring(4);
			int priceVal = Integer.parseInt(price);

			String quantity = element.findElement(By.xpath("//td[@class='cart_quantity']")).getText();
			int quantityval = Integer.parseInt(quantity);

			String strtotal = element.findElement(By.xpath("//td[@class='cart_total']")).getText();
			String total = strtotal.substring(4);
			int totalval = Integer.parseInt(total);

			if (priceVal * quantityval == totalval) {
				succesValidation++;
			}
			Assert.assertEquals("Le total n'est pas correct pour le produit", priceVal * quantityval, totalval);
		}

		

	}

}
