@ListUser
Feature: Patient app login  feature

  Scenario: Verify the list user feature
    Given The list user input payload
    When The user calls  with  GET method
    Then The status message should be success and the response should be 200