package rClone.hsr.ch;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Commentlist {

private List<Comment> comments;
	
	public Commentlist() {
		
		comments = new LinkedList<Comment>();
		
		Comment c1 = new Comment();
		c1.setCreationDate(new Date());
		c1.setRating(10);
		c1.setText("So en Chabis");
		
		Comment c2 = new Comment();
		c2.setCreationDate(new Date());
		c2.setRating(15);
		c2.setText("Nei, ich finds super");
		
		Comment c3 = new Comment();
		c3.setCreationDate(new Date());
		c3.setRating(3);
		c3.setText("Das da no eine druuschunnt");
		
		Comment c4 = new Comment();
		c4.setCreationDate(new Date());
		c4.setRating(35);
		c4.setText("Ich finde alli Liechtesteiner komisch");
		
		Comment c5 = new Comment();
		c5.setCreationDate(new Date());
		c5.setRating(22);
		c5.setText("Wieso nur?");
		
		comments.add(c1);
		comments.add(c2);
		comments.add(c3);
		comments.add(c4);
		comments.add(c5);
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
