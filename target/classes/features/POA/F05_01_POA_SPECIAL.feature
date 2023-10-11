@smoke
Feature: F05_01_POA_SPECIAL | users could add new transactions for POA_SPECIAL
Background:user could click on POA_SPECIAL
  When user login with email "tester7" and password "P@ssw0rd"
  And user press on login button
  And user login to the system successfully by user "tester7"
  And user click on Documentation
  Then user clicked on Documentation successfully
  And user click on POA
  And user clicked on POA successfully
  And user click on POA_SPECIAL
  And user clicked on POA_SPECIAL successfully

  Scenario: user could add new transactions for POA_SPECIAL
    When user add the first Party for POA_SPECIAL with obj of index "8" and id of index "1" id equal "00000000091" and click on applicant
    And user click on add button and add new first Party successfully
    And user close first Party for POA_SPECIAL and open the second Party for POA_SPECIAL
    When user add the second Party for POA_SPECIAL with obj of index "6" and id of index "1" id equal "00000000085" and CR equal "230"
    And user click on add button and add new second Party with id "00000000085" successfully
