@smoke
Feature: F05_01_POA_SPECIAL | users could add new transactions for POA_SPECIAL
Background:user could click on POA_SPECIAL
  When user login with email "amrsaid" and password "amrsaid"
  And user press on login button
  And user login to the system successfully by user "amrsaid"
  And user click on Documentation
  Then user clicked on Documentation successfully
  And user click on POA
  And user clicked on POA successfully
  When user click on POA_SPECIAL
  And user clicked on POA_SPECIAL successfully

   #توكيل خاص
  Scenario: user could add new transactions for POA_SPECIAL
     # عن نفسه      |||  رقم شخصي
    When user add the first Party with obj of index "8" and id of index "1" id equal "00000000200" and click on chkDepositFirstParty
    And user click on add button and add new first Party with id "00000000200" successfully
    And user close first Party and open the second Party by xpath

     # القيم   \\\\ رقم شخصي    \\\\ رقم الاثبات \\\\\ رقم الكتاب /// جهة الكتاب
    When user add the second Party with obj of index "1" and id of index "1" id "00000000080" txtValueRaqmSecondParty "1111" txtValueYearSecondParty "222"
    And user click on add button and add new second Party with id "00000000080" successfully
    And user click on ShowChild btn for id "00000000080"
    When user Add childType with obj of index "1"  id "00000000081" and click on save btn

    # المفوض (تفويض يدوي )      |||  رقم شخصي
    When user add the second Party with obj of index "2" and id of index "1" id "00000000083" txtBayanatElwkalaSecondParty "1111"
    And user click on add button and add new second Party with id "00000000083" successfully
    And user click on ShowChild btn for id "00000000083"
    When user Add childType with obj of index "1"  id "00000000084" and click on save btn

    # المفوض (تفويض الي )      |||  رقم شخصي
    When user add the second Party with obj of index "2" and id of index "1" id "00000000084" click on Wkala and txtRqmElwekalaSecondParty "2023/4032"
    And user click on add button and choose AgentPersonsSecond "00000000090" Sure new second Party id "00000000084" added successfully

    # الولي الطبيعي    \\\\ رقم شخصي    \\\\ رقم الاثبات \\\\\ رقم الكتاب /// جهة الكتاب
    When user add the second Party with obj of index "4" and id of index "1" id "00000000085" txtWalyRaqmSecondParty "222" txtWalyYearSecondParty "333"
    And user click on add button and add new second Party with id "00000000085" successfully
    And user click on ShowChild btn for id "00000000085"
    When user Add childType with obj of index "1"  id "00000000090" and click on save btn

    # مخول بالتوقيع قيد منشاه   //// رقم المنشاة   /// صندوق البريد  // رقم تليفون الشركة  // تاريخ الانتهاء
    When user add the second Party with obj of index "11" and id of index "1" id "00000000091" txtBuildingNumberSecondParty "12345678" txtEmailBoxSecondParty "111" txtCompanyPhoneSecondParty "32325656" cRExpiryDateSecondParty Y "2025" M "Jul" D "16"
    And user click on add button and add new second Party with id "00000000091" successfully

     # شريك في شركة      |||  رقم شخصي
    When user add the second Party with obj of index "6" and id of index "1" id equal "00000000091" and CR equal "200"
    And user click on add button and add new second Party with id "00000000091" successfully

   # شريك في مصنع      |||  رقم شخصي
    When user add the second Party with obj of index "7" and id of index "1" id equal "00000000091" and CR equal "200"
    And user click on add button and add new second Party with id "00000000091" successfully

    # مخول بالتوقيع في السجل التجاري      |||  رقم شخصي
    When user add the second Party with obj of index "10" and id of index "1" id equal "00000000091" and CR equal "200"
    And user click on add button and add new second Party with id "00000000091" successfully

    # مندوب عن شركة   //// رقم المنشاة   ///
    When user add the second Party with obj of index "12" and id of index "1" id "00000000080" txtBuildingNumberSecondParty "12345678"
    And user click on add button and add new second Party with id "00000000080" successfully

   # محامي      |||  رقم شخصي
    When user add the second Party with obj of index "15" and id of index "1" id equal "00000000201"
    And user click on add button then click on YesFirstParty and add second Party with id "00000000201" successfully

    And user close second Party and open samples Nav for xpath
    When user chick the fixed text checkbox and click inside the state of qatar radio btn
    And user click on save model btn
    And user close the the samples Nav and open the fees Nav by xpath
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    Then user click on btnSubmitTransaction


