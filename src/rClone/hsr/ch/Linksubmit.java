package rClone.hsr.ch;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedProperty;

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
		/*
		
		newLink.setCrationDate(new Date());
		newLink.setRating(0);
		newLink.setTitle(title);
		newLink.setUrl(url);
		
		
		*/
		
		Link newLink = new Link();
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
