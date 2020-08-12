@usps @regression 
Feature: Users ability to calculate a shiping price
Scenario Outline: User should able to calculate using calculate a price feature

	Given Navigate to USPS.com home page
	When Hover over mail & ship and click on Calculate a price
	And Click on calculate postcard price
	And Fill with "<Small>" and "<Large>" quantities and click on calculate
	Then Varify the total price is correct
	
	Examples: 
		|Small|Large|
		|2|2|