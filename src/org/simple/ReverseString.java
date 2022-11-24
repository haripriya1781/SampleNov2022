package org.simple;

import java.util.LinkedList;
import java.util.List;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "HARI";
		
		//StringBuilder s = new StringBuilder("HARI");
		for (int i = s.length()-1; i >=0; i--) {
		char c = s.charAt(i);
			//System.out.println(s.reverse());
			System.out.println(c);
		}
	}
}


