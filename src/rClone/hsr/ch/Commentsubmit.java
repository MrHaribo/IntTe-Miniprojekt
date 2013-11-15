package rClone.hsr.ch;

import java.util.Date;
import java.util.List;

public class Commentsubmit {
	
	private String text;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String addComment(){
		
		Comment newComment = new Comment();
		newComment.setCreationDate(new Date());
		newComment.setText(text);
		comments.add(newComment);

		return "commentsubmit";
	}
	
	private List<Comment> comments;

	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}
