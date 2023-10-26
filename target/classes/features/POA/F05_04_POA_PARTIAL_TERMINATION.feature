
Feature: F05_04_POA_PARTIAL_TERMINATION | users could add new transactions for POA_PARTIAL_TERMINATION
Background:user could click on POA_TERMINATION
  When user login with email "amrsaid" and password "amrsaid"
  And user press on login button
  And user login to the system successfully by user "amrsaid"
  And user click on Documentation
  Then user clicked on Documentation successfully
  And user click on POA
  And user clicked on POA successfully
  When user click on POA_PARTIAL_TERMINATION
  And user clicked on POA_PARTIAL_TERMINATION successfully

  Scenario: user could add new transactions for POA_PARTIAL_TERMINATION
    When user add the first Party with obj of index "8" and id of index "1" id equal "00000000200" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    When user close first Party and open the model Nav
    And user enter transaction num "2023/3662" for POA_PARTIAL_TERMINATION and click save model btn
    And user select person who cancel agency "00000000091" and click save btn
    And user close the the samples Nav and open the fees Nav
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    Then user click on btnSubmitTransaction



