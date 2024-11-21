Feature: SearchProductAnd Verify Cart After Login 
En tant qu'utilisateur je veux chercher un produit et vérifer la carte après authentification 


@SearchProduct-And-Verify-Cart-AfterLogin 
Scenario: SearchProductAndVerifyCartAfterLogin 
Given User navigates to the application
When Click on Product button
Then Verify user is navigated to ALL PRODUCTS page successfully
When Enter product name "Dress" in search input
And Click search button

Then Verify all the products related to search are visible
When Add those products to cart
And Click on add 'Add to cart' button
Then Verify that products are visible in cart
When Click on Signup button
When Enter correct email address and password
And Click on 'login' button
When Click on cart 'Cart' button
Then Verify that those products are visible in cart after login as well