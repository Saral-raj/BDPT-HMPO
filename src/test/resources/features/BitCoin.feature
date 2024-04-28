
Feature: Validate current price for Bitcoin in GBP via Coinbase API
  @TestAPI
  Scenario: Get current price for Bitcoin in GBP
    Given I set the base URI for Coinbase API
    When I send a GET request to the endpoint to get current Bitcoin price
    And I extract the Bitcoin price in GBP to print
    And I print the bitcoin rate in GBP