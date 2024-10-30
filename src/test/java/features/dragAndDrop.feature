Feature: Drag and Drop elements on The Internet Website
	As a user
	I want to drag and drop elements on the Drag and Drop page
	
	Scenario: Drag element A and drop it on element B
		Given I am on Drag and Drop page
		When I drag element A and drop it on element B
		Then element A should be placed in the position of element B
		