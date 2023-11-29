
Feature: F09_04_MORTGAGE_ACCOUNT | users could add new transactions for MORTGAGE_ACCOUNT

  Background:user could click on MORTGAGE_ACCOUNT
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on Documentation
    Then user clicked on Documentation successfully
    When user click on MORTGAGE
    Then user clicked on MORTGAGE successfully
    When user click on MORTGAGE_ACCOUNT
    Then user clicked on MORTGAGE_ACCOUNT successfully

  Scenario: user could add new transactions for MORTGAGE_ACCOUNT
    # المؤسس
    When user add the first Party with obj of index "22" and id of index "1" id equal "00000000200" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    And user close first Party and open the second Party by xpath
    # رئيس مجلس الامناء
    When user add the second Party with obj of index "23" and id of index "2" id equal "00000000085"
    And user click on add button and add new second Party with id "00000000085" successfully

    # النماذج
    And user close second Party and open samples Nav for xpath
    Then Account Number is "2122" Name Of Bank is "1"
    When select MORTGAGE_PERIOD_FROM Y "2023" M "Jul" D "15" MORTGAGE_PERIOD_TO Y "2025" M "Jul" D "16" for Account
    Then Mortgage value is "120" and Approval letter number is "120" for Account
    And Add Debaga To Table And Add Debaga Request

    # عرض المحرر
    And user click on btnViewTransaction

    # تقدير الرسوم والتحصيل
    And user close the the samples Nav and open the fees Nav by xpath
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"

    # Then user click on btnCollection

    # اصدار المحرر
    Then user click on btnSubmitTransaction
