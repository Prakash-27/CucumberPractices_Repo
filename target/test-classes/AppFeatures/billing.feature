#Scenario Outline and Examples Keyword in Cucumber (Data Driven Testing):
#Introducing some Bug in the Calculating billing amount
 
Feature: Calculate billing amount

Scenario Outline: billing amount 
 Given user is on biling page
 When user enters billing amount "<billingamount>"
 When user enters tax amount "<taxamount>"
 And user clicks on calculate button 
 Then it gives the final amount "<finalamount>"
 
      Examples: 
        |billingamount|taxamount|finalamount|
        | 1000        | 10      | 1010      |
        | 500         | 20      | 520       |
        | 100         | 5.5     | 105.5     |
        
        