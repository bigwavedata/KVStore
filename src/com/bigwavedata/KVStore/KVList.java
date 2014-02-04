package com.bigwavedata.KVStore;

import java.util.List;

public class KVList {
		List<KV> list;
		String listname;
		
		public boolean addKV(KV input) {
			return list.add(input);
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
