package redditDataMining;

public class Comment {

	private String comment;
	private int score;
	
	public Comment() {
		comment = "";
		score = 0;
	}
	
	public Comment(String comment, int score) {
		this.comment = comment;
		this.score = score;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "\tComment: " + comment + "\n\tScore: " + score;
	}
}
