package rClone.hsr.ch;

public class Link extends VoteEntry {
	
	private Linklist linklist;
	
	private String title;
	private String url;

	public String createLink() {
		linklist.addEntry(this);
		return "linklist.xhtml";
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
