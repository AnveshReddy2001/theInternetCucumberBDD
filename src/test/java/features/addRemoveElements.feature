Feature: Add and Remove Elemnts on The Internet Website
	As a user
	I want to able to add and remove elements dynamically
	
	Scenario: Add and remove elements successfully
		Given I am on the Add/Remove Elements page
		When I add 3 elements
		Then I should see 3 delete buttons
		When I remove 2 elements
		Then I should see 1 delete buttons
		