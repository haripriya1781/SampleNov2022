package org.sample;

public class Palidrome {
	public static void main(String[] args) {
		
		String s = "Haripriya";
		String r = "";
		for (int i = s.length()-1; i>=0; i--) {
			r= r+s.charAt(i);
			
		}
		if (s.equals(r)) {
			System.out.println("The string is palidrome ");
		}
		else {
			System.out.println("The string is not a palidrome");
		}
			}
		
	}


