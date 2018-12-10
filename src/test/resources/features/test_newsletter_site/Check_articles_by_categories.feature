Feature: Check articles by category
	In order to read articles of my interest
	As a reader
	I want to be able to look for articles related to a category
	
	Scenario: Check tech-related articles
		Given the user is in the home page
		When the user selects the "TECH" option
		Then the user should see the tech page
	
	##Scenario: Check science-related articles
	##	Given the user is in the home page
	##	When the user selects the "SCIENCE" option
	##	Then the user should see science page