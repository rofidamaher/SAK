
Feature: F03_Home | users could use login functionality and click on Documentation
<<<<<<< HEAD
  Background: user could login with valid username and password
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"

  Scenario: user could click on Documentation
    And user click on Documentation
    Then user clicked on Documentation successfully

  Scenario: user could click on ConfirmationSignatures
    And user click on ConfirmationSignatures
    Then user clicked on ConfirmationSignatures successfully
=======

  Scenario: user could login with valid username and password and click on Documentation
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on Documentation
    Then user clicked on Documentation successfully

>>>>>>> adf37fe (test)
