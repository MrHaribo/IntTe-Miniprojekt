package rClone.hsr.ch;

import javax.faces.context.FacesContext;

public class Comment extends VoteEntry {
	
	private String text;
	private String commentToCreate;
	private boolean selected;
	
	public void select() {
		FacesContext context = FacesContext.getCurrentInstance();
		Linklist linklist = (Linklist) context.getApplication().evaluateExpressionGet(context, "#{linklist}", Linklist.class);
		
		if (linklist.getIsCommentSelected())
			linklist.getSelectedComment().setSelected(false);
		this.setSelected(true);
		
		linklist.setSelectedComment(this);
	}
	
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
	public boolean getSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
