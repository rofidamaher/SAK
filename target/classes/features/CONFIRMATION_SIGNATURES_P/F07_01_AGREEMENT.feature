
Feature: F07_01_AGREEMENT | users could add new transactions for AGREEMENT
Background:user could click on AGREEMENT
  When user login with email "amrsaid" and password "amrsaid"
  And user press on login button
  And user login to the system successfully by user "amrsaid"
  And user click on CONFIRMATION_SIGNATURES_P
  Then user clicked on CONFIRMATION_SIGNATURES_P successfully
  When user click on AGREEMENT
  And user clicked on AGREEMENT successfully

#عقد إتفاق
  Scenario: user could add new transactions for AGREEMENT
      # مفوض بموجب محضر اجتماع   //// الرقم الشخصي   ///  رقم الوكالة
    When user add the first Party with obj of index "33" and id of index "1" id "00000000090" txtBayanatElwkalaFirstParty "25/2014" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    And user click on ShowChild btn
      #  رخصة تجارية //// رقم الرخصة
    When user Add childType with obj of index "2" txtConfirmChildParty "1212" and click on save btn
    And user close first Party and open the second Party
      # محامي      |||  رقم شخصي
    When user add the second Party with obj of index "15" and id of index "2" id equal "00000000091"
    And user click on add button then click on YesFirstParty and add second Party with id "00000000091" successfully
    And user close the second Party and open the third Party
  # عن نفسه      ||| جواز شفر ////
    When user add the third Party with obj of index "8" and id of index "3" id "885522" NationalityThirdParty "2"
    And user click on add button and add third Party with id "885522" successfully
    And user close the third Party and open the samples Nav
    When user enter CONTRACT_VALUE "5658" and select CONTRACT_PERIOD_FROM Y "2023" M "Jul" D "15" CONTRACT_PERIOD_TO Y "2025" M "Jul" D "16"
    And user click on save model btn
    And user close the the samples Nav and open the fees Nav
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    Then user click on btnSubmitTransaction


