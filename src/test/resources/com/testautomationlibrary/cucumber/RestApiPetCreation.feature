Feature: Tests to demo REST API interactions in testing using RestAssured methods

  Scenario: When the user creates a pet using the default values, the pet should be created successfully
    When the user create a pet using default valid values
    Then the create pet end point should return http code 200
    And the created pet values should match the input pet values