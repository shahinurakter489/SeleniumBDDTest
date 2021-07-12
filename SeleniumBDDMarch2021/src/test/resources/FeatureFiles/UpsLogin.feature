Feature: This feature file is for UPS Login feature

  @Sanity @Regression
  Scenario: Verify UPS customer login
    Given Customer in UPS login page
    When Customer gives userid input "Brazil"
    And Customer gives password input "Argentina"
    And Customer clicks the submit button
    Then Customer should be able to login

  @Regression @Smoke @Sprint07
  Scenario Outline: Verify UPS customer login using wrong userid and wrong password
    Given Customer in UPS login page
    When Customer gives userid input "<UserID>"
    And Customer gives password input "<Password>"
    And Customer clicks the submit button
    Then Customer should NOT be able to login

    Examples: 
      | UserID | Password |
      | Hello  | World    |
      | Robin  | Hood     |
