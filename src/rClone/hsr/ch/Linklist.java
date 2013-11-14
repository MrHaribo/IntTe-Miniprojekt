package rClone.hsr.ch;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Linklist {

	private int linkCount = 100;
	
	private List<Link> links;
	
	public Linklist() {
		
		links = new LinkedList<Link>();
		
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
		
		addLink(l1);
		addLink(l2);
		addLink(l3);
		addLink(l4);
		addLink(l5);
	}

	public List<Link> getLinks() {
		Collections.sort(links, new Link.LinkVoteComparator());
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public Link getLinkFromId(int id) {
		Link searchLink = new Link();
		searchLink.setId(id);
		int searchIdx = Collections.binarySearch(links,  searchLink, new Link.LinkIdComparator());
		return searchIdx == -1 ? null : links.get(searchIdx);
	}
	
	public void addLink(Link link) {
		link.setId(++linkCount);
		link.setCreationDate(new Date());
		this.links.add(link);
	}
}
