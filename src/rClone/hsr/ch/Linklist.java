package rClone.hsr.ch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Linklist extends VoteList<Link> {
	
	private Link selectedLink;
	
	public Linklist() {
		
		Link l1 = new Link();
		l1.setTitle("Google");
		l1.setUrl("http://www.google.ch");
		l1.setVotes(105);
		l1.setCreator("Donald");
		
		Link l2 = new Link();
		l2.setTitle("HSR");
		l2.setUrl("http://www.hsr.ch");
		l2.setVotes(103);
		l2.setCreator("Superman");
		
		Link l3 = new Link();
		l3.setTitle("World of Games");
		l3.setUrl("http://www.wog.ch");
		l3.setVotes(50);
		l3.setCreator("Bert");
		
		Link l4 = new Link();
		l4.setTitle("4Players");
		l4.setUrl("http://www.4players.de");
		l4.setVotes(0);
		l4.setCreator("HSR Admin");
		
		Link l5 = new Link();
		l5.setTitle("20 Min");
		l5.setUrl("http://www.20min.ch");
		l5.setCreator("Donald");
		
		Comment c1 = new Comment();
		c1.setVotes(10);
		c1.setText("So en Chabis");
		c1.setCreator("Rudi");
		
		Comment c2 = new Comment();
		c2.setVotes(15);
		c2.setText("Nei, ich finds super");
		c2.setCreator("Ueli");
		
		Comment c3 = new Comment();
		c3.setVotes(3);
		c3.setText("Das da no eine druuschunnt");
		c3.setCreator("Ernst");
		
		Comment c4 = new Comment();
		c4.setVotes(35);
		c4.setText("Ich finde alli Liechtesteiner komisch");
		c4.setCreator("Hans");
		
		Comment c5 = new Comment();
		c5.setVotes(22);
		c5.setText("Wieso nur?");
		c5.setCreator("Urs");
		
		l1.addEntry(c1);
		l1.addEntry(c2);
		c2.addEntry(c3);
		l2.addEntry(c4);
		c4.addEntry(c5);

		c1.setLevel(1);
		c2.setLevel(1);
		c3.setLevel(2);
		c4.setLevel(1);
		c5.setLevel(2);
		
		
		addEntry(l1);
		addEntry(l2);
		addEntry(l3);
		addEntry(l4);
		addEntry(l5);
	}

	public List<Link> getLinks() {
		List<Link> tmp = new ArrayList<Link>(entries);
		Collections.sort(tmp, new Link.LinkVoteComparator());
		return tmp;
	}

	public void setLinks(ArrayList<Link> links) {
		this.entries = links;
	}

	public Link getSelectedLink() {
		return selectedLink;
	}

	public void setSelectedLink(Link selectedLink) {
		this.selectedLink = selectedLink;
	}
}
