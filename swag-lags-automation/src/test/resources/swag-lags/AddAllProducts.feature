Feature: Add all products by using only cart funcationality
@Smoke

  Scenario: Verify user can able to add all the products by using only cart button
    Given I am on the swagLog Login Page
    And I enter the valid user and valid password of swagLog
    And I display the openMenu fields
    And I am on the products page
    When I select all the products by using cart 
    Then I display items in cart
