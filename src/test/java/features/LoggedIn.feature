Feature: Logged In User View

  Scenario: Validate user is able to view after loggedin
    Given User navigates to login page
    When User successfully enters the login details
    Then The user should be able to view the product category page
