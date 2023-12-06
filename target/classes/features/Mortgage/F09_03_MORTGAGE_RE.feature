
Feature: F09_03_MORTGAGE_RE | users could add new transactions for MORTGAGE_RE
  Background:user could click on MORTGAGE
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on Documentation
    Then user clicked on Documentation successfully
    When user click on MORTGAGE
    Then user clicked on MORTGAGE successfully
    When user click on MORTGAGE_RE
    Then user clicked on MORTGAGE_RE successfully
#الرهن

  Scenario: user could add new transactions for MORTGAGE_RE
    # جهة اعتبارية اجنبية     |||  رقم السجل // الجنسية  /// الاسم
    When user add the first Party with obj of index "44" civilId "54646465" ddlNationalityFirstParty_chosen "4" textname "خالد علي محمد" and click on chkDepositFirstParty
    And user click on add button and add new first Party with id "00000000200" successfully
    And user click on ShowChild btn
    When user AddChildParty with adj of index "1" and obj of index "1" id equal "00000000090" and click on save btn
    And user close first Party and open the second Party
    # مخول بالتوقيع في السجل التجاري /// رقم شخصي /// السجل التجاري
    When user add the second Party with obj of index "10" and id of index "2" id equal "00000000091" and CR equal "230"
    And user click on add button and add new second Party with id "00000000091" successfully
    # عن نفسه // رقم الاثبات
    And user add the second Party with obj of index "8" and id of index "1" id equal "00000000080"
    And user click on add button and add new second Party with id "00000000080" successfully
    And user close second Party and open samples Nav
    When user enter MORTGAGE_NAME_RE "test" MORTGAGE_VALUE_RE "45452" MORTGAGE_NO_APPROVAL_LETTER_RE "84" MORTGAGE_PERIOD_FROM Y "2023" M "Jul" D "10" MORTGAGE_PERIOD_TO Y "2025" M "Jul" D "16"
    And user click on save model btn
    And user close the the samples Nav and open the fees Nav
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    Then user click on btnSubmitTransaction



