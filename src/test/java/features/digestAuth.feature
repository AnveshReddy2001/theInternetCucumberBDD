Feature: Access Digest Authentication page on the Internet Website
	As a user
	I want to verify access to the Digest Authentication page using credentials
	
	Scenario: Successfully access Digest Authentication page
		Given I am on the Digest Authentication page with valid credentials
		Then I should see a message "Congratulations! You must have the proper credentials."
		
		