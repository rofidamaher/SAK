@smoke
Feature: F05_Tawkel | users could use login functionality and click on Documentation then go to Tawkel and click Tawkel racmy

  Scenario: user could login with valid username and password and click on Documentation
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on Documentation
    Then user clicked on Documentation successfully
    And user click on Tawkel
    And user clicked on Tawkel successfully
    And user click on Tawkel racmy
    And user clicked on Tawkel racmy successfully

