Feature: MyAccount Login Feature 
	Description: Test login functionality


Background: Common STEPS for envery SCENARIO in this FEATURE file
    Given open the url "https://www.amazon.com/" in the browser


#Scenario Without PARAMETER
@sanityGroup
Scenario: Login with incorrect credentials 
	When enter incorrect username and password 
	And click on login button 
	Then user should not successfully login to the application 
	
	
	
#Scenario With PARAMETER
@regressionSuite
Scenario: Login with unregistered credentials 
	When enter unregistered username "email1@idid.com" and password "amazon1" 
	And click on login button 
	Then user should not successfully login to the application 
	
	
#SCENARIO with Multiple PARAMETER VALUES. The entire SCENARIO is repeated for each of the EXAMPLES record.
@end2End
Scenario Outline: Login with unregistered credentials 
	When enter unregistered username "<username>" and password "<password>" 
	And click on login button 
	Then user should not successfully login to the application 
	
	Examples: 
		| username 	| password |
		| email12@idid.com | amazon12 |
		| email123@idid.com | amazon123 |
		


#Scenario STEP with Multiple PARAMETER VALUES. Only the STEP (and not the entire SCENARIO) is repeated for each of the record.
@sanityGroup @regressionSuite
Scenario: Login with invalid credentials 
	When enter invalid username and password
		| username 	| password |
		| email1234@idid.com | amazon1234 |
		| email12345@idid.com | amazon12345 |	
	And click on login button 
	Then user should not successfully login to the application 
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
