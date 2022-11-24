package org.sample;


import java.util.LinkedList;
import java.util.List;

public class SimpleTask {
public static void main(String[] args) {

	List<Integer> l = new LinkedList<Integer>();
	

l.add(100);
l.add(200);
l.add(300);
l.add(400);
l.add(500);
l.add(600);
l.add(700);


int s =  l.size();
System.out.println("The size of the array is " + s);
}
}
