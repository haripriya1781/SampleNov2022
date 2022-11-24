package org.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "Psql");
		m.put(40, "Hadoop");
		System.out.println(m);
		Set<Entry<Integer, String>> ent = m.entrySet();
		System.out.println(ent);
		for (Entry<Integer, String> itv : ent) {
			System.out.println(itv);
			
		}
		
	}

}
