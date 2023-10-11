@smoke
Feature: F04_DOCUMENTATION_P | users could use login functionality and click on Documentation then go to POA

  Scenario: user could login with valid username and password and click on Documentation
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on Documentation
    Then user clicked on Documentation successfully
    And user click on POA
    And user clicked on POA successfully

