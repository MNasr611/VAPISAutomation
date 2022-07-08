Feature: TestGet Health Check

  Scenario: TestGet happy scenario
    Given  Create Multiple QueryParams For Get Request
      | queryParamKey | queryParamValue       |
      | x             | xTest                 |
      | y             | @                     |
      | z             | -!Select * from users |
    Then   Get TestGet positiveScenario


  Scenario Outline: TestGet happy scenario
    Given  Create QueryParam "<queryParamKey>" and "<queryParamValue>" For Get Request
    Then   Get TestGet positiveScenario
    Examples:
      | queryParamKey | queryParamValue |
      | x             | example1        |
      | x             | example2        |
      | x             | example3        |

