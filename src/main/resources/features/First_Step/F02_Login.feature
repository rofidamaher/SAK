
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user could login with valid username and password
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully by user "tester7"

