@Add-Product-In-Cart
Feature: Add product in cart
  Utilisateur souhaite ajouter un produit dans la carte 
  
  @Add-Product-In-Cart
  Scenario: Ajouter un produit dans la carte
  Given User navigates to the application
  And Verify that home page is visible successfully
  And Click on Product button
  When Hover over first product and click 'Add to cart' 
  When Click on shop 'Continue Shopping' button
  When Hover over second product and click 'Add to cart'
  When Click view 'View Cart' button
  Then Verify both products are added to Cart
  Then Verify their prices, quantity and total price
  