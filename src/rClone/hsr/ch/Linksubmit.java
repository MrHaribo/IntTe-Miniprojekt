package rClone.hsr.ch;

public class Linksubmit {

	private String title;
	private String url;
	
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
	public String addLink(){

		Link newLink = new Link();
		newLink.setVotes(0);
		newLink.setTitle(title);
		newLink.setUrl(url);
		linklist.addLink(newLink);

		return "link_submit";
	}
	
	private Linklist linklist;

	public Linklist getLinklist() {
		return linklist;
	}
	public void setLinklist(Linklist linklist) {
		this.linklist = linklist;
	}
}
