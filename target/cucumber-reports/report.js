$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11064100,
  "status": "passed"
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
  "duration": 643875700,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.userWantsToCreatePlayer()"
});
formatter.result({
  "duration": 178787000,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.userSendRequestToCreatePlayer()"
});
formatter.result({
  "duration": 991829900,
  "status": "passed"
});
formatter.after({
  "duration": 3885000,
  "status": "passed"
});
});