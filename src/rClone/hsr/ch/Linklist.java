package rClone.hsr.ch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Linklist extends VoteList<Link> {
	
	private Comment selectedComment = null;

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
		
		Comment c1 = new Comment();
		c1.setVotes(10);
		c1.setText("So en Chabis");
		
		Comment c2 = new Comment();
		c2.setVotes(15);
		c2.setText("Nei, ich finds super");
		
		Comment c3 = new Comment();
		c3.setVotes(3);
		c3.setText("Das da no eine druuschunnt");
		
		Comment c4 = new Comment();
		c4.setVotes(35);
		c4.setText("Ich finde alli Liechtesteiner komisch");
		
		Comment c5 = new Comment();
		c5.setVotes(22);
		c5.setText("Wieso nur?");
		
		l1.getChildren().addEntry(c1);
		l1.getChildren().addEntry(c2);
		c2.getChildren().addEntry(c3);
		l2.getChildren().addEntry(c4);
		c4.getChildren().addEntry(c5);

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
	
	//TODO: maybe relocate this code (its here because its app scope)---

	public Comment getSelectedComment() {
		return selectedComment;
	}

	public void setSelectedComment(Comment selectedComment) {
		this.selectedComment = selectedComment;
	}
	
	public boolean getIsCommentSelected() {
		return selectedComment != null;
	}
	
	// END todo: maybe relocate this code---
}
