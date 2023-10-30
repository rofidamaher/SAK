
Feature: F05_03_POA_TERMINATION | users could add new transactions for POA_TERMINATION
Background:user could click on POA_TERMINATION
  When user login with email "amrsaid" and password "amrsaid"
  And user press on login button
  And user login to the system successfully by user "amrsaid"
  And user click on Documentation
  Then user clicked on Documentation successfully
  And user click on POA
  And user clicked on POA successfully
  When user click on POA_TERMINATION
  And user clicked on POA_TERMINATION successfully

  Scenario: user could add new transactions for POA_TERMINATION
      # عن نفسه      |||  رقم شخصي
    When user add the first Party with obj of index "8" and id of index "1" id equal "00000000090" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    When user close first Party and open the model Nav
    And user enter transaction num "2023/3660" for POA_TERMINATION and click save model btn
    And user close the the samples Nav and open the fees Nav
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    Then user click on btnSubmitTransaction



<<<<<<< HEAD


=======
>>>>>>> adf37fe (test)
