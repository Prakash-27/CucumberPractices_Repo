Feature: Amazon Home Page
  In order to test Amazon Home Page of Application 
  As a Registered user
  I want to specify the features of home page
  
 Scenario: Home Page Top Panel Section
   Given user is on Amazon home page 
   Then user gets a Amazon search field
   And username is also displayed next to search field
   And Amazon logo is also displayed
   And Cart link is also displayed
   
 Scenario: Amazon Today's Deals section
   Given user is on Amazon home page 
   When user scrolls down to Todays Deals section
   Then user gets the list of multiple products
   And user gets product image and price details
   And user can see more product by clicking on carousel
   
 Scenario: Amazon Footer Links section
   Given user is on Amazon home page
   When user scrolls down to footer of the page
   Then user gets all Country links
   |Australia|
   |Brazil|
   |China|
   And user gets all amazon servies links
   |Amazon Bussiness|
   |Amazon Web Services|
   And user gets all privacy policy links
   |Privacy Notice|
   |Use & Sale|
   
   
        