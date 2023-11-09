
Feature: F07_ConfirmationSignatures | users could use login functionality and click on ConfirmationSignatures

  Background:user could login with valid username and password and click on ConfirmationSignatures
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on ConfirmationSignatures
    Then user clicked on ConfirmationSignatures successfully

  Scenario:user could click on AGREEMENT
    When user click on AGREEMENT
    And user clicked on AGREEMENT successfully

  Scenario:user could click on SUPPLY
    When user click on SUPPLY
    And user clicked on SUPPLY successfully

