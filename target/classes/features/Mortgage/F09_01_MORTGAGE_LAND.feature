
Feature: F09_01_MORTGAGE_LAND | users could add new transactions for MORTGAGE_LAND
  Background:user could click on MORTGAGE_Marine_Land
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on Documentation
    Then user clicked on Documentation successfully
    When user click on MORTGAGE
    Then user clicked on MORTGAGE successfully
    When user click on MORTGAGE_LAND
    Then user clicked on MORTGAGE_LAND successfully


  Scenario: user could add new transactions for MORTGAGE_LAND
     # عن نفسه      |||  رقم شخصي
    When user add the first Party with obj of index "8" and id of index "1" id equal "00000000200" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    And user close first Party and open the second Party

     # شريك في شركة      |||  رقم شخصي
    When user add the second Party with obj of index "6" and id of index "2" id equal "00000000085" and CR equal "230"
    And user click on add button and add new second Party with id "00000000085" successfully

    # النماذج
    And user close second Party and open samples Nav
    Then region is "120" and space is "120" and cadastral number is "120"
    When select MORTGAGE_PERIOD_FROM Y "2023" M "Jul" D "15" MORTGAGE_PERIOD_TO Y "2025" M "Jul" D "16"
    Then Mortgage value is "120" and Approval letter number is "120"
    And Add Debaga To Table And Add Debaga Request

    # عرض المحرر ثم اصدار المحرر
    And user click on btnViewTransaction
    Then user click on btnSubmitTransaction





