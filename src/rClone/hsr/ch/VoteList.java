package rClone.hsr.ch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class VoteList<T extends VoteEntry> {
	
	protected ArrayList<T> entries = new ArrayList<T>();
	
	public T fromId(int id) {
		
		VoteEntry searchEntry = new VoteEntry();
		searchEntry.setId(id);
		int searchIdx = Collections.binarySearch(entries,  searchEntry, new VoteEntry.LinkIdComparator());
		return entries.get(searchIdx);
		
		/*
		for (T e : entries)
			if (e.getId() == id)
				return e;
		return null;
		*/
	}
	
	public T fromIdx(int idx) {
		return entries.get(idx);
	}
	
	public void addEntry(T entry) {
		entry.setId(entries.size());
		entry.setCreationDate(new Date());
		this.entries.add(entry);
	}
	
	public int getSize() {
		return entries.size();
	}
	
	public ArrayList<T> getEntries() {
		return entries;
	}
	
	public List<VoteEntry> getPreorderList() throws IOException {
		ArrayList<VoteEntry> tmp = new ArrayList<VoteEntry>();
		for (VoteEntry entry : entries) {
			traverseTree(tmp, entry);
		}
		return tmp;
	}
	
	private void traverseTree(List<VoteEntry> returnList, VoteEntry root) {
		returnList.add(root);
		for (VoteEntry entry : root.getChildren().getEntries()) {
			traverseTree(returnList, entry);  
		}
	}
}
