
  Feature:AddNewT | user could use add NewTreatment functionality
    Background: user log in
      When user login with email "tester7" and password "P@ssw0rd"
      And user press on login button
      And user login to the system successfully by user "tester7"
      And user click on Documentation
      Then user clicked on Documentation successfully
      And user click on POA
      And user clicked on POA successfully
      And user click on POA_SPECIAL
      And user clicked on POA_SPECIAL successfully

    Scenario Outline: user could add new Treatment
      When user add new treatment for obj of index "<obj>" and id of index "1" id equal "00000000091"
      And user click on add but and add new treatment successfully
Examples:
      |obj|
      |8|
      |22|
      |23|
      |30|
      |32|
      |34|
  Scenario Outline: user could add new treatment with Commercial Record
    When user add new treatment for obj of index "<obj>" and id of index "1" id equal "00000000085" and CR equal "230"
    And user click on add but and add new treatment successfully
    Examples:
    |obj|
  #  |9  |
    |6   |
    |7  |
    |24  |