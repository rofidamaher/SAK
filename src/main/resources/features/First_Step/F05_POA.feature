@smoke
Feature: F05_POA | users could use login functionality and click on Documentation then go to POA and click POA_SPECIAL
Background:user could click on POA
  When user login with email "tester7" and password "P@ssw0rd"
  And user press on login button
  And user login to the system successfully by user "tester7"
  And user click on Documentation
  Then user clicked on Documentation successfully
  And user click on POA
  And user clicked on POA successfully

  Scenario: user could click on POA_SPECIAL
    And user click on POA_SPECIAL
    And user clicked on POA_SPECIAL successfully

