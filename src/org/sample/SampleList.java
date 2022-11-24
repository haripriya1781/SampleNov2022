package org.sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SampleList {
	public static void main(String[] args) {
Map<String, Integer> m = new HashMap<String, Integer>();
m.put("java", 10);
m.put("selenium", 20);
m.put("python", 50);
m.put("sql", 60);
m.put("oracle", 40);
Set<Entry<String, Integer>> itr = m.entrySet();
for (Entry<String, Integer> i : itr) {
	//System.out.println(i.getKey());
	System.out.println( i.getValue());
	//System.out.println(i);
}		
		
	}

}
