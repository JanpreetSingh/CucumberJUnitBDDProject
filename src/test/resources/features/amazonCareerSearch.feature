Feature:  Career Search Functionality Feature
	In order to apply for job in Amazon
	As a Guest
	I want to search for various careers in Amazon


	
#Use JSON to pass multiple values for PARAMETERS.
Scenario Outline: Search for job vacancies as a Guest 
	Given open url "https://www.amazon.com/" in the browser
	When click on "Careers" link under "Get to Know Us" in the bottom section of the page. 
	Then Find jobs page should open. 
	When user clicks on the search icon
	Then Your job application page should open
	When enter the "<job>" title and select appropriate job
	And enter the "<location>" and select approproate location
	And click the search icon
	Then a list of related job results should be displayed
	
	Examples: 
		| job 	| location |
			| Angular Developer | India |
			| RPA | Manila |
			| Testing | Torronto |	
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
