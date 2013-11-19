package rClone.hsr.ch;

import javax.faces.context.FacesContext;

public class Comment extends VoteEntry {
	
	private String text;
	private boolean selected;
	
	public String select() {
		FacesContext context = FacesContext.getCurrentInstance();
		CommentCreation commentSelection = (CommentCreation) context.getApplication().
				evaluateExpressionGet(context, "#{commentCreation}", CommentCreation.class);
		commentSelection.selectVoteEntry(this);
		this.setSelected(true);
		
		return "commentsubmit.xhtml";
	}
	
	public String createChild() {
		FacesContext context = FacesContext.getCurrentInstance();
		CommentCreation commentCreation = (CommentCreation) context.getApplication().
			evaluateExpressionGet(context, "#{commentCreation}", CommentCreation.class);
		
		Comment newComment = new Comment();
		newComment.setText(commentCreation.getCommentToCreate());		
		addChildEntry(newComment);
		return "commentsubmit.xhtml";
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
