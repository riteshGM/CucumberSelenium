@BackgroundSample
Feature: User Login Functionality Another Application

  Background: User is logged in
    Given Browser is Open
    And URL is loaded
    When User enters username and password
    Then user is navigated to HomePage

  Scenario: Check User is Able to Navigate to Dashboard
    Given User Clicks on Dashboard link
    Then Dashboard title is present

  Scenario: Check User is Able to Navigate to Address Section
    Given User Clicks on Address Link
    Then Address Title is present
