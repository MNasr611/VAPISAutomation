Feature: Get Users

  Scenario: TestGet happy scenario
    Given  Create Multiple QueryParams For Get Request
      | queryParamKey | queryParamValue |

    When   Get Users
    And    Get Posts For The User
    And    Validate That The PostId Is Integer Between 1 and 100
    And    Create Payload For Post Request
      | payLoadKey | payLoadValue       |
      | title      | APIs Automation    |
      | body       | Automation Is Life |
    And    Add New Post
    Then   Validate That the Post Added Successfully

