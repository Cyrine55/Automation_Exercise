@product-Quantity-InCart
Feature: Verification du quantite de produit dans la page de carte
  En tant que utilisateur je veux verifier la quantité du produit ajouté dans la page de carte

  @VerifyProductQuantityInCart
  Scenario: Vérifier la quantité du produit ajouté dans la page de carte
    Given User navigates to the application
    And Verify that home page is visible successfully
    When Click on view 'View Product' for any product on home page
    Then Verify product detail is opened
    When Increase quantity to '4'
    And Click on add 'Add to cart' button
    And Click on view 'View Cart' button
    Then Verify that product is displayed in cart page with exact quantity
