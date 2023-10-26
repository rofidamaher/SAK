
Feature: F08_Search | users could use login functionality and user could open Search page
Background: user could login with valid username and password and open MainMenu
  When user login with email "tester7" and password "P@ssw0rd"
  And user press on login button
  And user login to the system successfully by user "tester7"
  And user open MainMenu

  Scenario: user could open Search page
    When user click on Search icon
    Then Search page open successfully
    And user enter request num "46094" in request field and click on search bun
    Then user find request successfully by searching request num "46094"


