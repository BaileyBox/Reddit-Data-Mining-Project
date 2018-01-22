package redditDataMining;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RedditDataMiningAPI {

	public static void main(String[] args) {
		runAPI();
	}
	
	public static void runAPI() {
		Movies movieList = new Movies();
		ArrayList<Movie> movies = movieList.getMovies();
		JSONArray jsonArray = null;
		for(int i = 0; i < movies.size(); i++) {
			try {
				Movie movie = movies.get(i);
				String searchTitle = movie.getTitle().replaceAll(" ", "+").toLowerCase();
				// Store below string as a constant
				jsonArray = RedditJSONParser.readJsonFromUrl("https://www.reddit.com/r/movies/search.json?q=flair%3ATrailers+"+searchTitle+"&sort=relevance&t=all");
				movie.setPosts(createPosts(movie, jsonArray));
				getPostComments(movie.getPosts());
//				printPosts(movie.getPosts());
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		WriteToCSV.writeCsvFile(movies);
	}
	
	public static void getPostComments(ArrayList<Post> posts) {
		JSONArray jsonArray = null;
		JSONArray children = null;
		JSONObject data;
		ArrayList<Comment> comments = null;
		Comment comment;
		String body;
		int score;
		Post post;
		
		for(int i = 0; i < posts.size(); i++) {
			try {
				comments = new ArrayList<Comment>();
				post = posts.get(i);
				jsonArray = RedditJSONParser.readJsonFromUrl("https://www.reddit.com" + post.getPermalink() + ".json");
				children = jsonArray.getJSONObject(1).getJSONObject("data").getJSONArray("children");
				for(int j = 0; j < children.length()-1; j++) {
					data = children.getJSONObject(j).getJSONObject("data");
					body = data.getString("body").replace('\n', ' ').replace(',', ' ');
					score = data.getInt("score");
					comment = new Comment(body, score);
					comments.add(comment);
				}
				post.setComments(comments);
			} catch(Exception e) {
				e.printStackTrace();
			}	
		}
	}
	
	public static ArrayList<Post> createPosts(Movie movie, JSONArray jsonArray) {
		ArrayList<Post> results = new ArrayList<Post>();
		JSONObject data;
		Post post;
		String title, selftext, permalink;
		ArrayList<Comment> comments;
		int score;
		
		for(int i = 0; i < jsonArray.length(); i++) {
			try {
				data = jsonArray.getJSONObject(i).getJSONObject("data");
				title = data.getString("title").replace(',', ' ');
				selftext = data.getString("selftext");
				permalink = data.getString("permalink");
				comments = null;
				score = data.getInt("score");
				post = new Post(title, selftext, permalink, comments, score);
				results.add(post);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		
		return results;
	}
	
	public static void printPosts(ArrayList<Post> posts) {
		Post post;
		ArrayList<Comment> comments;
		for(int i = 0; i < posts.size(); i++) {
			post = posts.get(i);
			comments = post.getComments();
			System.out.println(post.toString());
			System.out.println("Comments:");
			for(int j = 0; j < comments.size(); j++) {
				System.out.println(comments.get(j).toString() + "\n");
			}
		}
	}
	
	public static void printResults(JSONArray jsonArray) {
		for(int i = 0; i < jsonArray.length(); i++) {
			try {
				System.out.println(jsonArray.getJSONObject(i).getJSONObject("data"));
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
	}
}
