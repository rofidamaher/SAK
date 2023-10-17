@smoke
Feature: F05_02_POA_PARTIAL_STEPPED | users could add new transactions for POA_PARTIAL_STEPPED
Background:user could click on POA_PARTIAL_STEPPED
  When user login with email "tester7" and password "P@ssw0rd"
  And user press on login button
  And user login to the system successfully by user "tester7"
  And user click on Documentation
  Then user clicked on Documentation successfully
  And user click on POA
  And user clicked on POA successfully
  When user click on POA_PARTIAL_STEPPED
  And user clicked on POA_PARTIAL_STEPPED successfully

  Scenario: user could add new transactions for POA_SPECIAL
    When user add the first Party with obj of index "13" and id of index "1" id equal "00000000201" and BayanatElwkalaFirstParty equal "10/2010" click on btnAddFirstParty
    And user click on add button and add new first Party successfully
    And user click on addCompanyStakeholder with id of index "2" id equal "12345678" and Choose a nationality equal "3" and click at add btn and save btn
    And user close first Party and open the second Party



