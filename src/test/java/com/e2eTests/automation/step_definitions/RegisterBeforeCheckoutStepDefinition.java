package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.CartPage;
import com.e2eTests.automation.page_objects.HomePage;
import com.e2eTests.automation.page_objects.PaymentPage;
import com.e2eTests.automation.page_objects.RegisterUserPage;

import io.cucumber.java.en.When;

public class RegisterBeforeCheckoutStepDefinition {

	CartPage cartPage;
	HomePage homePage;
	PaymentPage paymentPage;
	RegisterUserPage registerUserPage;

	public RegisterBeforeCheckoutStepDefinition() {
		cartPage = new CartPage();
		homePage = new HomePage();
		paymentPage = new PaymentPage();
		registerUserPage = new RegisterUserPage();
	}

	@When("Choose the title gender {string}")
	public void chooseTheTitleGender(String gendertitle) {
		if (gendertitle.equalsIgnoreCase("Mr")) {
			registerUserPage.chooseGenderMr();
		} else if (gendertitle.equalsIgnoreCase("Mrs")) {
			registerUserPage.chooseTitleMrs();

		}
	}

	@When("User writes Name {string}")
	public void userWritesNameCyrinetest(String Name) {
		registerUserPage.outlineWriteName(Name);
	}

	@When("User writes Password {int}")
	public void userWritesPassword(Integer pass) {
		registerUserPage.outlineWritePassword(pass);
	}

	@When("User writes FirstName {string}")
	public void userWritesFirstNameFirsnametest(String FirstName) {
		registerUserPage.outlineWriteFirstName(FirstName);
	}

	@When("User writes LastName {string}")
	public void userWritesLastNameLastNametest(String lastName) {
		registerUserPage.outlineWriteLastName(lastName);
	}

	@When("User writes Compagny {string}")
	public void userWritesCompagnyCompagnytest(String compagnyName) {
		registerUserPage.outlineWriteCompagnyName(compagnyName);
	}

	@When("User writes Adress {string}")
	public void userWritesAdressAdresstest(String adress) {
		registerUserPage.outlineAdress(adress);
	}

	@When("User writes Adress2 {string}")
	public void userWritesAdress2Adress2test(String adress2) {
		registerUserPage.outlineAdress2(adress2);
	}

	@When("User writes State {string}")
	public void userWritesStateStatetest(String state) {
		registerUserPage.outlineState(state);
	}

	@When("User writes City {string}")
	public void userWritesCityCitytest(String city) {
		registerUserPage.outlinecity(city);
	}

	@When("User writes Zipcode {int}")
	public void userWritesZipcode(Integer Zipcode) {
registerUserPage.outlineWriteZipcode(Zipcode);
	}

}
