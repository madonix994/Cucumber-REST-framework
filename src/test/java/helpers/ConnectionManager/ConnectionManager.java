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


public class ConnectionManager {

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
			emptyMessageStorage();
			OkHttpClient client = new OkHttpClient().newBuilder().build();
			String url = "http://" + env + "-apa.gaming.lan/PlayerPortalFacade/PlayerService.svc/Player";
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

	private static void emptyMessageStorage() throws IOException {
		File directory = new File("messageStorage");
		FileUtils.cleanDirectory(directory);
	}

	private static void saveRequestBody(Request request) throws Exception {
		try {
			Request copy = request.newBuilder().build();
			Buffer buffer = new Buffer();
			Objects.requireNonNull(copy.body()).writeTo(buffer);
			String requestBody = buffer.readUtf8();
			FileWriter file = new FileWriter("messageStorage/Request.json");
			file.write(requestBody);
			file.close();
		} catch (Exception e) {
			throw new Exception("There was an issue while trying to save the file. Error message: " + e);
		}
	}

	private static String saveResponseBody(Response response) throws Exception {
		try {
			String responseBody = Objects.requireNonNull(response.body()).string();
			FileWriter file = new FileWriter("messageStorage/Response.json");
			file.write(responseBody);
			file.close();
			return responseBody;
		} catch (Exception e) {
			throw new Exception("There was an issue while trying to save the file. Error message: " + e);
		}
	}

	public static RequestBody generateRequest(Object object) {
		MediaType mediaType = MediaType.parse("application/json");
		Gson gson = new GsonBuilder().create();
		String jsonPlayer = gson.toJson(object);

		String jsonRequest = "{\n" +
				"\"deviceFingerprint\": \"iovation device fingerprint\",\n" +
				"\"trackingSource\": {\n" +
				"\"CustomFields\": [\n" +
				"{\n" +
				"\"Value\": \"Broad\",\n" +
				"\"Key\": \"MatchType\"\n" +
				"}\n" +
				"],\n" +
				"\"Creative\": \"Advert\",\n" +
				"\"Content\": \"Hulk slot\",\n" +
				"\"Btag\": \"btag value\",\n" +
				"\"MarketingChannel\": \"PPC\",\n" +
				"\"CampaignName\": \"Add group (slots)\",\n" +
				"\"MarketingSource\": \"Google\"\n" +
				"},\n" +
				"\"player\":" +
//				jsonPlayer + // TODO uncomment to work
				"}";

		return RequestBody.create(mediaType, jsonRequest);
	}


}
