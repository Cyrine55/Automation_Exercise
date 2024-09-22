@RegisterUser
Feature: Register user
  En tant qu'utilisateur je veux ajouter un utilisateur

  @RegisterUserValid
  Scenario: Register user valid
    Given User navigates to the application
    And Verify that home page is visible successfully
    Then Click on Signup button
    And Verify "New User Signup!" is visible
    And Enter name "cyrine"
    And Enter email "yefrni.syrinetest@gmail.com"
    And Click on Signupbutton
    And Verify that info "ENTER ACCOUNT INFORMATION" is visible
    And Choose the title
    And Enter Name and Password
      | name     | Cyrine  |
      | password | Yefrni5 |
    And Choose date of Birth
    And Check Sign up for our newsletter
    And Enter the address information
      | First name | Yefrni  |
      | Last name  | cyrine  |
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
    And Verify that username "Logged in as Cyrine" is visible
    And Click Delete Account button
    Then Verify that deleted "ACCOUNT DELETED!" is visible
    
