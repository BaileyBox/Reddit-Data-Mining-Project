package redditDataMining;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToCSV {
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	//CSV file header
	private static final String FILE_HEADER = "MovieTitle,postTitle,comment,score";

	public static void writeCsvFile(ArrayList<Movie> movies) {
		
		FileWriter fileWriter = null;
		String movieTitle;
		String postTitle;
		ArrayList<Post> posts;
		ArrayList<Comment> comments;

		try {
			//Write the CSV file header
			fileWriter = new FileWriter("RedditData.csv");
			fileWriter.append(FILE_HEADER.toString());

			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			//Write a new movie object list to the CSV file
			for (Movie movie : movies) {
				movieTitle = movie.getTitle();
				posts = movie.getPosts();
				for(Post post : posts) {
					postTitle = post.getTitle();
					comments = post.getComments();
					for(Comment comment : comments) {
						fileWriter.append(movieTitle);
						fileWriter.append(COMMA_DELIMITER);
						fileWriter.append(postTitle);
						fileWriter.append(COMMA_DELIMITER);
						fileWriter.append(comment.getComment());
						fileWriter.append(COMMA_DELIMITER);
						fileWriter.append(String.valueOf(comment.getScore()));
						fileWriter.append(NEW_LINE_SEPARATOR);
					}
				}
			}
			System.out.println("CSV file was created successfully!");
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter!");
				e.printStackTrace();
			}
		}
	}

}
