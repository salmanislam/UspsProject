@usps @regression 
Feature: Users ability to track a shipment
Scenario Outline: User should able to track using tracking feature with valid and invalid information

	Given Navigate to USPS.com home page
	When Hover over to track and manage and click on tracking
	And Insert valid "<validTrackingNumber>" and click on track button
	And Verify valid tracking information
	And Insert invalid "<inValidTrackingNumber>" and click on track button
	Then Verify invalid tracking information
	
	Examples: 
		|validTrackingNumber|inValidTrackingNumber|
		|9374889727009082699535|11001902004365000245082310|
		
		