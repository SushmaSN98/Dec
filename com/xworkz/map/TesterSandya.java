package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesterSandya {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		String name="kushi";
		int age=18;
		
		map.put(name,age);
		map.put("kunal",21);
		map.put("sneha",23);
		map.put("niveditha",21);
		map.put(null,null);
		map.put("mandara",23);
		
		Set<String> keys=map.keySet();
		
		keys.forEach(p->{Integer s=map.get(p);
			System.out.println(p +"age is "+s);
			});
		
		Collection<Integer> values=map.values();
		
		values.forEach(n->System.out.println(n));
		
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		System.out.println(entrySet.size());
		entrySet.forEach(m->{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		});
		
		
		

	}

}
