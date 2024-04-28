# Bitcoin Price Automation Framework

This automation framework is built using Java, Maven, RestAssured, and Cucumber.

## Setup
1. Clone the repository.
2. Make sure you have Java and Maven installed.
3. Install dependencies by running: `mvn clean install`.

## Running Tests
- To run tests on the default environment, use: `mvn verify`.
- To run tests on a specific environment, use: `mvn verify -Ptest -Denv=test`.

## Test Report
After running the tests, you can find the HTML test report at `build/test-results/timeline`.

## Environment Configuration
Environment configurations can be found in the `config` directory.

