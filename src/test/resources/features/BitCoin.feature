@BitCoinAPI
Feature: Get Bitcoin Rate
  As a user
  I want to make a GET call to Coinbase API
  To get the current price for Bitcoin in GBP

  Scenario: Get Bitcoin Rate in GBP
    Given I make a GET request to "https://api.coindesk.com/v1/bpi/currentprice.json"
    Then the response status code should be 200
    And the Bitcoin rate in GBP should be printed