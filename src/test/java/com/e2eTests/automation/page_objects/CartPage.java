package com.e2eTests.automation.page_objects;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
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

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Blue Top']")
	private static WebElement firstPdtToRemove;
	@FindBy(how = How.XPATH, using = "//*[@data-product-id]")
	private static WebElement firstIconPdtRemove;
	@FindBy(how = How.ID, using = "cart_info_table")
	private static WebElement table;

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

	public void clickRemoveIcon(String productDescription) throws InterruptedException {
	    List<WebElement> listeProduitsDansPanier = table.findElements(By.xpath("//tbody/tr"));
	    for (WebElement ligneProduit : listeProduitsDansPanier) {
	        try {
	            WebElement descriptionElement = ligneProduit.findElement(By.xpath(".//td[contains(@class, 'cart_description')]"));
	            String descriptionText = descriptionElement.getText();
	            
	            if (descriptionText.toLowerCase().contains(productDescription.toLowerCase())) {
	                System.out.println("Produit correspondant trouvé : " + descriptionText);
	                
	                WebElement iconRemove = ligneProduit.findElement(By.xpath(".//a[@class='cart_quantity_delete']"));
	                if (iconRemove != null) {
	                    seleniumUtils.clickOnElementUsingJs(iconRemove);
	                    System.out.println("Produit supprimé : " + descriptionText);
	                } else {
	                    System.out.println("L'icône de suppression n'est pas trouvée pour ce produit.");
	                }
	                break;
	            } else {
	                System.out.println("Produit non correspondant trouvé : " + descriptionText);
	            }
	            
	        } catch (NoSuchElementException e) {
	            System.out.println("Élément non trouvé dans cette ligne, vérification suivante.");
	        }
	    }
	}

	public void removedProduct(String productDescription) {
		List<WebElement> listeProduitsDansPanier = table.findElements(By.xpath("//tbody"));
		for (WebElement ligneProduit : listeProduitsDansPanier) {
			WebElement descriptionElement = wait.waitUntilElementVisible(driver,
					ligneProduit.findElement(By.xpath(".//td[contains(@class, 'cart_description')]")));
			Boolean displayed = descriptionElement.isDisplayed();
			Assert.assertTrue(displayed);
		}
	}
}
