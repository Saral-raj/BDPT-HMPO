#!/bin/bash

# Navigate to the directory where your Maven project is located
# shellcheck disable=SC2164
cd /documents/bdpt_technical_assessment_starter

# Run Maven clean and verify goals to execute Selenium tests
mvn clean verify
