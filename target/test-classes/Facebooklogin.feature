Feature: Validation of Adactine Hotel webpage

Scenario Outline: validating the adactine hotel with correct username and correct password

	Given User should open the adactine application
	When User enters the "<username>" and "<password>" in the application
	And User clicks the login button
	Then User verifies the application moved to home page
	
	Examples: 
	|username|password|
	|nishok|jkhikjh|
	|giri|hguyg|
	|thani|dfghj|
