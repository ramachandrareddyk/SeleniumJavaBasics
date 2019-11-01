Feature: Free CRM Login Feature




#data driven testing using this "examples" keyword
Scenario Outline: Free CRM Login Test ScenarioUsing Examples eyword

Given User is already on login page
When title of Login page Free CRM
Then Usr enters "<username>" and "<password>"
Then user clicks on login Button
Then user on Homepage
Then close the browser

#for exmaples key word we should use SCENARIO OUTLINE
Examples:

	|username|password|
	|vijayreddy|Reddy@123|
	|Tom       |Test123|
	
