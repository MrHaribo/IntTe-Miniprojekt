package rClone.hsr.ch;

public class CommentCreation {
	
	private VoteEntry selectedEntry = null;
	private String commentToCreate;

	public void selectVoteEntry(VoteEntry entry) {
		if (getIsCommentSelected())
			((Comment)getSelectedEntry()).setSelected(false);
		setSelectedEntry(entry);
	}
	
	public boolean getIsCommentSelected() {
		return selectedEntry != null && selectedEntry.getClass() == Comment.class;
	}

	public VoteEntry getSelectedEntry() {
		return selectedEntry;
	}

	public void setSelectedEntry(VoteEntry selectedEntry) {
		this.selectedEntry = selectedEntry;
	}

	public String getCommentToCreate() {
		return commentToCreate;
	}

	public void setCommentToCreate(String commentToCreate) {
		this.commentToCreate = commentToCreate;
	}
}
