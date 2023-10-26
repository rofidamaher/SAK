@smoke
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
    When user add the first Party with obj of index "25" and id of index "2" civilId equal "200"  txtPercentFristParty "5" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    And user click on add button and add new first Party successfully
    # And user close first Party and open the second Party
   # When user add the second Party with obj of index "6" and id of index "1" id equal "00000000085" and CR equal "230"
  #  And user click on add button and add new second Party with id "00000000085" successfully
  #  And user close the second Party and open the model Nav
  #  When user chick the fixed text checkbox and click inside the state of qatar radio btn
  #  And user click on save model btn
  #  And user close the the samples Nav and open the fees Nav
  #  When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
  #  And user click on btnViewTransaction
  #  Then user click on btnSubmitTransaction


