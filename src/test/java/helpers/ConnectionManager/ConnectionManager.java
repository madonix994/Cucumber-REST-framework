package helpers.ConnectionManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.*;
import okio.Buffer;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

import static steps.StepsHooks.scenarioCounter;
import static steps.StepsHooks.scenarioName;


public class ConnectionManager {

	public static int Counter;
	public static String currentRequest = "";

	public static void initCounter() {
		Counter = 1;
	}

	public static void pingEnvironment(String env) throws Exception {
		int counter = 1;
		try {
			while (counter > 0) {
				System.out.println("Pinging the " + env.toUpperCase() + " env.");

				OkHttpClient client = new OkHttpClient().newBuilder()
						.build();
				Request request = new Request.Builder()
						.url("http://" + env + "-apa.gaming.lan")
						.method("GET", null)
						.build();
				Response response = client.newCall(request).execute();
				Assert.assertEquals("Expected response code is 403. Actual response code is " + response.code(), response.code(), 403);
				counter--;

				System.out.println("Env has status " + response.code() + " which is expected.");
			}
		} catch (Exception e) {
			throw new Exception("There was an issue while trying to ping the env. Error message: " + e);
		}
	}

	public static String sendRequest(String env, RequestBody requestBody) throws Exception {
		try {
			OkHttpClient client = new OkHttpClient().newBuilder().build();
			String url = "http://" + env + "-apa.gaming.lan" + getCurrentRequestURl();
			Request request = new Request.Builder()
					.url(url)
					.method("POST", requestBody)
					.addHeader("Content-Type", "application/json")
					.build();

			saveRequestBody(request);
			Response response = client.newCall(request).execute();
			return saveResponseBody(response);
		} catch (Exception e) {
			throw new Exception("There was an issue while trying to send the request. Error message: " + e);
		}
	}

	private static String getCurrentRequestURl() throws Exception {
		switch (currentRequest) {
			case "":
				return "";
			case "CreatePlayer":
				return "/PlayerPortalFacade/PlayerService.svc/Player";
			case "PlayerLogin":
				return "/PlayerPortalFacade/PlayerService.svc/Login";
			default:
				throw new Exception("There is an issue with current request: " + currentRequest);
		}
	}

	public static void emptyMessageStorage() throws IOException {
		File directory = new File("messageStorage");
		FileUtils.cleanDirectory(directory);
	}

	private static void saveRequestBody(Request request) throws Exception {
		try {
			Request copy = request.newBuilder().build();
			Buffer buffer = new Buffer();
			Objects.requireNonNull(copy.body()).writeTo(buffer);
			String requestBody = buffer.readUtf8();
			File file = new File("messageStorage/" + scenarioCounter + "_" + scenarioName + "/" + Counter + "_" + currentRequest + "RQ.json");
			file.getParentFile().mkdirs();
			FileWriter fileWriter = new FileWriter(file);
			Counter++;
			fileWriter.write(requestBody);
			fileWriter.close();
		} catch (Exception e) {
			throw new Exception("There was an issue while trying to save the file. Error message: " + e);
		}
	}

	private static String saveResponseBody(Response response) throws Exception {
		try {
			String responseBody = Objects.requireNonNull(response.body()).string();
			File file;
			if (responseBody.contains("html")) {
				file = new File("messageStorage/" + scenarioCounter + "_" + scenarioName + "/" + Counter + "_" + currentRequest + "RS.html");
			} else {
				file = new File("messageStorage/" + scenarioCounter + "_" + scenarioName + "/" + Counter + "_" + currentRequest + "RS.json");
			}
			FileWriter fileWriter = new FileWriter(file);
			Counter++;
			fileWriter.write(responseBody);
			fileWriter.close();
			return responseBody;
		} catch (Exception e) {
			throw new Exception("There was an issue while trying to save the file. Error message: " + e);
		}
	}

	@SuppressWarnings("deprecation")
	public static RequestBody generateRequest(Object object) {
		MediaType mediaType = MediaType.parse("application/json");
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonRequest = gson.toJson(object);
		return RequestBody.create(mediaType, jsonRequest);
	}
}
