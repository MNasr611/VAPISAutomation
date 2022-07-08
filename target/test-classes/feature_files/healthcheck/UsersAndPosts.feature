Feature: Get Users And Add Posts

  Scenario: Get Specific User and Add A Post To The Wall
    Given  Create Multiple QueryParams For Get Request
      | queryParamKey | queryParamValue |
    When   Get Users
    And    Create QueryParam "userId" For Get Request
    And    Get Posts For The User
    And    Validate That The PostId Is Integer Between 1 and 100
    And    Create Payload For Post Request
      | payLoadKey | payLoadValue       |
      | title      | APIs Automation    |
      | body       | Automation Is Life |
    And    Add New Post
    Then   Validate That the Post Added Successfully



  Scenario: Get Specific User and Add A Post To The Wall
    Given  Create Multiple QueryParams For Get Request
      | queryParamKey | queryParamValue |
    When   Get Users
    And    Create QueryParam "userId" For Get Request
    And    Get Posts For The User
#    And    Validate That The PostId Is Integer Between 1 and 100
    And    Create Payload For Post Request
      | payLoadKey | payLoadValue       |
      | title      | APIs Automation    |
      | body       | Automation Is Life |
    And    Add New Post
    And    Get Posts For The User
    Then   Validate that New Post With Title "APIs Automation" Has Been Added
    #delete the post