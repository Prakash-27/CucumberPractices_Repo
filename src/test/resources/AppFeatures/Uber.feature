
@All
Feature: Uber Booking Feature

@Smoke @qa-ready @user-stories-1001 @Epic-900 
Scenario: Booking Cab for Sedan 
Given User wants to select a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune" 
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD
Then User checks the trip details

@Smoke @Regression
Scenario: Booking Cab for SUV 
Given User wants to select a car type "SUV" from uber app
When User selects car "SUV" and pick up point "Bangalore" and drop location "Hyderabad" 
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Production
Scenario: Booking Cab for Mini Cooper 
Given User wants to select a car type "Mini Cooper" from uber app
When User selects car "Mini Cooper" and pick up point "Pune" and drop location "Mumbai" 
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD