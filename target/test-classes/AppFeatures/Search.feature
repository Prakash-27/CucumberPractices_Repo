#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


#@tag
#Feature: Title of your feature
#  I want to use this template for my feature file
#
#  @tag1
#  Scenario: Title of your scenario
#    Given I want to write a step with precondition
#    And some other precondition
#    When I complete action
#    And some other action
#    And yet another action
#    Then I validate the outcomes
#    And check more outcomes
#
#  @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step
#
#   Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |

Feature: Amazon Search

@Smoke
Scenario: Search a Product MacBook Air
Given I have a Search field on Amazon Page
When I search for a product with name "Apple MacBook Air" and Price 2000
Then Product with name "Apple MacBook Air" Should be displayed
Then Order id is 12345 and username is "Prakash"

@Regression
Scenario: Search a Product Iphone 12 
Given I have a Search field on Amazon Page
When I search for a product with name "Apple MacBook Air" and Price 1200
Then Product with name "Iphone" Should be displayed
Then Order id is 8766 and username is "Prakash"







