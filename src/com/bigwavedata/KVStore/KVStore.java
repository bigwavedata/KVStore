package com.bigwavedata.KVStore;

// -------------------------------------------------------------------
// KVStore server.  
// Handles message processing with the JRuby shell and kicks off 
// threads to process other necessary work
// -------------------------------------------------------------------
public class KVStore {
	ListOfLists lists;
	
	// Name of process
	public static final String KVStore = "kvstore";
	
	KVStore() {
		// Empty lists
		lists = new ListOfLists();
		
	}
	
	public void createList(String listName) {
		createList(listName, 10);
	}
	
	public void createList(String listName, int defaultSize) {
		// Create a list of defaultSize and add to lists
		KVList newList = new KVList(listName, defaultSize);
		lists.addList(newList);
	}
		
	public static void main(String[] Args) {
		System.out.println("Starting KV Store");
		KVStore newStore = new KVStore();
		
		// All work will be on this newStore
		
	}
}
