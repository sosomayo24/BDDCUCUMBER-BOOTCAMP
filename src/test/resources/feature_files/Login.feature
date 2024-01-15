@TutorialsNinjaLogin
Feature: Login functionality of TutorialsNinja


@ValidCredentials
Scenario Outline: Login with valid credentials
Given User navigates to LoginPage
When User enters valid email <email> into email textbox field
And User enters valid password <password> into password textbox field
And User clicks on Login button
Then User is navigated to AccountPage
Examples:

|          email 				    | password 		 |
| seleniumpanda@gmail.com   | Selenium@123 |
| seleniumpanda1@gmail.com  | Selenium@123 |
| seleniumpanda2@gmail.com  | Selenium@123 |
| seleniumpanda3@gmail.com  | Selenium@123 |
| seleniumpanda4@gmail.com  | Selenium@123 |
| seleniumpanda5@gmail.com  | Selenium@123 |


