package com.collection_based;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Country_Ex {
	public ArrayList<String> mh(){
		ArrayList<String>MH=new ArrayList<>();
		MH.add("Kolhapur");
		MH.add("Sangali");
		MH.add("pune");
		MH.add("Nagapur");
		return MH;
	}
	public ArrayList<String>ka(){
		ArrayList<String>KA=new ArrayList<>();
		KA.add("hubaali");
		KA.add("belagav");
		KA.add("bengalur");
		KA.add("Dharawad");
		return KA;
	}
	public ArrayList<String> kl(){
		ArrayList<String>KL=new ArrayList<>();
		KL.add("kannur");
		KL.add("kollam");
		return KL;
		
	}
	
	public HashMap<String,ArrayList<String>> state(){
		HashMap<String,ArrayList<String>> State= new HashMap<>();
		State.put("Maharastra",mh());
		State.put("Karanatak", ka());
		State.put("Kerala", kl());
		return State;
	}
	public 	LinkedHashMap<String,HashMap<String,ArrayList<String>>>COUNTRY(){
		LinkedHashMap<String,HashMap<String,ArrayList<String>>> country=new LinkedHashMap<>();
		country.put("INDIA", state());
		return country;
	}
	public static void main(String[] args) {
		Country_Ex AA = new Country_Ex();
		ArrayList<String>yy=AA.ka();
		System.out.println(yy);
		ArrayList<String>xx=AA.mh();
		System.out.println(xx);
		
		HashMap<String,ArrayList<String>>dd=AA.state();
		for(Entry<String, ArrayList<String>> ff:dd.entrySet() ) {
			System.out.println(ff);
		}
		
		LinkedHashMap<String,HashMap<String,ArrayList<String>>>ww=AA.COUNTRY();
	//	System.out.println(ww);
		
		for(Entry<String, HashMap<String, ArrayList<String>>> ss:ww.entrySet()) {
			System.out.println(ss);
		}
		
		
		
		
//		ArrayList<String>KL=new ArrayList<>();
//		KL.add("kannur");
//		KL.add("kollam");
		
//		for(String ww:MH) {
//			System.out.println(ww);
//		}
//		
//		for(String ww:KA) {
//			System.out.println(ww);
//		}
//		
//		for(String ww:KL) {
//			System.out.println(ww);
//		}
		
		
		
//		for(Map.Entry<String, ArrayList<String>>ww:State.entrySet()) {
//			System.out.println(ww);
//		}
//		
//		LinkedHashMap<String,HashMap<String,ArrayList<String>>> country=new LinkedHashMap<>();
//		country.put("INDIA", State);
//		
//		for(Map.Entry<String,HashMap<String,ArrayList<String>>>ww:country.entrySet()) {
//			System.out.println(ww);
//		}
	}

}
