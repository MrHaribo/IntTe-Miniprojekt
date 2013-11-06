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
		Link newLink = new Link();
		newLink.setCrationDate(new Date());
		newLink.setRating(0);
		newLink.setTitle(title);
		newLink.setUrl(url);
		
		links.add(newLink);
		*/
		return "linksubmit";
	}
	
	@ManagedProperty(value = "#{linklist.links}")
	List<Link> links;
	
}
