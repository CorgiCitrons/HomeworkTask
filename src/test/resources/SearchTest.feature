Feature: Search functionality

  Scenario Outline: User searches for various items
    Given user opens website
    When user searches for '<item>'
    Then user sees search results for '<item>'

    Examples:
      | item            |
      | controller      |
      | Asus ZenBook 13 |

  Scenario Outline: User searches for various items that yield 0 results
    Given user opens website
    When user searches for '<item>'
    Then user sees search results for '<item>'

    Examples:
      | item                 |
      | eefefF$%^12^^&DPPADF |
      | aaaaaaaaauuu&&66--   |