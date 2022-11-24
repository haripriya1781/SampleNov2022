package org.sample;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
public static void main(String[] args) {
Set<Integer> s = new HashSet<Integer>();
s.add(10);
s.add(20);
s.add(30);
s.add(40);
s.add(50);
s.add(60);
s.add(70);
s.add(80);
s.add(90);
s.add(10);
s.add(20);
System.out.println(s);
System.out.println(s.size());
for (Integer i : s) {
	System.out.println(i);
}
}
}
