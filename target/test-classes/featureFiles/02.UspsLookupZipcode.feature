@usps @regression 
Feature: Users ability to lookup city using zipcode 

Scenario Outline: User should able to get city information using lookup zipcode feature 
	
	Given Go to USPS home page 
	Given Hover over mail & ship and click on lookup a zipcode
	When Click on cities by zipcode
	And Insert a valid "<Zipcode>" and submit
	Then Varify it return valid cityname against the zipcode
	
	Examples: 
		|Zipcode|
		|11218|
		