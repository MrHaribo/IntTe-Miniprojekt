package rClone.hsr.ch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Link {
	
	public static class LinkVoteComparator implements Comparator<Link> {  
		@Override
		public int compare(Link arg0, Link arg1) {
			return arg1.getVotes() - arg0.getVotes();
		}  
	}
	
	//temporary not used... would be nicer solution, but hard to understand in java
	public static class LinkIdComparator implements Comparator<Link> {  
		@Override
		public int compare(Link arg0, Link arg1) {
			return arg0.getId() - arg1.getId();
		}  
	}  

	private int id;
	private String title;
	private String url;
	int votes;
	Date creationDate;
	List<Comment> comments = new ArrayList<Comment>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
