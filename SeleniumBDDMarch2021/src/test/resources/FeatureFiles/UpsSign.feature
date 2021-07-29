Feature: This is sign up feature file
@Sanity @Regression
  Scenario: Verify Ups Sign Up page
    Given Customer in UPS sign up page
    When user gives input the name "Shahin"
    And user gives  input email "shahin@gmail.com"
    And user gives input userid"shahinur akter"
    And user gives input password"12345"
    And user enter the phone number"6317317470"
    And user  clicks the Agreement button
    Then user should be able to sign up
