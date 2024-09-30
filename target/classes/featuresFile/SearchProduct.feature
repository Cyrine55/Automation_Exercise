@Search-product
Feature: Recherche un produit
  Utilisateur souhaite chercher un produit

  @Search-product
  Scenario: Search Product
    Given User navigates to the application
    And Verify that home page is visible successfully
    And Click on Product button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When Enter product name "Dress" in search input
    And Click search button
    Then Verify 'SEARCHED PRODUCTS' message is visible
    Then Verify all the products related to search are visible
