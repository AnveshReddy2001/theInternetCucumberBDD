Feature: Verify the presence of disappearing elements on the Internet Website
	As a user
	I want to verify that elements may appear or disappear on the Disappearing Elements page
	
	Scenario: Verify that elements are displayed or diappear
		Given I am on the Disappearing Elements page
		Then I should see all expected elements, if they are present
		