@TutorialsNinjaRegister
Feature: Register functionality of TutorialsNinja

  @MandatoryFields
  Scenario: Register with mandatory fields
  Given User navigates to RegisterPage
    When User enters below mandatory fields
    |firstname 			| Selenium 			|
    |lastname				| Panda 				|
    |telephone			| 1234567890 		|
    |password				| Selenium@123 	|
    |confirmpassword| Selenium@123 	|
    And User selects PrivacyPolicy checkbox
    When User clicks on Continue button
    Then User account gets created successfully