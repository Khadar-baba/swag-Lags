Feature: Filter page functionality
@LowPrice

  Scenario: Verify user can able to filter the items from low to high
    Given I am on the swagLog Login Page
    And I enter the valid user and valid password of swagLog
    And I display the openMenu fields
    And I am on the products page
    And I select all the products by using cart
    And I display items in cart
    And I remove some items in cart
    And I get no of cart items value
    When I apply the filter low to high price
    Then I see first item must have low price
@HighPrice
    Scenario: verify user can able to filter the items high to low
    Given I am on the swagLog Login Page
    And I enter the valid user and valid password of swagLog
    And I display the openMenu fields
    And I am on the products page
    And I select all the products by using cart
    And I display items in cart
    And I remove some items in cart
    And I get no of cart items value
    When I apply the filter high to low
    Then I see first item must have high price 
 @AlphabetOrder
 Scenario: verify user can able to filter the items alphabet order
    Given I am on the swagLog Login Page
    And I enter the valid user and valid password of swagLog
    And I display the openMenu fields
    And I am on the products page
    And I select all the products by using cart
    And I display items in cart
    And I remove some items in cart
    And I get no of cart items value
    When I apply the filter alphabet order
    Then I see first item must have first alphabet 
 
