@usps @regression 
Feature: Users ability to request a pickup 

Scenario: User should able to schedule a pickup request using Schedule a Pickup service

	Given Visit Usps Homepage
	When Hover over mail and ship and click on Schedule a pickup
	And Insert Pickup location details.
	And Click on check availability
	Then Verify if service is available