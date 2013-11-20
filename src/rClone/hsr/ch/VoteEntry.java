package rClone.hsr.ch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class VoteEntry extends VoteList<VoteEntry> {
	
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
	private int votes=0;
	private Date creationDate;
	private String creator;
	private int level;
	
	private VoteEntry parent;
	
	public String voteUp() {
		this.votes++;
		return "link voted up";
	}
	
	public String voteDown() {
		this.votes--;
		return "link voted down";
	}
	
	public void addChildEntry(VoteEntry child) {
		child.setParent(this);
		child.setLevel(getLevel()+1);		
		addEntry(child);
	}
	
	public List<VoteEntry> getPreorderList() throws IOException {
		ArrayList<VoteEntry> tmp = new ArrayList<VoteEntry>();
		traverseTree(tmp, this);
		return tmp;
	}
	
	public int getHoursAgo() {
		Date now = new Date();
		long diff = now.getTime() - creationDate.getTime();
		diff = (int) diff / (60 * 60 * 1000);
		if (diff < 1)
			return 1;
		else return (int) diff;
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
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public VoteEntry getParent() {
		return parent;
	}
	public void setParent(VoteEntry parent) {
		this.parent = parent;
	}
}
