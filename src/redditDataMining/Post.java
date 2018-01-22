package redditDataMining;

import java.util.ArrayList;

public class Post {

	private String title;
	private String selftext;
	private String permalink;
	private ArrayList<Comment> comments;
	private int score;
	
	public Post() {
		title = "";
		selftext = "";
		permalink = "";
		comments = null;
		score = 0;
	}
	
	public Post(String title, String selftext, String permalink, ArrayList<Comment> comments, int score) {
		this.title = title;
		this.selftext = selftext;
		this.permalink = permalink;
		this.comments = comments;
		this.score = score;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getText() {
		return selftext;
	}
	
	public void setText(String selftext) {
		this.selftext = selftext;
	}
	
	public String getPermalink() {
		return permalink;
	}
	
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
	
	public ArrayList<Comment> getComments() {
		return comments;
	}
	
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "Title: " + title +"\nSelftext: " + selftext +"\nPermalink: " + permalink + "\nScore: " + score;
	}
}
