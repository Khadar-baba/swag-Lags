 Feature: Remove cart items functionality 
 @Remove
 Scenario: Verify user can able remove products by using remove button
    Given I am on the swagLog Login Page
    And I enter the valid user and valid password of swagLog
    And I display the openMenu fields
    And I am on the products page
    And I select all the products by using cart 
    And I display items in cart
    When I remove some items in cart
    Then I get no of cart items value
 