Feature: Interact with the Context Menu on The Internet Website
	As a user
	I want to verify the context menu funtionality and the alert message
	
	Scenario: Right-click to trigger the context menu and verify the alert
		Given I am on the Context Menu page
		When I right-click on the hotspot
		Then I should see an alert with text "You selected a context menu"
		