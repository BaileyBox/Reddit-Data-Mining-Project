package redditDataMining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

import org.json.*;


public class RedditJSONParser {

	public static final String USER_AGENT = "java:redditdataminingproject:1.8.0_121 (by /u/BaileyBox)";
	JSONObject json;

	public RedditJSONParser() {
		json = new JSONObject();
	}

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	public static JSONArray readJsonFromUrl(String src) throws IOException, JSONException {
		URLConnection connection = (new URL(src)).openConnection();
		
		try {
			Thread.sleep(2000);  //Delay to comply with rate limiting
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		connection.setRequestProperty("User-Agent", USER_AGENT);

		InputStream is = connection.getInputStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONArray jsonArray = null;
			if(jsonText.charAt(0) == '{') {
				JSONObject json = new JSONObject(jsonText);
				jsonArray = json.getJSONObject("data").getJSONArray("children");
			} else if(jsonText.charAt(0) == '[') {
				JSONArray jsonObjectArray = new JSONArray(jsonText);
				jsonArray = jsonObjectArray;
			}
			return jsonArray;
		} finally {
			is.close();
		}
	}
}
