
Feature: F06_04_SALE_COMMERCIAL_REGISTRATION | users could add new transactions for SALE_COMMERCIAL_REGISTRATION
Background:user could click on SALE_COMMERCIAL_REGISTRATION
  When user login with email "tester7" and password "P@ssw0rd"
  And user press on login button
  And user login to the system successfully by user "tester7"
  And user click on Documentation
  Then user clicked on Documentation successfully
  When user click on SAlE
  And user clicked on SAlE successfully
  When user click on SALE_COMMERCIAL_REGISTRATION
  And user clicked on SALE_COMMERCIAL_REGISTRATION successfully

  #بيع رخصة تجارية
  Scenario: user could add new transactions for SALE_COMMERCIAL_REGISTRATION
    # عن نفسه      |||  رقم شخصي
    When user add the first Party with obj of index "8" and id of index "1" id "00000000200" and txtPercentFristParty "5" click on chkDepositFirstParty
    And user click on add button and add new first Party with id "00000000200" successfully
    And user close first Party and open the second Party by xpath
     # شريك في شركة      |||  رقم شخصي
    When user add the second Party with obj of index "6" and id of index "2" id "00000000085" and CR "230" txtPercentSecondParty "5"
    And user click on add button and add new second Party with id "00000000085" successfully
    And user close second Party and open samples Nav for xpath
    When user enter SALE_PERMIT_NO_COMPANY "1212" SALE_PERMIT_VALUE_COMPANY "2145" SALE_PERMIT_NO_APPROVAL_LETTER_COMPANY "748" and click on add btn
    And user click on save model btn
    And user close the the samples Nav and open the fees Nav by xpath
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    #And user click on btnCollection
    Then user click on btnSubmitTransaction

##

