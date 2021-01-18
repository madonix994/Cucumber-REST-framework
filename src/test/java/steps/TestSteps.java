package steps;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.classes.responses.PlayerLoginRS;
import helpers.classes.responses.CreatePlayerRS;
import org.apache.commons.lang.StringUtils;

import static helpers.ConnectionManager.ConnectionManager.*;
import static helpers.CreatePlayer.*;
import static helpers.LoginPlayer.generateRequestForPlayerLogin;
import static helpers.LoginPlayer.playerLoginRQ;

public class TestSteps {

	public static String env = System.getProperty("url");
	public static CreatePlayerRS createPlayerRS;
	public static PlayerLoginRS playerLoginRS;

	@Given("^The env is up and running$")
	public void theEnvIsUpAndRunning() throws Exception {
		if (StringUtils.isEmpty(env)) {
			env = "icmanrc";
			System.out.println("Env was changed!");
		}
		System.out.println("\n\n ENV: " + env);
		pingEnvironment(env);
	}

	@When("^User wants to create player$")
	public void userWantsToCreatePlayer() throws Exception {
		createNewPlayer();
	}

	@Then("^User send request to create player$")
	public void userSendRequestToCreatePlayer() throws Exception {
		currentRequest = "CreatePlayer";
		String response = sendRequest(env, generateRequest(createPlayerRQ));
		if (response.contains("Request Error")) {
			throw new Exception("\n\nPlayer was not created with username: " + player.getUserName());
		} else {
			System.out.println("\n\nPlayer was created with username: " + player.getUserName());
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			createPlayerRS = gson.fromJson(response, CreatePlayerRS.class);
		}
	}

	@And("^User validate that player can login$")
	public void userValidateThatPlayerCanLogin() throws Exception {
		playerLoginRQ = generateRequestForPlayerLogin(player.getUserName(), player.getPassword());
		currentRequest = "PlayerLogin";
		String response = sendRequest(env, generateRequest(playerLoginRQ));
		if (response.contains("Request Error")) {
			throw new Exception("\n\nPlayer with username: " + player.getUserName() + " could not login.");
		} else {
			System.out.println("\n\nPlayer with username: " + player.getUserName() + " was successfully logged in.");
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			playerLoginRS = gson.fromJson(response, PlayerLoginRS.class);
		}
	}
}
