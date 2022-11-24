package org.sample;

public class Company extends Employee {
	public Company() {
		this("Chennai");
		System.out.println("Company name is TCS");
	
	}
	public Company(String addr) {
	
		System.out.println("Company address is " +addr);
	
	}
	public static void main(String[] args) {
		Company c = new Company();
	
		
	}

}
