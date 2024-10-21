Feature: A/B Testing on The Internet Website
	As a user
	I want to verify the A/B Testing page loads successfully
	
	Scenario: Verify A/B Testing page content
		Given I am on the A/B Testing page
		Then I should see the A/B Testing header
		And I should see the A/B Testing description
		
		