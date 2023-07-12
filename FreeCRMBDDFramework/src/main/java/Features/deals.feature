Feature: deal data creation

Scenario:  Free CRM Create a new Deal Scenario

Given user is already on Login Page
When title of login page is "Cogmento CRM"
Then user enters "jiteshparekh90@gmail.com" and "Testing@123"
Then user clicks on login button
Then user moves to new deal Page
Then click on create button
Then user enters "test deal" and "1000" and "50"
Then user clicks on save button
Then user quit