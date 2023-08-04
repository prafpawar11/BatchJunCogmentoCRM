@RegressionSuite
Feature: Test Cogmento CRM application

  #Login Functionality Written by Senior Automation Test Engineer
  Scenario: Test login Functionality
    Given user is on login page
    When user enter valid username and password and click on login button

  #Suraj Automation test Engineer
  Scenario: Test Home Page Functionality
    When user is on home page and valiate home page title
    And user validate home page url
    And validate home page logo
