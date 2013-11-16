package rClone.hsr.ch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

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
}
