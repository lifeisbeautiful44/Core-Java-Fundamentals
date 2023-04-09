package com.srijansil.inheritance;

public class Employee {

	int id;
	String name;
	String dept;
	long salary;

	public Employee(int id, String name, String dept, long salary) {
		System.out.println(" Inside Employee Constructor");
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	protected void work() {
		System.out.println("Commom work to be done.");
	}

}
