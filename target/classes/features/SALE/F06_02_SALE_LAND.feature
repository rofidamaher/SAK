@smoke
Feature: F06_01_SALE_LAND | users could add new transactions for SALE_COMPANY
Background:user could click on POA_SPECIAL
  When user login with email "tester7" and password "P@ssw0rd"
  And user press on login button
  And user login to the system successfully by user "tester7"
  And user click on Documentation
  Then user clicked on Documentation successfully
  When user click on SAlE
  And user clicked on SAlE successfully
  When user click on SALE_LAND
  And user clicked on SALE_LAND successfully


  Scenario: user could add new transactions for SALE_COMPANY
    # وكيل بموجب وكالة    //// الرقم الشخصي   ///  رقم الوكالة
    When user add the first Party with obj of index "13" and id of index "1" id "00000000081" txtBayanatElwkalaFirstParty "54/2014" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    And user click on ShowChild btn
    When user Add childType with obj of index "1"  id "00000000090" and click on save btn
    And user close first Party and open the second Party
    # القيم   \\\\ رقم شخصي    \\\\ رقم الاثبات \\\\\ رقم الكتاب /// جهة الكتاب
    When user add the second Party with obj of index "1" and id of index "2" id "00000000085" txtValueRaqmSecondParty "55" txtValueYearSecondParty "555"
    And user click on add button and add new second Party with id "00000000085" successfully
    And user click on ShowChild btn second Party
    When user Add childType with obj of index "1"  id "00000000080" and click on save btn
    And user close the second Party and open the model Nav
    When user add SALE_REGION_LAND "الدوحة" and SALE_AREA_LAND "5655" SALE_FIGURE_AREAL_LAND "454574985" SALE_VALUE_LAND "54556" SALE_NO_APPROVAL_LETTER_LAND "6654" and click on add btn
    And user enter text " اضافة نص " in frame element
    And user click on save model btn
    And user close the the samples Nav and open the fees Nav
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    #And user click on btnCollection
    Then user click on btnSubmitTransaction



