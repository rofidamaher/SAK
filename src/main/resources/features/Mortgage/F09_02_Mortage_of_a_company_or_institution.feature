@smoke
Feature: F09_02_Mortage_of_a_company_or_institution | users could add new transactions for Mortage_of_a_company_or_institution

  Background:user could click on Mortage_of_a_company_or_institution
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on Documentation
    Then user clicked on Documentation successfully
    When user click on MORTGAGE
    Then user clicked on MORTGAGE successfully
    When user click on MORTGAGE_COMPANY
    Then user clicked on MORTGAGE_COMPANY successfully

  Scenario: user could add new transactions for Mortage_of_company_institution

    # القيم
    When user add the first Party with obj of index "1" and id of index "1" id equal "00000000200" and click on chkDepositFirstParty
    And book's number is "رقم1" and Book side is "جهة رقم1"

    And user click on add button and add new first Party successfully
    And user close first Party and open the second Party

    # الوصي
    When user add the second Party with obj of index "3" and id of index "2" id equal "00000000090"
    And book's number is "رقم1" and Book side is "جهة رقم1" for second party
    And user click on add button and add new second Party with id "00000000085" successfully

    # النماذج
    And user close second Party and open samples Nav
    Then Commercial Registration No is "12012" and Company Name is "Informa" and mail box is "Informa@gmail.com" and phone number is "19777"
    And select EXPIRE_DATE Y "2025" M "Jul" D "16"
    When select MORTGAGE_PERIOD_FROM Y "2023" M "Jul" D "15" MORTGAGE_PERIOD_TO Y "2025" M "Jul" D "16" for MORTGAGE_COMPANY
    Then Mortgage value is "120" and Approval letter number is "120" for Mortgage Company
    And Add Debaga To Table And Add Debaga Request

    # عرض المحرر ثم اصدار المحرر
    And user click on btnViewTransaction
#    Then user click on btnCollection
    Then user click on btnSubmitTransaction

