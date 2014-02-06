package com.bigwavedata.KVStore;

public class KV {
		long key;
		String value;
		
		public KV(long keyInput,String valueInput)  {
			key = keyInput;
			value = valueInput;
		}
		
		public KV() {
			key = -1;
			value = null;
		}
		
		public void setKey(long input) {
			key = input;
		}
		public void setValue(String input) {
			value = input;
		}
		public long getKey() {
			return key;
		}
		public String getValue() {
			return value;
		}
}
