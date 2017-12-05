
@tag
Feature: Log In 
	Description: I want to log in web application

@tag1
Scenario: Log In Success with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully

