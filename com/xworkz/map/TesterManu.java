package com.xworkz.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class TesterManu {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>((a, b) -> b.compareTo(a));
   map.put("Jai ho", "Vijay Prakash");
   map.put("humdard", "Arjith");
   map.put("Bewafa", "Jubin Nautiyal");
   map.put("barish", "payal dev");
   map.put("Jai ho", "Vijay Prakash");
   
   Set<Entry<String, String>> entrySet = map.entrySet();
	entrySet.forEach(entry -> System.out.println("Song is : " + entry.getKey() + " Singer is:" + entry.getValue()));
	
	map.forEach((k, v) -> System.out.println(k + " " + v));
    
	Properties properties = new Properties();
	properties.setProperty("Name", "Email");
	properties.getProperty("Name");

   
   

}
}