package com.collection_based;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IPL2025 {
//	ArrayList<String> rcb(){
//		ArrayList<String>RCB = new ArrayList<>(); 
//		RCB.add("virat");
//		RCB.add("padical");
//		RCB.add("rajat");
//		
//		return RCB;
//	}
//	
//	ArrayList<String> csk(){
//		ArrayList<String>CSK = new ArrayList<>(); 
//		CSK.add("MSD");
//		CSK.add("Ruturaj");
//		CSK.add("Sirjadeja");
//		System.out.println("CSK"+CSK);
//		return CSK;
//	}
//	ArrayList<String> mi(){
//		ArrayList<String>MI = new ArrayList<>(); 
//		MI.add("Rohit");
//		MI.add("bumarh");
//		MI.add("haradik");
//		return MI;
//	}
	
	public static void main(String[] args) {
		ArrayList<String>RCB = new ArrayList<>(); 
		RCB.add("virat");
		RCB.add("padical");
		RCB.add("rajat");
		
		ArrayList<String>CSK = new ArrayList<>(); 
		CSK.add("MSD");
		CSK.add("Ruturaj");
		CSK.add("Sirjadeja");
		
		ArrayList<String>MI = new ArrayList<>(); 
		MI.add("Rohit");
		MI.add("bumarh");
		MI.add("haradik");
		
		HashMap<String,ArrayList<String>> Ipl2025= new HashMap<>();
		Ipl2025.put("RCB",RCB);
		Ipl2025.put("CSK",CSK);
		Ipl2025.put("MI",MI);		
		
//		IPL2025 data =new IPL2025();
//		data.csk();
		
		
		
		
		
		
//		System.out.println(RCB);
//		System.out.println(CSK);
//		System.out.println(MI);
		
		
		for(Map.Entry<String,ArrayList<String>>ww:Ipl2025.entrySet() ){
			System.out.println(ww);
		}
	}

}
