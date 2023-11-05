#@smoke
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

  Scenario: user could add new transactions for POA_GENERAL_CASES
    # عن نفسه      |||  رقم شخصي
    When user add the first Party with obj of index "8" and id of index "1" id equal "00000000200" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    And user close first Party and open the second Party

    # شريك في شركة      |||  رقم شخصي
    When user add the second Party with obj of index "6" and id of index "1" id equal "00000000085" and CR equal "230"
    And user click on add button and add new second Party with id "00000000085" successfully
    And user close the second Party and open the model Nav for CASES
    When user chick the fixed text checkbox and click inside the state of qatar radio btn for cases
    And user insert Date
    And user click on save model btn
    And user close the the samples Nav and open the fees Nav for cases
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    Then user click on btnSubmitTransaction
#    And user click btnCollection


