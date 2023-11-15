
Feature: F05_POA | users could use login functionality and click on Documentation then go to POA
Background:user could click on POA
  Background:user could login with valid username and password and click on Documentation
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on Documentation
    Then user clicked on Documentation successfully
    When user click on MORTGAGE
    Then user clicked on MORTGAGE successfully

  Scenario: user could click on MORTGAGE_LAND
    When user click on MORTGAGE_LAND
    Then user clicked on MORTGAGE_LAND successfully



  Scenario: user could click on MORTGAGE_RE
    When user click on MORTGAGE_RE
    Then user clicked on MORTGAGE_RE successfully