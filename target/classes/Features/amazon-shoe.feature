Feature: 

@amazonTest
Scenario Outline: Find the shoes of lowest price from deal of the day tag
	Given User navigate to amazon.in site
	And Search for "<Search_Item>" 
	Then find the shoes with Deal of the day tag
	And List out the shoes and find the lowest Price show
	When User Click on the item and find the price


Examples:
	|Search_Item  |
	|Running Shoes|