Feature: Add to cart from Recommended items
En tant que utilisateur je veux ajouter les produits recommendés 

@Add-recommended-items
Scenario: Add recommended items
Given User navigates to the application
When Scroll to bottom of page
Then Verify 'RECOMMENDED ITEMS' are visible
When Click on Add To Cart on Recommended product
And Click onn 'View Cart' button
Then Verify that product is displayed in cart page