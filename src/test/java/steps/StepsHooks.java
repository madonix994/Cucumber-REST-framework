package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static helpers.ConnectionManager.ConnectionManager.emptyMessageStorage;
import static helpers.ConnectionManager.ConnectionManager.initCounter;
import static helpers.RandomGenerator.GenerateRandomString;

public class StepsHooks {

	public static String featureName = "";
	public static String scenarioName = "";
	public static int scenarioCounter = 0;
	public static String buildCode = "";

	/**
	 * Method that runs before each scenario
	 *
	 * @param scenario
	 * @throws IOException
	 */
	@Before
	public void beforeScenario(Scenario scenario) throws IOException {
		if (StringUtils.isEmpty(buildCode)) {
			emptyMessageStorage();
			buildCode = GenerateRandomString(20);
		}
		initCounter();
		scenarioName = scenario.getName();
		String rawFeatureName = scenario.getId().split(";")[0].replace("-", " ");
		featureName = featureName + rawFeatureName.substring(0, 1).toUpperCase() + rawFeatureName.substring(1);
		scenarioCounter++;
		System.out.println("\n ------------------ Scenario: " + scenario.getName() + " was started ------------------\n\n");
	}

	/**
	 * Method that runs after each scenario
	 */
	@After
	public void afterScenario(Scenario scenario) throws Exception {
		try {
			File folder = new File("messageStorage/" + scenarioCounter + "_" + scenarioName + "/");
			File[] fileList = folder.listFiles();
			if (fileList != null) {
				for (File file : fileList) {
					if (file.toPath().toString().contains(".json")) {
						scenario.embed(Files.readAllBytes(file.toPath()), "application/json");
					} else if (file.toPath().toString().contains(".html")) {
						scenario.embed(Files.readAllBytes(file.toPath()), "text/html");
					}
				}
			}
		} catch (Exception e) {
			throw new Exception("There was an issue while trying to embed file." + e);
		} finally {
			System.out.println("\n -------- Scenario: " + scenario.getName() + " is completed. Status: " + scenario.getStatus().toUpperCase() + " --------\n\n");
		}
	}
}
