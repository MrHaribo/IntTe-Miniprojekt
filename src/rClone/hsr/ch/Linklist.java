package rClone.hsr.ch;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Linklist {

	private List<Link> links;
	
	public Linklist() {
		
		links = new LinkedList<Link>();
		
		Link l1 = new Link();
		l1.setTitle("link1");
		l1.setVotes(10);
		l1.setCreationDate(new Date());
		
		Link l2 = new Link();
		l2.setTitle("link2");
		l2.setVotes(103);
		l2.setCreationDate(new Date());
		
		Link l3 = new Link();
		l3.setTitle("link3");
		l3.setVotes(50);
		l3.setCreationDate(new Date());
		
		Link l4 = new Link();
		l4.setTitle("link4");
		l4.setVotes(0);
		l4.setCreationDate(new Date());
		
		Link l5 = new Link();
		l5.setTitle("link5");
		l5.setCreationDate(new Date());
		
		links.add(l1);
		links.add(l2);
		links.add(l3);
		links.add(l4);
		links.add(l5);
	}

	public List<Link> getLinks() {
		Collections.sort(links);
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}
}
