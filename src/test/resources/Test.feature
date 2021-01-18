Feature: Test

  @smoke
  Scenario: Create new Player via API
    Given The env is up and running
    When User wants to create player
    Then User send request to create player

  @smoke
  Scenario: Create new Player with Login via API
    Given The env is up and running
    When User wants to create player
    Then User send request to create player
    And User validate that player can login