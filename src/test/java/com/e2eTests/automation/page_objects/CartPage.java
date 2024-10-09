package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Wait;

public class CartPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-default check_out']")
	private static WebElement proceedToCheckoutBtn1;
	@FindBy(how = How.XPATH, using = "//u[normalize-space()='Register / Login']")
	private static WebElement registerLoginBtn;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Address Details']")
	private static WebElement adressDetail1;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Review Your Order']")
	private static WebElement reviewOrderText;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Continue']")
	private static WebElement continueBtn;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Cart']")
	private static WebElement cartbtn;
	@FindBy(how = How.XPATH, using = "//textarea[@name='message']")
	private static WebElement descriptionField;
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Place Order']")
	private static WebElement placeOrderBtn;
	@FindBy(how = How.ID, using = "submit")
	private static WebElement payConfirmBtn;

	public SeleniumUtils seleniumUtils;
	public Wait wait;

	public CartPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
	}

	public String verifyUrlCartPage() {
		String actualCartPageUrl = Setup.getDriver().getCurrentUrl();
		return actualCartPageUrl;
	}

	public void clickProceedCheckoutBtn() {
		seleniumUtils.click(proceedToCheckoutBtn1);
	}

	public void clickRegisterLoginBtn() {
		seleniumUtils.click(registerLoginBtn);
	}

	public void clickCartbtn() {
		seleniumUtils.click(cartbtn);
	}

	public String getAdressDetail() {

		return adressDetail1.getText();
	}

	public String reviewOrder() {
		return reviewOrderText.getText();
	}

	public void enterComment() {
		seleniumUtils.writeText(descriptionField, "CommentTest");
	}

	public void clickPlaceOrderBtn() {
		seleniumUtils.click(placeOrderBtn);
	}
	
public void clickPayConfirmBtn() {
	seleniumUtils.click(payConfirmBtn);
}

}
