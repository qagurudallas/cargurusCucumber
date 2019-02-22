Feature: Delivery Pricing on distance and delivery path

Scenario: As a user I want to deliver item to a location so that I can charge the correct amount

Given I am a delivery person and using an app to find out the correct amount to be charged to the customer.



When distance is under 10 KM And Go button is clicked 
Then Delivery price is $10 WHEN
When the distance is more than 10 KM 
Then Delivery price is $25 
When the distance is under 10 KM and has stairs in the path 
Then Delivery price is $20 
When the distance is > 10 KM and has a stairs in the path 
Then Delivery price is $35
When delivery is on Weekend 
Then Delivery price is $50 
