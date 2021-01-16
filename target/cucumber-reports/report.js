$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 2,
  "name": "Test",
  "description": "",
  "id": "test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Create new Player via API",
  "description": "",
  "id": "test;create-new-player-via-api",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The env is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User wants to create player",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User send request to create player",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.theEnvIsUpAndRunning()"
});
formatter.result({
  "duration": 655564800,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.userWantsToCreatePlayer()"
});
formatter.result({
  "duration": 176312200,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.userSendRequestToCreatePlayer()"
});
formatter.result({
  "duration": 132462700,
  "error_message": "java.lang.Exception: \n\nPlayer was not created with username: QAWA8K1p9Z0x4\r\n\tat steps.TestSteps.userSendRequestToCreatePlayer(TestSteps.java:27)\r\n\tat ✽.Then User send request to create player(Test.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 11,
  "name": "Create new Player via API2",
  "description": "",
  "id": "test;create-new-player-via-api2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "The env is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User wants to create player",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User send request to create player",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.theEnvIsUpAndRunning()"
});
formatter.result({
  "duration": 56795400,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.userWantsToCreatePlayer()"
});
formatter.result({
  "duration": 42591000,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.userSendRequestToCreatePlayer()"
});
formatter.result({
  "duration": 70864200,
  "error_message": "java.lang.Exception: \n\nPlayer was not created with username: QAWA8o4k4M1j6\r\n\tat steps.TestSteps.userSendRequestToCreatePlayer(TestSteps.java:27)\r\n\tat ✽.Then User send request to create player(Test.feature:14)\r\n",
  "status": "failed"
});
});