Feature: Check for Broken Images on The Internet Website
	As a user
	I want to verify that the images on the Broken Images page are loading properly
	
	Scenario: Verify images are not broken
		Given I am on the Broken Images page
		Then I should see all images properly loaded
		