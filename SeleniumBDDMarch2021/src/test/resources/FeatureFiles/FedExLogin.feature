Feature: This is FedEx login feature file

  @Sanity @Regression
  Scenario: Verify FedEx user login
    Given user in FedEx login page
    When user gives userid input "Shahin"
    And user gives password input "Sun"
    And user click the submit button
    Then user should be able to login

  @Regression @Smoke @Sprint07
  Scenario Outline: Verify  user login using wrong userid and wrong password
    Given user  in FedEx login page
    When user gives userid input "<UserID>"
    And user gives password input "<Password>"
    And user click the submit button
    Then user should not be able to login

    Examples: 
      | UserID | password |
      | Moon   | Sun      |
      | Sam    | Doll     |
