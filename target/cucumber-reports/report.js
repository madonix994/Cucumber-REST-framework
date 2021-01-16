$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Create new Player via API",
  "description": "",
  "id": "test;create-new-player-via-api",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The env is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User wants to create player",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User send request to create player",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.theEnvIsUpAndRunning()"
});
formatter.result({
  "duration": 667431200,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.userWantsToCreatePlayer()"
});
formatter.result({
  "duration": 186734500,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.userSendRequestToCreatePlayer()"
});
formatter.result({
  "duration": 1270673300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Create new Player via API2",
  "description": "",
  "id": "test;create-new-player-via-api2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "The env is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User wants to create player",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User send request to create player",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.theEnvIsUpAndRunning()"
});
formatter.result({
  "duration": 57446900,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.userWantsToCreatePlayer()"
});
formatter.result({
  "duration": 31795300,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.userSendRequestToCreatePlayer()"
});
formatter.result({
  "duration": 1223033500,
  "status": "passed"
});
});