Feature: Test Login Feature
@smoketest
Scenario: User is able to login to Application

Given User is on Login Page
When User enters UserName and Password
And Clicks on Login Button
Then User is Navigated to HomePage
