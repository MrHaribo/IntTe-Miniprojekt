package rClone.hsr.ch;

import java.text.SimpleDateFormat;
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
	private int votes=0;
	Date creationDate;
	private int level;
	
	private VoteEntry parent;
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
	
	public void addChildEntry(VoteEntry child) {
		child.setParent(this);
		child.setLevel(getLevel()+1);
		children.addEntry(child);
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
	public String getCreationDate() {
		SimpleDateFormat dt1 = new SimpleDateFormat("dd.MM yyyy");
		
		return dt1.format(creationDate);
	}
	public void setCreationDate(Date crationDate) {
		this.creationDate = crationDate;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public VoteList<VoteEntry> getChildren() {
		return children;
	}
	public void setChildren(VoteList<VoteEntry> children) {
		this.children = children;
	}
	public VoteEntry getParent() {
		return parent;
	}
	public void setParent(VoteEntry parent) {
		this.parent = parent;
	}
	
}
