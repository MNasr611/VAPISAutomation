Feature: TestPost Health Check

  Scenario: TestPost happy scenario
    Given  Create Payload For Post Request
      | payLoadKey | payLoadValue |
      | helloY     | yTest        |
      | helloX     | null         |
    Then   Get TestPost positiveScenario
    # those are the same as the ones in the requestModelClass & in requestBodyClass

  Scenario Outline: TestGet happy scenario
    Given  Create Payload "<helloY>" and "<helloX>" For Post Request
    Examples:
      | helloY | helloX   |
      | x      | example1 |
      | y      | example2 |
      | x      | example3 |

