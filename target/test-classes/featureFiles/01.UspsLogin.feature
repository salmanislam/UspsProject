@usps @regression 
Feature: Users ability to login 

Scenario Outline: User should able to login using Sign-On Feature 

	Given Navigate to USPS home page
	When Navigate to usps login page 
	And Fill with valid "<UserName>" and "<Password>"
	And Click on sign in button
	Then Hover over the username from home page and varify the login by username
	
	Examples: 
		|UserName      |Password  |
		|urbaneagles123|Eagles@123|
		
		