Feature: Destination search feature

Scenario: Auto population of suggested destination in search field
Given User is in welcome page of Booking com
When user searches for a destination 
Then relevant destinations should be suggested
