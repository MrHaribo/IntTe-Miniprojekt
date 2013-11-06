package rClone.hsr.ch;

import java.util.Date;
import java.util.List;

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
		newLink.setCreationDate(new Date());
		newLink.setVotes(0);
		newLink.setTitle(title);
		newLink.setUrl(url);
		links.add(newLink);

		return "linksubmit";
	}
	
	private List<Link> links;

	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
}
