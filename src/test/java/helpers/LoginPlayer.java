package helpers;

import helpers.classes.requests.PlayerLoginRQ;

import static helpers.CreatePlayer.player;

public class LoginPlayer {
	public static PlayerLoginRQ playerLoginRQ;

	public static PlayerLoginRQ generateRequestForPlayerLogin(String username, String password) {
		return new PlayerLoginRQ(username, password);
	}
}
