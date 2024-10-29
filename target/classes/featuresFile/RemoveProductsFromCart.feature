@RemoveProduct-From-Cart
Feature: Remove Product From Cart
  En tant que utilisateur je veux eliminer des produits à partir de la carte
  
  @RemoveProduct-From-Cart
  Scenario: Remove Product from cart
  Given User navigates to the application
  And Verify that home page is visible successfully
  When Hover over first product and click 'Add to cart'
  When Click on shop 'Continue Shopping' button
    When Hover over second product and click 'Add to cart'
  When Click view 'View Cart' button
  Then Verify that cart page is displayed
  When click on X button corresponding to particular product 'Blue Top'
  Then Verify that product 'Blue Top' is removed from the cart
  