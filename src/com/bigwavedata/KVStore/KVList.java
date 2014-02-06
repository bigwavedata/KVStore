package com.bigwavedata.KVStore;

import java.util.ArrayList;
import java.util.List;

public class KVList {
		List<KV> list;
		String listName;
		
		public KVList(String name) {
			listName = name;
			list = new ArrayList<KV>();
		}
		
		public KVList(String name, int size) {
			listName = name;
			list = new ArrayList<KV>(size);
		}
		
		
		public boolean addKV(KV input) {
			return list.add(input);
		}
		
		public String getName() {
			return listName;
		}
		
		public boolean removeKV(long key) {
			// First try with iterating
			for(KV myKV : list) {
				if(myKV.getKey() == key) {
					list.remove(myKV);
					return true;
				}
			}
			return false;
		}
}
