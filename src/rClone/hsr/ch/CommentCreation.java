package rClone.hsr.ch;

public class CommentCreation {
	
	private Comment selectedComment = null;
	private String commentToCreate;

	public Comment getSelectedComment() {
		return selectedComment;
	}

	public void setSelectedComment(Comment selectedComment) {
		this.selectedComment = selectedComment;
	}
	
	public boolean getIsCommentSelected() {
		return selectedComment != null;
	}

	public String getCommentToCreate() {
		return commentToCreate;
	}

	public void setCommentToCreate(String commentToCreate) {
		this.commentToCreate = commentToCreate;
	}
	
	public void resetSelection() {
		if (getIsCommentSelected())
			getSelectedComment().setSelected(false);
		selectedComment = null;
	}

}
