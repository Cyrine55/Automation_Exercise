package com.e2eTests.automation.page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Validations;
import static org.junit.Assert.assertEquals;

public class ProductDetailPage extends BasePage {
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Winter Top']")
	private static WebElement titleProduct;
	@FindBy(how = How.ID, using = "quantity")
	private static WebElement inputQuntity;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add to cart']")
	private static WebElement addCartBtn;
	@FindBy(how = How.XPATH, using = "//u[normalize-space()='View Cart']")
	private static WebElement viewCartBtn;
	@FindBy(how = How.XPATH, using = "//td[@class='cart_quantity']")
	private static WebElement quantityProductTable;

	SeleniumUtils seleniumUtils;
	Validations validations;

	public ProductDetailPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
	}

	public boolean verifyProductNameIsVisible() {
		return validations.isElementDisplayed(titleProduct);

	}

	public void increaseQuantity(String quantity) {
		seleniumUtils.writeText(inputQuntity, quantity);
		System.out.println(inputQuntity.getText());

	}

	public void clickOnAddCartBtn() {
		seleniumUtils.click(addCartBtn);
	}

	public void clickOnViewCartBtn() {
		seleniumUtils.waitForElementToBeClickable(viewCartBtn);
		seleniumUtils.click(viewCartBtn);
	}

	public void verifyQuantityOfProduct(String expectedQuantity) {

		String actualQuantityTable = quantityProductTable.getText();
		assertEquals("Les quantités ne sont pas égales", actualQuantityTable, expectedQuantity);
	}

}
