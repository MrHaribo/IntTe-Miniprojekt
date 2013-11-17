package rClone.hsr.ch;

public class Comment extends VoteEntry {
	
	private String text;
	private String commentToCreate;
	
	public void createChildComment() {
		System.out.println("creadted child comment for: " + text);
		
		Comment newComment = new Comment();
		newComment.setText(commentToCreate);
		newComment.setParent(this);
		getChildren().addEntry(newComment);	
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCommentToCreate() {
		return commentToCreate;
	}
	public void setCommentToCreate(String commentToCreate) {
		this.commentToCreate = commentToCreate;
	}	
	
}
