
Feature: F06_SALE | users could use login functionality and click on Documentation then go to SALE
Background:user could click on SALE
  When user login with email "tester7" and password "P@ssw0rd"
  And user press on login button
  And user login to the system successfully by user "tester7"
  And user click on Documentation
  Then user clicked on Documentation successfully
  When user click on SAlE
  And user clicked on SAlE successfully

  Scenario: user could click on SALE_COMPANY
    When user click on SALE_COMPANY
    And user clicked on SALE_COMPANY successfully

  Scenario: user could click on SALE_LAND
    When user click on SALE_LAND
    And user clicked on SALE_LAND successfully

  Scenario: user could click on SALE_LAND
    When user click on SALE_LAND
    And user clicked on SALE_LAND successfully