@Subscription-In-CartPage
Feature: Subscription in Cart Page 
Utilisateur souhaite vérifier la Subscription dans la carte de page

@Subscription-In-CartPage
Scenario: Verify Subscription in Cart Page
Given User navigates to the application
    And Verify that home page is visible successfully
    When Click on cart 'Cart' button
    And Verify text 'SUBSCRIPTION'
    When Enter email address 
    And Click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visible