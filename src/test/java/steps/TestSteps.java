package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static helpers.ConnectionManager.ConnectionManager.*;
import static helpers.CreatePlayer.createNewPlayer;
import static helpers.CreatePlayer.player;

public class TestSteps {

	@Given("^The env is up and running$")
	public void theEnvIsUpAndRunning() throws Exception {
		pingEnvironment("icmanrc");
	}

	@When("^User wants to create player$")
	public void userWantsToCreatePlayer() throws Exception {
		createNewPlayer();
	}

	@Then("^User send request to create player$")
	public void userSendRequestToCreatePlayer() throws Exception {
		String response = sendRequest("icmanrc", generateRequest(player));
		if (response.contains("Request Error")) {
			throw new Exception("\n\nPlayer was not created with username: " + player.getUserName());
		} else {
			System.out.println("\n\nPlayer was created with username: " + player.getUserName());
		}
	}
}
