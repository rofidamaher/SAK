@smoke
Feature: F05_02_POA_PARTIAL_STEPPED | users could add new transactions for POA_PARTIAL_STEPPED
Background:user could click on POA_PARTIAL_STEPPED
  When user login with email "tester7" and password "P@ssw0rd"
  And user press on login button
  And user login to the system successfully by user "tester7"
  And user click on Documentation
  Then user clicked on Documentation successfully
  And user click on POA
  And user clicked on POA successfully
  When user click on POA_PARTIAL_STEPPED
  And user clicked on POA_PARTIAL_STEPPED successfully

  Scenario: user could add new transactions for POA_PARTIAL_STEPPED one to one
    When user add the first Party with obj of index "8" and id of index "1" id equal "00000000085" and click on btnAddFirstParty
    And user click on add button and add new first Party successfully
    When user close first Party and open the model Nav
    And user enter transaction num "2023/3758" for POA_PARTIAL_STEPPED and click save model btn
    And user select person who step aside agency and step aside from him then click save btn
    And user close the the samples Nav and open the fees Nav
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    Then user click on btnSubmitTransaction




