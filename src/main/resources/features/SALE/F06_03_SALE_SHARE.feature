#@smoke
Feature: F06_03_SALE_SHARE | users could add new transactions for SALE_SHARE
Background:user could click on SALE_SHARE
  When user login with email "tester7" and password "P@ssw0rd"
  And user press on login button
  And user login to the system successfully by user "tester7"
  And user click on Documentation
  Then user clicked on Documentation successfully
  When user click on SAlE
  And user clicked on SAlE successfully
  When user click on SALE_SHARE
  And user clicked on SALE_SHARE successfully

  #بيع  حصص في شركة / مؤسسة
  Scenario: user could add new transactions for SALE_COMPANY
    # جهة إعتبارية محلية     |||  سجل تجاري |||||  رقم السجل   |||||||| النسبة المباعة
    When user add the first Party with obj of index "25" and id of index "2" civilId equal "230"  txtPercentFristParty "10" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    And user click on ShowChild btn
    When user select person has id "00000000215" soldValue "10" and click on save btn
    And user close first Party and open the second Party
    #شريك في شركة  \\\\ رقم شخصي    \\\\ رقم السجل \\\\\ النسبة المباعة
    When user add the second Party with obj of index "6" and id of index "2" id equal "00000000085" and civilId equal "230" txtPercentFristParty "5"
    And user click on add button and add new second Party with id "00000000085" successfully
    And user close second Party and open samples Nav
    When user enter SALE_NAME_COMPANY "شركة البركة" SALE_COMMERICAL_NO_STOCKS "230" date Y "2023" M "Jul" D "15" SALE_VALUE_STOCKS "54555" and click on add btn
    And user click on save model btn
    And user close the the samples Nav and open the fees Nav
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    #And user click on btnCollection
    Then user click on btnSubmitTransaction

##

