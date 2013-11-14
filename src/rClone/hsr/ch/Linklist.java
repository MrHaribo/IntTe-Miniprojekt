package rClone.hsr.ch;

import java.util.Collections;
import java.util.List;

public class Linklist extends VoteList<Link> {

	public Linklist() {
		
		Link l1 = new Link();
		l1.setTitle("link1");
		l1.setVotes(105);
		
		Link l2 = new Link();
		l2.setTitle("link2");
		l2.setVotes(103);
		
		Link l3 = new Link();
		l3.setTitle("link3");
		l3.setVotes(50);
		
		Link l4 = new Link();
		l4.setTitle("link4");
		l4.setVotes(0);
		
		Link l5 = new Link();
		l5.setTitle("link5");
		
		addEntry(l1);
		addEntry(l2);
		addEntry(l3);
		addEntry(l4);
		addEntry(l5);
	}

	public List<Link> getLinks() {
		Collections.sort(entries, new Link.LinkVoteComparator());
		return entries;
	}

	public void setLinks(List<Link> links) {
		this.entries = links;
	}
}
