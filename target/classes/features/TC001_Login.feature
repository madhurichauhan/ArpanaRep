Feature: Login Action
Scenario: Login with valid inputs and display Successful if connected to correct user
Given user is on home page
When user clicks on Signin check title
When user enters valid user name and password and clicks on Submit
Then check user name is displayed 
Then Logout

Scenario: Login with invalid inputs and display error message
Given user is on home page
When user clicks on Signin check title
When user enters invalid user name or invalid password and clicks on Submit
Then Close the browser
 