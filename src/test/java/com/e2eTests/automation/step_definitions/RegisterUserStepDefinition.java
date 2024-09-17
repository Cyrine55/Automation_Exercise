package com.e2eTests.automation.step_definitions;

import static org.testng.Assert.assertTrue;

import java.util.Map;

import org.junit.Assert;

import com.e2eTests.automation.page_objects.AccountCreatePage;
import com.e2eTests.automation.page_objects.HomePage;
import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.page_objects.RegisterUserPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;
import com.e2eTests.automation.utils.Validations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegisterUserStepDefinition {
	public HomePage homePage;
	public LoginPage loginPage;
	public AccountCreatePage accountCreatePage;
	public Validations validations;
	public RegisterUserPage registerUserPage;
	public ConfigFileReader configFileReader;

	public RegisterUserStepDefinition() {
		homePage = new HomePage();
		loginPage = new LoginPage();
		accountCreatePage = new AccountCreatePage();
		validations = new Validations();
		registerUserPage = new RegisterUserPage();
		configFileReader = new ConfigFileReader();
	}

	@Given("User navigates to the application")
	public void userNavigatesToTheApplication() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

	@Given("Verify that home page is visible successfully")
	public void verifyThatHomePageIsVisibleSuccessfully() {
		String actualUrl = homePage.getActualUrl();
		String expectedUrl = "https://automationexercise.com/";
		Assert.assertEquals(actualUrl, expectedUrl);

	}

	@Then("Click on Signup button")
	public void clickOnSignupButton() {
		homePage.clickOnSignUpBtn();
	}

	@Then("Verify {string} is visible")
	public void verifyIsVisible(String newSignupText) {
		String actualVerifyText = loginPage.getVerifyText();
		Assert.assertEquals(actualVerifyText, newSignupText);
	}

	@Then("Enter name {string}")
	public void enterName(String nameText) {
		loginPage.enterName(nameText);
	}

	@Then("Enter email {string}")
	public void enterEmail(String mailText) {
		loginPage.enterEmail(mailText);
	}

	@Then("Click on Signupbutton")
	public void clickOnSignupButn() {
		loginPage.clickOnSignUp();
	}

	@Then("Verify that info {string} is visible")
	public void verifyThatInfoIsVisible(String expectedInfoAccountText) {
		String actualInfoAccountText = registerUserPage.infoAccountText();
		Assert.assertEquals(actualInfoAccountText, expectedInfoAccountText);
	}

	@Then("Choose the title")
	public void chooseTheTitle() {
		registerUserPage.chooseTitle();
	}

	@Then("Enter Name and Password")
	public void enterNameAndPassword(DataTable dataTableAccount) {
		// Convertir le DataTable en une Map<String, String>
		Map<String, String> dataMap = dataTableAccount.asMap(String.class, String.class);
		registerUserPage.enterName(dataMap.get("name"));
		registerUserPage.enterPassword(dataMap.get("password"));
	}

	@Then("Choose date of Birth")
	public void chooseDateOfBirth() {
		registerUserPage.selectDay("5");
		registerUserPage.selectMonth("May");
		registerUserPage.selectYear("2020");
	}

	@Then("Check Sign up for our newsletter")
	public void checkSignUpForOurNewsletter() {
		registerUserPage.checknewslatter();
	}

	@And("Enter the address information")
	public void enterTheAddressInformation(DataTable dataTableAdress) {
		Map<String, String> dataMap = dataTableAdress.asMap(String.class, String.class);
		registerUserPage.entrerAdressInfo(dataMap.get("First name"), dataMap.get("Last name"), dataMap.get("Compagny"),
				dataMap.get("Adress"), dataMap.get("Address2"), dataMap.get("State"), dataMap.get("city"),
				dataMap.get("zip code"));

	}

	@Then("Choose the country")
	public void chooseTheCountry() {
		registerUserPage.chooseCountry();
	}

	@Then("Enter the Mobile number")
	public void enterTheMobileNumber() {
		registerUserPage.enterPhone();
	}

	@Then("Click on Create Account")
	public void clickOnCreateAccount() {
		registerUserPage.createAccount();
	}

	@Then("Verify that account {string} is visible")
	public void verifyThatAccountIsVisible(String expectedAccountMsg) {
		String actualAccountText = accountCreatePage.getaccountCreatedText();
		Assert.assertEquals(actualAccountText, expectedAccountMsg);

	}

	@Then("click on Continue button")
	public void clickOnContinueButton() {
		accountCreatePage.clickContinue();
	}

	@Then("Verify that username {string} is visible")
	public void verifyThatUsernameIsVisible(String usertaccountMsg) throws InterruptedException  {
String actualUsername = accountCreatePage.verifyUsername();
Assert.assertEquals(actualUsername,usertaccountMsg);
	}

	

	@Then("Click Delete Account button")
	public void clickDeleteAccountButton() {
accountCreatePage.clickDeleteAccount();
	}

	@Then("Verify that deleted {string} is visible")
	public void verifyThatDeletedIsVisible(String deleteMsg) {

	}

}
