package rClone.hsr.ch;

import java.util.Comparator;
import java.util.Date;

public class VoteEntry {
	
	public static class LinkVoteComparator implements Comparator<VoteEntry> {  
		@Override
		public int compare(VoteEntry arg0, VoteEntry arg1) {
			return arg1.getVotes() - arg0.getVotes();
		}  
	}

	public static class LinkIdComparator implements Comparator<VoteEntry> {  
		@Override
		public int compare(VoteEntry arg0, VoteEntry arg1) {
			return arg0.getId() - arg1.getId();
		}  
	} 
	
	private int id;
	private int votes;
	Date creationDate;
	
	private VoteList<VoteEntry> children = new VoteList<VoteEntry>();
	
	public String voteUp() {
		//System.out.println("link voted up");
		this.votes++;
		return "link voted up";
	}
	
	public String voteDown() {
		//System.out.println("link voted down");
		if (this.votes > 0)
			this.votes--;
		return "link voted down";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public VoteList<VoteEntry> getChildren() {
		return children;
	}
	public void setChildren(VoteList<VoteEntry> children) {
		this.children = children;
	}
}
