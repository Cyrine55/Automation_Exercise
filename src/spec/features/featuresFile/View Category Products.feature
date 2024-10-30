@ViewCategoryProducts
Feature: View Category Products

@ViewCategoryProducts
Scenario: View Category Product 
Given User navigates to the application
Then Verify that categories are visible on left side bar
When Click on Women category
And Click on sub Category TOPS
Then Verify that category page is displayed
Then Verify that confirm text 'WOMEN - TOPS PRODUCTS'
When Click on category link 'Men'
And Click on sub category JEANS
Then Verify that text 'MEN - JEANS PRODUCTS' is displayed