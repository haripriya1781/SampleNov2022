package org.sample;

public class Employee {
	public Employee() {
		this(45689);
		System.out.println("Employee Name is Hari");
	}
	public Employee(int id) {
		this(988436320l, 60000.00f);
		System.out.println("Employee ID is " +id);
	}
	public Employee(long phNO , float salary) {
		System.out.println("Employee phone no is " +phNO);
		System.out.println("Employee salary is "  +salary);
	}
	
}

