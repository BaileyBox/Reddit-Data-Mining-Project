package redditDataMining;

import java.util.ArrayList;

public class Movie {
	
	private String title;
	private ArrayList<Post> posts;
	
	public Movie() {
		title = "";
		posts = new ArrayList<Post>();
	}
	
	public Movie(String title, ArrayList<Post> posts) {
		this.title = title;
		this.posts = posts;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public ArrayList<Post> getPosts() {
		return posts;
	}
	
	public void addPost(Post post) {
		posts.add(post);
	}
	
	public void removePost(Post post) {
		posts.remove(post);
	}
	
	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}
}