Feature: Continue shopping functionality

  @ContinueShopping
  Scenario: Verify user can able to add two more items and continue shopping
    Given I am on the swagLog Login Page
    And I enter the valid user and valid password of swagLog
    And I display the openMenu fields
    And I am on the products page
    And I select all the products by using cart
    And I display items in cart
    And I remove some items in cart
    When I add the some more items and continue shopping
    Then I see the firstName field
