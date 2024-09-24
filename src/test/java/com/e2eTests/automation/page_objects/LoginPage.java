package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

public class LoginPage extends BasePage{ 
	/* Retrieve element */

	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='New User Signup!']")
	private static WebElement newSignupText;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
	private static WebElement nameInput;
	
	@FindBy(how = How.XPATH, using = "//input[@data-qa='signup-email']")
	private static WebElement mailInput;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Signup']")
	private static WebElement signupBtn;
	
	@FindBy(how = How.XPATH, using = "//h2[normalize-space()='Login to your account']")
	private static WebElement loginToAccountText;
	@FindBy(how = How.XPATH, using = "//input[@data-qa='login-email']")
	private static WebElement emailadressInput;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	private static WebElement passwordInput;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']")
	private static WebElement loginBtn;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Your email or password is incorrect!']")
	private static WebElement invalidLoginErrorText;

/* Constructor */
	
	public SeleniumUtils seleniumUtils;

	
	public LoginPage() {
		super(Setup.getDriver());
		seleniumUtils = new SeleniumUtils();
		
	}
	
	public String getVerifyText() {
		return seleniumUtils.readText(newSignupText);
	}
	
	public void enterName(String nameText) {
		seleniumUtils.writeText(nameInput, nameText);
	}
	
	public void enterEmail(String mailText) {
		seleniumUtils.writeText(mailInput, mailText);
	}
	
	public void clickOnSignUp() {
		seleniumUtils.click(signupBtn);
	}
	
	public String getVerifyAccountText() {
		return seleniumUtils.readText(loginToAccountText);
	}
	String adresseMail = "yefrni.syrinetest@gmail.com";
	String password = "Yefrni5";
	public void enterEmailAdress() {
		seleniumUtils.writeText(emailadressInput,adresseMail);	
	}
	public void enterPassword() {
		seleniumUtils.writeText(passwordInput,password);	
	}
	
	public void clickLogin() {
		seleniumUtils.click(loginBtn);
	}
	
	public void enterIncorrectEmail(String emailInvalid ) {
		seleniumUtils.writeText(emailadressInput, emailInvalid);
		}
	public void enterIncorrectMdp(String mdpInvalid ) {
		seleniumUtils.writeText(passwordInput, mdpInvalid);
		}
	public String geterrorInvalidMsg(){
		return seleniumUtils.readText(invalidLoginErrorText);
	}
}
