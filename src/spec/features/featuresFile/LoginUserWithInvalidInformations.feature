@Invalid-Login-user-login
Feature: Authentification invalide 
  Utilisateur souhaite authentifié avec des informations invalides
  
  @Login-Invalid
Scenario Outline: Authentification invalide
  Given User navigates to the application
  And Verify that home page is visible successfully
  Then Click on Signup button
  Then Verify the login 'Login to your account' is visible
  When Enter incorrect "<emailaddress>" and "<password>"
  And Click on 'login' button
  Then Verify error message 'Your email or password is incorrect!' is visible
  Examples:
    | emailaddress       | password |
    | email1@gmail.com   | pass1    |
    | email2@gmail.com   | pass2    |