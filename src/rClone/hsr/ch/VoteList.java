package rClone.hsr.ch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.faces.context.FacesContext;

public class VoteList<T extends VoteEntry> {
	
	protected ArrayList<T> entries = new ArrayList<T>();
	
	public T fromId(int id) {
		
		VoteEntry searchEntry = new VoteEntry();
		searchEntry.setId(id);
		int searchIdx = Collections.binarySearch(entries,  searchEntry, new VoteEntry.LinkIdComparator());
		return entries.get(searchIdx);
	}
	
	public T fromIdx(int idx) {
		return entries.get(idx);
	}
	
	public void addEntry(T entry, String username, Date date) {
		entry.setId(entries.size());
		entry.setCreationDate(date);
		entry.setCreator(username);
		
		this.entries.add(entry);
	}
	
	public void addEntry(T entry) {
		entry.setId(entries.size());
		entry.setCreationDate(new Date());
		
		FacesContext context = FacesContext.getCurrentInstance();
		String username = (String) context.getApplication().
				evaluateExpressionGet(context, "#{user.username}", String.class);
		entry.setCreator(username);
		
		this.entries.add(entry);
	}
	
	public int getNumEntries() {
		return entries.size();
	}
	
	public ArrayList<T> getEntries() {
		return entries;
	}
	
	protected void traverseTree(List<VoteEntry> returnList, VoteEntry root) {
		if (root.getClass() == Comment.class)
			returnList.add(root);
		
		List<VoteEntry> tmp = new ArrayList<VoteEntry>(root.getEntries());
		Collections.sort(tmp, new Link.LinkVoteComparator());

		for (VoteEntry entry : tmp) {
			traverseTree(returnList, entry);  
		}
	}
}
