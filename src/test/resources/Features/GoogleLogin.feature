Feature: Google Search Functionality

  @smoketest
  Scenario: User is able to search in google
    Given browser is loaded
    And user is on google search page
    When user enters search text
    And user hits search button
    Then user is navigated to search results page
