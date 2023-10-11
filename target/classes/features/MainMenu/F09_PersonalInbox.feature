@smoke
Feature: F09_PersonalInbox | users could use login functionality and user could open PersonalInbox page
Background: user could login with valid username and password and open MainMenu
  When user login with email "tester7" and password "P@ssw0rd"
  And user press on login button
  And user login to the system successfully by user "tester7"
  And user open MainMenu

  Scenario: user could PersonalInbox page
    When user click on PersonalInbox
    Then PersonalInbox page open successfully
    And user enter request num "44728" in request field and click on search btn on PersonalInbox page
    Then user find request successfully in PersonalInbox pag


