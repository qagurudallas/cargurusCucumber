Feature: Search car by zipcode
	Scenario: search for zipcode heading 
	Given User is on cargurus page
	When user enter 75025 and click search_button
	Then page displays Plano heading
	And User can see cars
	
	
