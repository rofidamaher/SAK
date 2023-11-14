
Feature: F07_02_SUPPLY | users could add new transactions for SUPPLY
Background:user could click on SUPPLY
  When user login with email "amrsaid" and password "amrsaid"
  And user press on login button
  And user login to the system successfully by user "amrsaid"
  And user click on CONFIRMATION_SIGNATURES_P
  Then user clicked on CONFIRMATION_SIGNATURES_P successfully
  When user click on SUPPLY
  And user clicked on SUPPLY successfully

  #عقد توريد
  Scenario: user could add new transactions for SUPPLY
      # عن نفسه      |||  رقم شخصي
    When user add the first Party with obj of index "8" and id of index "1" id equal "00000000200" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    And user close first Party and open the second Party
     # شريك في شركة      |||  رقم شخصي
    When user add the second Party with obj of index "6" and id of index "2" id equal "00000000085" and CR equal "230"
    And user click on add button and add new second Party with id "00000000085" successfully
    And user close second Party and open samples Nav
    When user enter GOODS_DATA "food" and select CONTRACT_PERIOD_FROM Y "2023" M "Jul" D "10" CONTRACT_PERIOD_TO Y "2025" M "Jul" D "20" and CONTRACT_VALUE "2514"
    And user click on save model btn
    And user close the the samples Nav and open the fees Nav
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    Then user click on btnSubmitTransaction


