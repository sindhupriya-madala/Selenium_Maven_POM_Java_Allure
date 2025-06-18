Feature: General User View

  Scenario: Validate user is able to view product without login
    Given User navigates to online products page
    When User clicks Formal Shoes dropdown
    Then The user should be able to view the products
