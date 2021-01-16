package helpers;

import java.util.Random;

public class RandomGenerator {

	public static String GenerateRandomString(int length) {
		if (length > 20) {
			length = 20;
		}
		String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoprqstuvwxyz";
		Random rnd = new Random();

		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		}
		return sb.toString();
	}

	public static int GenerateRandomNumber(int min, int max) {
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}

	public static String GenerateRandomNumber(int length) {
		StringBuilder phoneNumber = new StringBuilder();
		for (int x = 0; x < length; x++) {
			phoneNumber.append(GenerateRandomNumber(0, 9));
		}
		return phoneNumber.toString();
	}

	public static String GenerateName() {
		StringBuilder sb = new StringBuilder();
		String playerName = "QAWA";
		for (int i = 2; i < 11; i++) {
			if (i % 2 == 0) {
				sb.append(GenerateRandomNumber(1));
			} else {
				sb.append(GenerateRandomString(1));
			}
		}
		return playerName + sb.toString();
	}
}
