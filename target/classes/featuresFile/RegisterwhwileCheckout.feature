@Register-WhileCheckout
Feature: Register while checkout
  En tant que utilisateur je veux inscrire lors du paiement

  @Register-While-Checkout
  Scenario: Register while checkout
    Given User navigates to the application
    And Verify that home page is visible successfully
    And Click on Product button
    When Hover over first product and click 'Add to cart'
    When Click on shop 'Continue Shopping' button
    When Hover over second product and click 'Add to cart'
    When Click view 'View Cart' button
    Then Verify that cart page is displayed
    When Click Proceed To Checkout
    When Click on register 'Register / Login' button
    And Enter name "cycwaa"
    And Enter email "yefrni.cycwaa@gmail.com"
    And Click on Signupbutton
    And Verify that info "ENTER ACCOUNT INFORMATION" is visible
    And Choose the title
    And Enter Name and Password
      | name     | cycwaa |
      | password | Yefr1r |
    And Choose date of Birth
    And Check Sign up for our newsletter
    And Enter the address information
      | First name | cycwaa  |
      | Last name  | cycwaa  |
      | Compagny   | Test1    |
      | Adress     | manouba1 |
      | Address2   | tunis1   |
      | State      | tunisia1 |
      | city       | tunis1   |
      | zip code   |    20101 |
    And Choose the country
    And Enter the Mobile number
    And Click on Create Account
    And Verify that account "ACCOUNT CREATED!" is visible
    And click on Continue button
    Then Verify ' Logged in as cycwaa' at top
    When Click on cartbtn 'Cart' button
    When Click Proceed To Checkout
    Then Verify message 'Address Details' and 'Review Your Order'
    When Enter description in comment text area and click 'Place Order'
    When Enter payment details
      | NameOnCard | nameTest  |
      | CardNumber  | 00123456  |
      | CVC   | 555    |
      | ExpirationMonth | 05|
      | ExpirationYear | 2147|
    When Click pay 'Pay and Confirm Order' button
    Then Verify success message 'Your order has been placed successfully!'
    When Click delete 'Delete Account' button
    Then Verify that deleted "ACCOUNT DELETED!" is visible 
    When  click 'Continue' button
