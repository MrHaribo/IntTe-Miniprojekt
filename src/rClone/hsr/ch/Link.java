package rClone.hsr.ch;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Link implements Comparable<Link> {

	private String title;
	private String url;
	int votes;
	Date creationDate;
	List<Comment> comments = new ArrayList<Comment>();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date crationDate) {
		this.creationDate = crationDate;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	public int getNumComments() {
		return comments.size();
	}
	
	@Override
	public int compareTo(Link arg0) {
		return arg0.getVotes() - votes;
	}
	
	public String voteUp() {
		System.out.println("link voted up");
		this.votes++;
		return "link voted up";
	}
	
	public String voteDown() {
		System.out.println("link voted down");
		if (this.votes > 0)
			this.votes--;
		return "link voted down";
	}
}
