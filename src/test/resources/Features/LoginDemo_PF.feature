#Scenario Outline Example
Feature: Test login functionality
@LoginDemo_PF
  Scenario Outline: Check login is successful with valid credentials_PF
    Given browser is open_PF
    And user is on login page_PF
    When user enters <username> and <password>_PF
    And user clicks on login_PF
    Then user is navigated to the home page_PF

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |