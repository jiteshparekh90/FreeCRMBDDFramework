#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Free CRM Login Feature

#without Examples keyword
Scenario: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is "Cogmento CRM"
Then user enters "jiteshparekh90@gmail.com" and "Testing@123"
Then user clicks on login button
Then user quit

#with examples keyword
#Scenario Outline: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is "Cogmento CRM"
#Then user enters "<username>" and "<password>"
#Then user clicks on login button
#Then user quit
#
#Examples:
#		| username | password |
#		| jiteshparekh90@gmail.com | Testing@123 |
#		| jitesh | testing |


