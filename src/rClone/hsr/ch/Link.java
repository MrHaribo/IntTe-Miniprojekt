package rClone.hsr.ch;

import javax.faces.context.FacesContext;

public class Link extends VoteEntry {
	
	private Linklist linklist;
	
	private String title;
	private String url="index.html";
	
	public String select() {
		FacesContext context = FacesContext.getCurrentInstance();
		Linklist linklist = (Linklist) context.getApplication().
				evaluateExpressionGet(context, "#{linklist}", Linklist.class);
		linklist.setSelectedLink(this);
		return "commentsubmit.xhtml";
	}

	public String createLink() {
		setLevel(0);
		linklist.addEntry(this);
		return "index.xhtml";
	}
	public void createChild() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		CommentCreation commentCreation = (CommentCreation) context.getApplication().
			evaluateExpressionGet(context, "#{commentCreation}", CommentCreation.class);
		
		Comment newComment = new Comment();
		newComment.setText(commentCreation.getCommentToCreate());
		newComment.setLevel(1);
		addChildEntry(newComment);
	}
	
	public Linklist getLinklist() {
		return linklist;
	}
	public void setLinklist(Linklist linklist) {
		this.linklist = linklist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
