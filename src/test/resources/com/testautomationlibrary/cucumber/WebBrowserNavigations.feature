Feature: Tests to demo browser navigation using Page Object Model

  Scenario: While the user is on the Message Form page, and enters enters a message, the user should see the same message they entered on the label
    Given the user navigates to message form page
    When  enters the message "Hello World" into the text box
    Then the entered "Hello World" message should be displayed on the output label


  Scenario: While the user launches the Message Form page, navigates to checkbox page, checks the checkbox, then the success message should be displayed
    Given the user navigates to message form page
    When the user navigates to check box page
    And checks the checkbox
    Then the message "Success - Check box is checked" should be displayed
