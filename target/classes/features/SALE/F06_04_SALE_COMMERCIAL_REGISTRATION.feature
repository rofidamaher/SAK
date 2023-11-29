@smoke
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

  #بيع  حصص في شركة / مؤسسة
  Scenario: user could add new transactions for SALE_COMMERCIAL_REGISTRATION
    # عن نفسه      |||  رقم شخصي // النسبة المباعة
    When user add the first Party with obj of index "8" and id of index "1" id "00000000091" PercentFristParty "10" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    And user close first Party and open the second Party
   # وصي   \\\\ رقم شخصي    \\\\ رقم الاثبات \\\\\ النسبة المشتراه/// رقم الكتاب /// جهة الكتاب
    When user add the second Party with obj of index "3" and id of index "2" id "00000000200" PercentSecondParty "10" WasySecondParty "55" WasyYearSecondParty "555"
    And user click on add button and add new second Party with id "00000000200" successfully
    And user click on ShowChild btn second Party
    When user Add childType with obj of index "1"  id "00000000080" and click on save btn
    And user close second Party and open samples Nav
    When user enter SALE_PERMIT_NO_COMPANY "1414" SALE_PERMIT_VALUE_COMPANY "255" SALE_PERMIT_NO_APPROVAL_LETTER_COMPANY "2145" and click on add btn
    And user click on save model btn
    And user close the the samples Nav and open the fees Nav
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    #And user click on btnCollection
    Then user click on btnSubmitTransaction

##

