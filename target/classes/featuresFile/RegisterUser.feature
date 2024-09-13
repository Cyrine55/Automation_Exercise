@RegisterUser
Feature: Register user
  En tant qu'utilisateur je veux ajouter un utilisateur

  @Register-valid-user
  Scenario: Register user
    Given User navigates to the application
    And Verify that home page is visible successfully
    Then Click on Signup button
    And Verify "New User Signup!" is visible
    And Enter name "cyrine"
    And Enter email "yefrni.syrine@gmail.com"
    And Click on Signup button
    And Verify that "ENTER ACCOUNT INFORMATION" is visible
    And Choose the title
    And Enter Name and Password
      | Name     | Cyrine  |
      | Password | Yefrni5 |
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
    And Verify that "ACCOUNT CREATED!" is visible
    And create on 'Continue' button
    And Verify that "Logged in as username" is visible
    And Click Delete Account button
    Then Verify that "ACCOUNT DELETED!" is visible
    And click on Continue button
