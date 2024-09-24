package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class ContactUsPage extends BasePage {
	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Contact us']")
	private static WebElement contactUsBtn;
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Get In Touch']")
	private static WebElement contaxtText;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private static WebElement nameContactText;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
	private static WebElement emailContactText;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Subject']")
	private static WebElement subjectContactText;
	@FindBy(how = How.ID, using = "message")
	private static WebElement msgContactText;

	@FindBy(how = How.XPATH, using = "//input[@name='upload_file']")
	private static WebElement chooseFileBtn;

	@FindBy(how = How.XPATH, using = "//div[@class='status alert alert-success']")
	private static WebElement success;
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	private static WebElement submitBtn;

	public SeleniumUtils seleniumUtils;

	public ContactUsPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
	}

	public void clickContact() {
		seleniumUtils.click(contactUsBtn);
	}

	public String getContactText() {
		return contaxtText.getText();
	}

	public void enterName(String contactnameText) {
		seleniumUtils.writeText(nameContactText, contactnameText);
	}

	public void enterEmail(String emailcontactText) {
		seleniumUtils.writeText(emailContactText, emailcontactText);
	}

	public void enterSubject(String subjectcontactText) {
		seleniumUtils.writeText(subjectContactText, subjectcontactText);
	}

	public void enterMessage(String messagecontactText) {
		seleniumUtils.writeText(msgContactText, messagecontactText);
	}

	public void clickSubmitBtn() {
		seleniumUtils.click(submitBtn);

	}

	public String getsuccess() {
		return success.getText();
	}

	public void acceptAlert() {
		seleniumUtils.acceptAlert();
	}

	/*public void clickChooseBtn() {
		seleniumUtils.click(chooseFileBtn);
	}*/
	
	public void chooseFile() {
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\configs\\Data.xlsx";
		chooseFileBtn.sendKeys(path);
	}

}
