
@VerifyAdress
Feature: Verify Adress Details In Checkout Page
  En tant que utilisateur je veux vérifier adresse dans la page checkout

  @VerifyAdress
  Scenario: Verify Adress Details In Checkout Page
   Given User navigates to the application
   And Verify that home page is visible successfully
   Then Click on Signup button
  And Enter name "cycyq"
    And Enter email "cycyq.syrinetest@gmail.com"
    And Click on Signupbutton
    And Verify that info "ENTER ACCOUNT INFORMATION" is visible
    And Choose the title
    And Enter Name and Password
      | name     | cycyq  |
      | password | Yefrni5 |
    And Choose date of Birth
    And Check Sign up for our newsletter
    And Enter the address information
      | First name | Yefrni  |
      | Last name  | cycyq  |
      | Compagny   | Test    |
      | Adress     | manouba |
      | Address2   | tunis   |
      | State      | tunisia |
      | city       | tunis   |
      | zip code   |    2010 |
    And Choose the country
    And Enter the Mobile number
    And Click on Create Account
    And Verify that account "ACCOUNT CREATED!" is visible
    And click on Continue button
    And Verify that username "Logged in as cycyq" is visible
When Hover over first product and click 'Add to cart'
    When Click on shop 'Continue Shopping' button
    When Hover over second product and click 'Add to cart'
    When Click view 'View Cart' button
    Then Verify that cart page is displayed
    When Click Proceed To Checkout
    Then Verify that the delivery address is same address filled at the time registration of account
    Then Verify that the billing address is same address filled at the time registration of account
    When Click delete 'Delete Account' button
    Then Verify that deletedd "ACCOUNT DELETED!" is visible
    When clicks 'Continue' button
    
  