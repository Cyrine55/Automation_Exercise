@Scroll
Feature: Verify Scroll Up using arrow button and Scroll Down Functionnality
En tant qu'utilisateur je souhaite verifier la fonction de scroll avec bouton Arrow 

@ScrollUp-Functionnality
Scenario: Verify Scroll Up using arrow butto
Given User navigates to the application
And Verify that home page is visible successfully
When Scroll down page to bottom
Then Verify subscription 'SUBSCRIPTION' text is visible
When Click on arrow at bottom right side to move upward
Then Veify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen