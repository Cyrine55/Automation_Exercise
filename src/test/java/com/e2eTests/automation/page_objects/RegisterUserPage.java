package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SelectFromListUtils;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.datatable.DataTable;

public class RegisterUserPage extends BasePage {
	/* Retrieve element */

	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Enter Account Information')]")
	private static WebElement enterAccountInfoText;

	@FindBy(how = How.ID, using = "id_gender2")
	private static WebElement titleRadioMrs;
	@FindBy(how = How.ID, using = "id_gender1")
	private static WebElement titlegenderMr;

	@FindBy(how = How.ID, using = "name")
	private static WebElement nameField;

	@FindBy(how = How.ID, using = "name")
	private static WebElement emailField;

	@FindBy(how = How.ID, using = "password")
	private static WebElement passwordField;

	@FindBy(how = How.ID, using = "days")
	private static WebElement days;

	@FindBy(how = How.ID, using = "months")
	private static WebElement months;

	@FindBy(how = How.ID, using = "years")
	private static WebElement years;

	@FindBy(how = How.ID, using = "newsletter")
	private static WebElement newsletterCheckbox;

	@FindBy(how = How.ID, using = "first_name")
	private static WebElement firstName;

	@FindBy(how = How.ID, using = "last_name")
	private static WebElement lastName;

	@FindBy(how = How.XPATH, using = "//input[@id='company']")
	private static WebElement compagny;

	@FindBy(how = How.XPATH, using = "//input[@id='address1']")
	private static WebElement address;

	@FindBy(how = How.XPATH, using = "//input[@id='address2']")
	private static WebElement address2;

	@FindBy(how = How.ID, using = "country")
	private static WebElement countrySelect;

	@FindBy(how = How.ID, using = "state")
	private static WebElement stateField;

	@FindBy(how = How.ID, using = "city")
	private static WebElement city;

	@FindBy(how = How.ID, using = "zipcode")
	private static WebElement zipcode;

	@FindBy(how = How.ID, using = "mobile_number")
	private static WebElement mobileNumber;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Create Account']")
	private static WebElement createAccountBtn;

	/* Constructor */

	public SeleniumUtils seleniumUtils;
	public SelectFromListUtils selectFromListUtils;

	public RegisterUserPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		selectFromListUtils = new SelectFromListUtils();
	}

	public String infoAccountText() {
		return seleniumUtils.readText(enterAccountInfoText);
	}

	public void chooseTitleMrs() {
		seleniumUtils.click(titleRadioMrs);
	}

	public void enterName(String nameText) {
		seleniumUtils.writeText(nameField, nameText);
	}

	public void enterPassword(String passwordText) {
		seleniumUtils.writeText(passwordField, passwordText);
	}

	public void selectDay(String daysText) {
		selectFromListUtils.selectDropDownListByVisibleText(days, daysText);
	}

	public void selectMonth(String montText) {
		selectFromListUtils.selectDropDownListByVisibleText(months, montText);
	}

	public void selectYear(String yearsText) {
		selectFromListUtils.selectDropDownListByVisibleText(years, yearsText);
	}

	public void checknewslatter() {
		seleniumUtils.click(newsletterCheckbox);
	}

	public void entrerAdressInfo(String firstNameText, String lastNameText, String companyText, String adressText,
			String adress2Text, String stateText, String cityText, String zipcodeText) {
		seleniumUtils.writeText(firstName, firstNameText);
		seleniumUtils.writeText(lastName, lastNameText);
		seleniumUtils.writeText(compagny, companyText);
		seleniumUtils.writeText(address, adressText);
		seleniumUtils.writeText(address2, adress2Text);
		seleniumUtils.writeText(stateField, stateText);
		seleniumUtils.writeText(city, cityText);
		seleniumUtils.writeText(zipcode, zipcodeText);
	}

	public void chooseCountry() {
		seleniumUtils.click(countrySelect);
	}

	public void enterPhone() {
		seleniumUtils.writeText(mobileNumber, "25547126");
	}

	public void createAccount() {
		seleniumUtils.click(createAccountBtn);
	}

	public void chooseGenderMr() {
		seleniumUtils.click(titlegenderMr);
	}

	public void outlineWriteName(String outlineName) {
		seleniumUtils.writeText(nameField, outlineName);
	}

	public void outlineWriteZipcode(int zipcodeText) {
		zipcode.sendKeys(String.valueOf(zipcodeText));
	}
	
	public void outlineWritePassword(int passwordText) {
		passwordField.sendKeys(String.valueOf(passwordText));
	}
	public void outlineWriteFirstName(String outlineFirstName) {
		seleniumUtils.writeText(firstName, outlineFirstName);
	}
	
	public void outlineWriteLastName(String outlineLastName) {
		seleniumUtils.writeText(lastName, outlineLastName);
		
	}
	
	public void outlineWriteCompagnyName(String compagnNameText) {
		seleniumUtils.writeText(compagny, compagnNameText);
		
	}
	
	public void outlineAdress(String adressText) {
		seleniumUtils.writeText(address, adressText);
	}
	
	public void outlineAdress2(String adressText2) {
		seleniumUtils.writeText(address2, adressText2);
	}
	
	public void outlineState(String stateText) {
		seleniumUtils.writeText(stateField, stateText);
	}
	
	public void outlinecity(String cityText) {
		seleniumUtils.writeText(city, cityText);	
	}
	
	
	
	
	
}
