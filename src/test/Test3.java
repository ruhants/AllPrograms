package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
	public static void main(String[] args) {
		Map<String,Integer> map  =  new HashMap<>();
		map.put("Rohan", 1000);
		map.put("arun", 19000);
		map.put("Mohan", 7000);
		map.put("Vinod", 10000);
		map.put("rahagav", 11000);
		
		map.put("mithun", 21000);
		
		List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
		entries.sort((entry1,entry2)->entry2.getValue().compareTo(entry1.getValue()));
		Map.Entry<String, Integer> entry = entries.get(2);
		System.out.println(entry);
		
	}

}
