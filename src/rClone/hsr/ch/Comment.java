package rClone.hsr.ch;

import javax.faces.context.FacesContext;

public class Comment extends VoteEntry {
	
	private String text;
	private boolean selected;
	
	public void select() {
		FacesContext context = FacesContext.getCurrentInstance();
		CommentCreation commentSelection = (CommentCreation) context.getApplication().
				evaluateExpressionGet(context, "#{commentCreation}", CommentCreation.class);
		
		if (commentSelection.getIsCommentSelected())
			commentSelection.getSelectedComment().setSelected(false);
		this.setSelected(true);
		
		commentSelection.setSelectedComment(this);
	}
	
	public void createChild() {
		FacesContext context = FacesContext.getCurrentInstance();
		CommentCreation commentCreation = (CommentCreation) context.getApplication().
			evaluateExpressionGet(context, "#{commentCreation}", CommentCreation.class);
		
		Comment newComment = new Comment();
		newComment.setText(commentCreation.getCommentToCreate());
		addChildEntry(newComment);
	}
	
	public int getMargin() {
		return getLevel() * 30;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean getSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
