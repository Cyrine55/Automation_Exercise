@ViewCartBrandProduct
Feature: View and Cart Brand Products
  En tant que utilisateur je veux visualliser les marques des produits
  
  @ViewCartBrandProduct
  Scenario: Visualiser marques des produits
  Given User navigates to the application
  When Click on Product button
  Then Verify that Brands are visible on left side bar
  When Click on 'BABYHUG' brand name
  Then Verify User navigate on Babyhug brand
  And Verify Baby confirm text 'BRAND - BABYHUG PRODUCTS' is displayed
  When Click on any brand 'MADAME'
  Then Verify User navigate on Madame brand
  