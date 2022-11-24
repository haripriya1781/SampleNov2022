package org.simple;

public class CountingString {
	public static void main(String[] args) {
		String s ="shreevarshni";
		int count =0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 's') {
				count++;
			}
		}
		System.out.println(count);
	}
	

}
