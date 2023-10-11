@smoke
  Feature: F06_AddNewT | user could use add NewTreatment functionality
    Background: user could login
      When user login with email "tester7" and password "P@ssw0rd"
      And user press on login button
      And user login to the system successfully by user "amrsaid"
      And user click on Documentation
      Then user clicked on Documentation successfully
      And user click on Tawkel
      And user clicked on Tawkel successfully
      And user click on Tawkel racmy
      And user clicked on Tawkel racmy successfully

    Scenario Outline: : user could add new Treatment
      When user add new teratment for obj of index "<obj>" and id of index "1" id equal "00000000091"
      And user click on add but and add new treatment successfully
Examples:
      |obj|
      |8|
    #  |22|
    #  |23|
    #  |30|
    #  |32|
     # |34|