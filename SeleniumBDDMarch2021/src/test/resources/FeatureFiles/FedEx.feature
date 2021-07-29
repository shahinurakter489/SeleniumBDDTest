Feature: This is for testing in FedEx home page features

  @Sanity @Regression
  Scenario: Verify the Tracking from the FedEx home page
    Given user in the FedEx home page
    When user gives invalid tracking number"track-456"
    And user click teh track button
    Then user should receive error message
