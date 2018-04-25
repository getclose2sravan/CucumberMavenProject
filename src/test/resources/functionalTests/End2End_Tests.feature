Feature: Automated End2End Tests
Description: The purpose of this feature is to test End 2 End integration.

Scenario: 
	Given user is on the home page
	When User selects the "organisation" portal
	And provides the "Organisation" and "x!M7D!xj3D9k" to login
	Then user should be able to login with valid credentials
