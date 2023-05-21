## Sample Feature with DataTable


Feature: Sample Feature with DataTable
@DataTableAsMap
  Scenario Outline: Test Data Table to Recive Multiple Data Rows in single Step
  	Given User has Logged in Application
    When I want to write a step with Data Table as Map
      | FirstName  | LastName | City  |
      | Ritesh |     Mansukhani | Pune |
      | Jaikumar |     Mansukhani | LA    |
     Then Validate User <username> is created
     Then User is done
				Examples:
				|username|
				|ritesh123|
				|jaikumar123|