
Feature:MainMenu | users could use login functionality and open MainMenu

  Scenario: user could login with valid username and password and open MainMenu
    When user login with email "tester7" and password "P@ssw0rd"
    And user press on login button
    And user login to the system successfully by user "tester7"
    And user open MainMenu
