@B29G37-207
Feature: Default


	@B29G37-199
	Scenario Outline: Verify there are 6 columns to see the quotations on the Sales page when the POS & sales managers login.
		Given User logged in with "<username>", "<password>"
		When User is in the Sales page
		Then User indicates 6 columns to see the quotations’ descriptions
		
		Examples: login values we are going to be using in the scenario outlines
		| username                | password      |
		| posmanager18@info.com   | posmanager    |
		| salesmanager18@info.com | salesmanager  |

	@B29G37-200
	Scenario Outline: Verify user can see the result on the list when searching with Quotation Number data.
		Given User logged in with "<username>", "<password>"
		And User is in the Sales page
		When User enters Quotation Number data "SO801" in a Search window and clicks Enter
		Then User sees the result on the list

		Examples: login values we are going to be using in the scenario outlines
			| username                | password      |
			| posmanager18@info.com   | posmanager    |
			| salesmanager18@info.com | salesmanager  |