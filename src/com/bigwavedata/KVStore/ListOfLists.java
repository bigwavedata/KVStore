package com.bigwavedata.KVStore;

import java.util.ArrayList;
import java.util.List;

public class ListOfLists {
	
	List<KVList> lists;
	FileSystem fs;
	ListOfLists() {
		lists = new ArrayList<KVList>();
		fs = new FileWriter();
	}	
	public void addList(KVList newList) {
		lists.add(newList);
	}
	public KVList getList(String name) {
		for(KVList list : lists) {
			if(list.getName() == name) {
				return list;
			}
		}
		return null;
	}
}
