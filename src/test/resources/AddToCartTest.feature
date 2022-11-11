Feature: Add to cart functionality

  Scenario: User searches for various items
    Given user opens website
    When user adds to cart gaming item xbox
    Then user views cart and sees item added
