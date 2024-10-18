@Register-BeforeCheckout
Feature: Register while checkout
  En tant que utilisateur je veux inscrire avant le paiement

  @Register-Before-Checkout
  Scenario Outline: Register Before checkout
    Given User navigates to the application
    And Verify that home page is visible successfully
    Then Click on Signup button
    And Enter name "cyrinetest"
    And Enter email "yefrni.scyrinetest@gmail.com"
    And Click on Signupbutton
    When Choose the title gender "<gendertitle>"
    When User writes Name "<Name>"
    When User writes Password <Password>
    And Choose date of Birth
    And Check Sign up for our newsletter
    When User writes FirstName "<FirstName>"
    When User writes LastName "<LastName>"
    When User writes Compagny "<Compagny>"
    When User writes Adress "<Adress>"
    When User writes Adress2 "<Adress2>"
    When User writes State "<State>"
    When User writes City "<City>"
    And User writes Zipcode <Zipcode>
    And Choose the country
    And Enter the Mobile number
    And Click on Create Account
    And Verify that account "ACCOUNT CREATED!" is visible
    And click on Continue button
    Then Verify ' Logged in as cycwaaa' at top
    And Click on Product button
    When Hover over first product and click 'Add to cart'
    When Click on shop 'Continue Shopping' button
    When Hover over second product and click 'Add to cart'
    When Click view 'View Cart' button
    Then Verify that cart page is displayed
    When Click Proceed To Checkout
    Then Verify message 'Address Details' and 'Review Your Order'
    When Enter description in comment text area and click 'Place Order'
    When Enter payment details
      | NameOnCard      | nameTest |
      | CardNumber      | 00123456 |
      | CVC             |      555 |
      | ExpirationMonth |       05 |
      | ExpirationYear  |     2147 |
    When Click pay 'Pay and Confirm Order' button
    Then Verify success message 'Your order has been placed successfully!'
    When Click delete 'Delete Account' button
    Then Verify that deletedd "ACCOUNT DELETED!" is visible
    When clicks 'Continue' button

    Examples: 
      | gendertitle | Name       | Password | FirstName    | LastName     | Compagny     | Adress     | Adress2     | State     | City     | Zipcode |
      | Mr    | cyrinetest | 0000 | Firsnametest | LastNametest | Compagnytest | Adresstest | Adress2test | Statetest | Citytest |  123654 |
