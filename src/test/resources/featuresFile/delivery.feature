Feature: Delivery Pricing on distance and delivery path

Scenario: Charge the correct amount for distance > 10KM

Given I am a delivery person and using an app to find out the correct amount to be charged to the customer.
When distance is greater 10 KM 
Then Delivery price is $10 WHEN

Scenario: Charge the correct amount for distance < 10KM

Given I am a delivery person and using an app to find out the correct amount to be charged to the customer.
When distance is under 10 KM 
Then Delivery price is $20 WHEN