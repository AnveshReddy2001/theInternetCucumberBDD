Feature: Basic Authentication on the Internet Website
	As a user
	I want to verify that i can log in using basic authentication
	
	Scenario: Successful Basic Authentication
		Given I am on the Basic Auth page with valid credentials
		Then I should see a success message