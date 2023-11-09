@smoke
Feature: F08_AUTH | users could use login functionality and click on Documentation then go to AUTH
Background:user could click on SALE
  When user login with email "tester7" and password "P@ssw0rd"
  And user press on login button
  And user login to the system successfully by user "tester7"
  And user click on Documentation
  Then user clicked on Documentation successfully
  When user click on AUTH
  And user clicked on AUTH successfully

  Scenario: user could click on CONTRACT_ESTABLISHMENT
    When user click on CONTRACT_ESTABLISHMENT
    And user clicked on CONTRACT_ESTABLISHMENT successfully