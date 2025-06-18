Feature: Logged In User View

  Scenario: Validate user is able to view after clicking on new registration
    Given User navigates to login page
    When User clicks on new registration button
    Then The user should be able to view the registration page
