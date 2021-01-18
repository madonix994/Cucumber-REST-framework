package helpers;

import com.github.javafaker.Faker;
import helpers.classes.requests.CustomParameter;
import helpers.classes.requests.Player;
import helpers.classes.requests.CreatePlayerRQ;

import java.util.ArrayList;
import java.util.List;

import static helpers.RandomGenerator.GenerateName;
import static helpers.RandomGenerator.GenerateRandomNumber;

public class CreatePlayer {

	public static Player player;
	public static CreatePlayerRQ createPlayerRQ;

	public static String createNewPlayer() throws Exception {
		String playerName = GenerateName();
		try {
			Faker faker = new Faker();
			player = new Player();
			player.setLocale("en-US");
			player.setHouseNumber(35);
			player.setInstantMessenger(386);
			player.setSignupIp("193.169.48.48");
			player.setPostalCode(25);
			player.setGender("M");
			player.setPortalId(1);
			player.setCurrencyId(112);
			player.setMobilePhone(GenerateRandomNumber(10));
			player.setGeoLocCountryCode("en");
			player.setStreet(faker.address().streetName());
			player.setHearAboutUs("internet");
			List<CustomParameter> customParameters = new ArrayList<>();
			customParameters.add(new CustomParameter("creferer val", "creferer"));
			player.setCustomParameters(customParameters);
			player.setPassword("qaNA12345!");
			player.setDateOfBirth("/Date(345427200000)/");
			player.setCountryId(194);
			player.setInstantMessengerType(105);
			player.setSecretAnswer("Answer to security question");
			player.setUserName(playerName);
			player.setFirstName(playerName);
			player.setStateProvince("State and Province");
			player.setTitle("1");
			player.setCity("Maribor");
			player.setEMail(playerName + "@mailinator.com");
			player.setMiddleName(faker.name().firstName());
			player.setDocumentNumber((GenerateRandomNumber(13)));
			player.setProductTypeId(1);
			player.setReceiveNews("true");
			player.setCouponCode("");
			player.setSecretQuestionId(1);
			player.setPhoneNumber((GenerateRandomNumber(10)));
			player.setLastName(faker.name().lastName());
			player.setMobileClient(true);
			createPlayerRQ = new CreatePlayerRQ(player);
		} catch (Exception e) {
			throw new Exception("There was an issue while trying to create a new player. Error message: " + e);
		}
		return playerName;
	}
}
