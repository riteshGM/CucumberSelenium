## Sample Feature with DataTable


Feature: Sample Feature with DataTable
@DataTable
  Scenario: Test Data Table to Recive Multiple Data Rows in single Step
  	Given User has Logged in Application
    When I want to write a step with Data Table as List
      | FirstName  | LastName | City  |
      | Ritesh |     Mansukhani | Pune |
      | Jaikumar |     Mansukhani | LA    |
		Then User is done
