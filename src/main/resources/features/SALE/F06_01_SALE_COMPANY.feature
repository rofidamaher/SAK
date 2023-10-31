
Feature: F06_01_SALE_COMPANY | users could add new transactions for SALE_COMPANY
Background:user could click on POA_SPECIAL
  When user login with email "tester7" and password "P@ssw0rd"
  And user press on login button
  And user login to the system successfully by user "tester7"
  And user click on Documentation
  Then user clicked on Documentation successfully
  When user click on SAlE
  And user clicked on SAlE successfully
  When user click on SALE_COMPANY
  And user clicked on SALE_COMPANY successfully

  Scenario: user could add new transactions for SALE_COMPANY
    # جهة إعتبارية محلية     |||  سجل تجاري |||||  رقم السجل   |||||||| النسبة المباعة
    When user add the first Party with obj of index "25" and id of index "2" civilId equal "230"  txtPercentFristParty "5" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    And user click on ShowChild btn and click on btnAddChildParty
    When user AddChildParty with adj of index "1" and obj of index "الرقم الشخصي" id equal "00000000090" and click on save btn
    And user close first Party and open the second Party
    #شريك في شركة  \\\\ رقم شخصي    \\\\ رقم السجل \\\\\ النسبة المباعة
    When user add the second Party with obj of index "6" and id of index "2" id equal "00000000215" and civilId equal "230" txtPercentFristParty "5"
    And user click on add button and add new second Party with id "00000000215" successfully
    And user close the second Party and open the model Nav
    When user add civilId_Num equal "230" and SALE_VALUE_COMPANY equal "3000" and click on add btn
    And user enter text " اضافة نص " in frame element
    And user click on save model btn
    And user close the the samples Nav and open the fees Nav
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    #And user click on btnCollection
    Then user click on btnSubmitTransaction



