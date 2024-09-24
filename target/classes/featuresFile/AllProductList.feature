
@All-Detail-Product
Feature: Verificarion tous les détails du produit
  Utilisateur souhaite vérifier tous les produids et les détails

  @tag1
  Scenario: Vérifier liste des produits et détails
   Given User navigates to the application
  And Verify that home page is visible successfully
  And Click on 'Product' button
  Then Verify user is navigated to ALL PRODUCTS page successfully
  Then The products list is visible
  When Click on 'View Product' of first product
  Then User is landed to product detail page
  Then Verify that detail product name is visible
  Then Verify that category is visible
  Then Verify that price is visible
  Then Verify that availability is visible
  Then Verify that condition is visible
  Then Verify that brand is visible