@smoke
Feature: F05_05_POA_GENERAL_CASES | users could add new transactions for POA_GENERAL_CASES
  Background:user could click on POA_GENERAL_CASES
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on Documentation
    Then user clicked on Documentation successfully
    And user click on POA
    And user clicked on POA successfully
    When user click on POA_GENERAL_CASES
    And user clicked on POA_GENERAL_CASES successfully