package com.collection_based.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> ha= new TreeMap<>();
		ha.put(01, "Sanket");
		ha.put(05, "sam");
		ha.put(02, "Ram");
		ha.put(03, "dhanu");
		ha.put(06, "Ajit");
		ha.put(04, "rohan");
		System.out.println(ha);
		for(Integer key:ha.keySet()) {
			System.out.println(key);
		}
		for(String vv:ha.values()) {
			System.out.println(vv);
		}
		for(Map.Entry<Integer,String>hh:ha.entrySet()) {
			System.out.println(hh);
		}
		
	}

}
