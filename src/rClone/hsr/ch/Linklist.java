package rClone.hsr.ch;

import java.util.LinkedList;
import java.util.List;

public class Linklist {

	private List<Link> links;
	
	public Linklist() {
		
		links = new LinkedList<Link>();
		
		Link l1 = new Link();
		Link l2 = new Link();
		Link l3 = new Link();
		Link l4 = new Link();
		Link l5 = new Link();
		
		l1.setTitle("link1");
		l2.setTitle("link2");
		l3.setTitle("link3");
		l4.setTitle("link4");
		l5.setTitle("link5");
		
		links.add(l1);
		links.add(l2);
		links.add(l3);
		links.add(l4);
		links.add(l5);
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}
}
