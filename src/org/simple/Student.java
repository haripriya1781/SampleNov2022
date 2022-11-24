package org.simple;

public class Student {
public static void main(String[] args) throws StudentNotFoundException {
	String studid = "123";
	if (studid.startsWith("1001")) {
		System.out.println("Valid Student ID");
		
	} 
	else {

	throw new StudentNotFoundException();
} 

	


}
}
