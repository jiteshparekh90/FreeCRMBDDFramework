Feature: Free CRM Create Contacts

Scenario: Free CRM Create a new contact Scenario

Given user is already on Login Page
When title of login page is "Cogmento CRM"
Then user enters "jiteshparekh90@gmail.com" and "Testing@123"
Then user clicks on login button
Then user moves to new contact Page
Then click on create button
Then user enters "tom" and "sam" and "xyz@123"
Then user clicks on save button
Then user quit

