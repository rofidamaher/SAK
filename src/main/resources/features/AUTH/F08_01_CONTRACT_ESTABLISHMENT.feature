@smoke
Feature: F08_01_CONTRACT_ESTABLISHMENT | users could add new transactions for CONTRACT_ESTABLISHMENT
  Background:user could click on CONTRACT_ESTABLISHMENT
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user click on Documentation
    Then user clicked on Documentation successfully
    When user click on AUTH
    And user clicked on AUTH successfully
    When user click on CONTRACT_ESTABLISHMENT
    And user clicked on CONTRACT_ESTABLISHMENT successfully

    # عقد تاسيس
  Scenario: user could add new transactions for CONTRACT_ESTABLISHMENT
      # شريك فى شركة اجنبية      |||  رقم شخصي // محل الاقامة /// نسبة المشاركة ///السجل التجاري /// اسم الشركة /// الجنسية
    When user add the first Party with obj of index "5" and id of index "1" id "00000000085" addressFirstParty "testtest" txtFirstRatioOfPartnership "10" txtElsqlEltogaryFirstParty "4541" txtCompanyNameFirstParty "for test " txtNationalitySeglFirstParty "2" and click on chkDepositFirstParty
    And user click on add button and add new first Party successfully
    And user close first Party and open the second Party
     # شريك في شركة      |||  رقم شخصي /// الصلاحية \\\ مدة الصلاحية
    When user add the second Party with obj of index "6" and id of index "2" id "00000000085" and txtSecondPrivilege "2" txtSecondPrivilegeValidity "2"
    And user click on add button and add new second Party with id "00000000085" successfully
    And user close second Party and open samples Nav
    When user enter CONTRACT_ESTABLISHMENT_COMPANY TYPE "1" NAME "شركة مصر " ADDRESS "مصر" CAPITAL "200000" DURATION "2" ACTIVITIES "التجارة"
    And user click on save model btn
    And user close the the samples Nav and open the fees Nav
    When user click on noFees checkbox and select ExcemptedReasons "جهة حكومية"
    And user click on btnViewTransaction
    Then user click on btnSubmitTransaction


