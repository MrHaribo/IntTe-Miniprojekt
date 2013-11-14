package rClone.hsr.ch;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class VoteList<T extends VoteEntry> {
	
	private int entryCount = 100;
	protected List<T> entries = new LinkedList<T>();
	
	public T getLinkFromId(int id) {
		VoteEntry searchEntry = new VoteEntry();
		searchEntry.setId(id);
		int searchIdx = Collections.binarySearch(entries,  searchEntry, new VoteEntry.LinkIdComparator());
		return searchIdx < -1 ? null : entries.get(searchIdx);
	}
	
	public void addEntry(T entry) {
		entry.setId(++entryCount);
		entry.setCreationDate(new Date());
		this.entries.add(entry);
	}
}
