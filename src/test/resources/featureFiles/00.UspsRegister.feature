@usps @regression 
Feature: Users ability to register 

Scenario: User should able to register using valid information  

	Given Navigate to USPS.com home page.
	When Navigate to usps register page
	And Navigate to signup now button
	And Fill up the information
	Then Submit the information