package org.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeEncap extends EmployeeDetails {
	public static void main(String[] args) {
		EmployeeEncap e1 = new EmployeeEncap();
		e1.setEmpid(1000);
		e1.setAddress("chennai");
		e1.setPhno(9884363210l);
		int i = e1.getEmpid();
		System.out.println(i);
		System.out.println(e1.getAddress());
		System.out.println(e1.getPhno());
		EmployeeEncap e2 = new EmployeeEncap();
		e2.setEmpid(1001);
		e2.setAddress("bangalore");
		e2.setPhno(9940322649l);
		System.out.println(e2.getEmpid());
		System.out.println(e2.getAddress());
		System.out.println(e2.getPhno());

		System.out.println("\nUser defined List: ");
		List<EmployeeEncap> l = new LinkedList<EmployeeEncap>();
		l.add(e1);
		l.add(e2);
		for (int j = 0; j < l.size(); j++) {
			System.out.println(l.get(j).getEmpid());
			System.out.println(l.get(j).getAddress());
			System.out.println(l.get(j).getPhno());
		}
		System.out.println("\nUser defined Set :");
		Set<EmployeeEncap> s = new LinkedHashSet<>();
		s.add(e1);
		s.add(e2);
		for (EmployeeEncap it : s) {
			System.out.println(it.getEmpid());
			System.out.println(it.getAddress());
			System.out.println(it.getPhno());
			
		}
		System.out.println("\nUser defined Map : ");
		Map<Integer, EmployeeEncap> m = new LinkedHashMap<Integer, EmployeeEncap>();
	
		m.put(1, e1);
		m.put(2, e2);
		Set<Entry<Integer, EmployeeEncap>> ent = m.entrySet();
		for (Entry<Integer, EmployeeEncap> e : ent) {
			System.out.println("Employee No : " +e.getKey());
			System.out.println(e.getValue().getEmpid());
			System.out.println(e.getValue().getAddress());
			System.out.println(e.getValue().getPhno());
		}

	}

}
