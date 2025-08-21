Feature:  Test Adhoc Cucumber features


	
Scenario Outline: Search for job vacancies as a Guest 
	Given Escape 'special characters like $ %' in step definition	
	Given User provide below case files
	|Key|Value|
	|PART|<PART>|
	|CASE_DECISION|<CASE_DECISION>|
	
	Examples:
	|PART|CASE_DECISION|
  |part1File.txt|caseDecisionFile1.txt|
  |part2File.txt|caseDecisionFile2.txt|
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
