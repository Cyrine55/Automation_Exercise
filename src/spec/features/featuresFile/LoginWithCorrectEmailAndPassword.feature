@Login-user-login
Feature: Authentification valide
  Utilisateur souhaite authentifié

  @Login-Valid
  Scenario: Authentification valide
    Given User navigates to the application
    And Verify that home page is visible successfully
    Then Click on Signup button
    Then Verify the login 'Login to your account' is visible
    When Enter correct email address and password
    And Click on 'login' button
    And Verify that username "Logged in as Cyrine" is visible
    And Click 'Delete Account' button
    Then Verify that deleted "ACCOUNT DELETED!" is visible
