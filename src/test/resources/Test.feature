@all
Feature: Test

  @smoke
  Scenario: Create new Player via API
    Given The env is up and running
    When User wants to create player
    Then User send request to create player

  @regression
  Scenario: Create new Player via API2
    Given The env is up and running
    When User wants to create player
    Then User send request to create player