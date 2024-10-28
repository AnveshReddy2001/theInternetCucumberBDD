Feature: Interact with the Challenging DOM on The Internet Website
	As a User
	I want to verify interactions with buttons and the table on the Challenging DOM
	
	Scenario: Click buttons and verify table content
		Given I am on the Challenging DOM page
		When I click the first button
		Then I should see the buttons effect on the page
		When I click the second button
		Then I should see the buttons effect on the page
		When I click the third button
		Then I should see the buttons effect on the page
		Then I should see the table content properly loaded