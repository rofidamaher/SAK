@smoke
Feature: F09_02_Mortage_of_a_company_or_institution | users could add new transactions for Mortage_of_a_company_or_institution

  Scenario:user could click on Mortage_of_a_company_or_institution
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on Documentation
    Then user clicked on Documentation successfully
    When user click on MORTGAGE
    Then user clicked on MORTGAGE successfully
#    When user click on MORTGAGE_LAND
#    Then user clicked on MORTGAGE_LAND successfully

#  Scenario: user could add new transactions for Mortage_of_free_land

#     # عن نفسه      |||  رقم شخصي
#    When user add the first Party with obj of index "8" and id of index "1" id equal "00000000200" and click on chkDepositFirstParty
#    And user click on add button and add new first Party successfully
#    And user close first Party and open the second Party
#
#     # شريك في شركة      |||  رقم شخصي
#    When user add the second Party with obj of index "6" and id of index "2" id equal "00000000085" and CR equal "230"
#    And user click on add button and add new second Party with id "00000000085" successfully