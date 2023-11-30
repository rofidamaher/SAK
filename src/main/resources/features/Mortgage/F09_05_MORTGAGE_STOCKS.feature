#@smoke
Feature: F09_05_MORTGAGE_STOCKS | users could add new transactions for MORTGAGE_STOCKS

  Background:user could click on MORTGAGE_STOCKS
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on Documentation
    Then user clicked on Documentation successfully
    When user click on MORTGAGE
    Then user clicked on MORTGAGE successfully
    When user click on MORTGAGE_STOCKS
    Then user clicked on MORTGAGE_STOCKS successfully

  Scenario: user could add new transactions for MORTGAGE_STOCKS

    # وريث
    When user add the first Party with obj of index "29" and id of index "1" id equal "00000000200" and click on chkDepositFirstParty
    And Date of the Deceased is "محمد" book's number is "رقم1" and Book side is "جهة1" for warith and first Party
    And user click on add button and add new first Party successfully
    And user close first Party and open the second Party by xpath

    # ولي طبيعي
    When user add the second Party with obj of index "4" and id of index "2" id equal "00000000090"
    And book's number is "رقم1" and Book side is "جهة رقم1" for waly and second Party
    And user click on add button and add new second Party with id "00000000090" successfully
    And user click on ShowChild btn second Party
    When user Add childType with obj of index "1" id "00000000080" and click on save btn
    And user close second Party and open samples Nav for xpath

    # النماذج
    Then Commercial Registration No is "120021" and Company Name is "infotic" and Company Code is "Inft" and Shareholder Number is "223"
    When select MORTGAGE_PERIOD_FROM Y "2023" M "Jul" D "15" MORTGAGE_PERIOD_TO Y "2025" M "Jul" D "16" for Stocks
    Then Mortgage value is "120" and number of shares pledged is "200"
    And Add Debaga To Table And Add Debaga Request


    # عرض المحرر
    And user click on btnViewTransaction

    # تقدير الرسوم والتحصيل
    And user close the the samples Nav and open the fees Nav by xpath
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"

    # Then user click on btnCollection

    # اصدار المحرر
    Then user click on btnSubmitTransaction
