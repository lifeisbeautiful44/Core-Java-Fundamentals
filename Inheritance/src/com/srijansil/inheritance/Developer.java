package com.srijansil.inheritance;

public class Developer extends Employee {

	String technologies;

	public Developer(int id, String name, String dept, long salary, String technologies) {
		super(id, name, dept, salary);
		System.out.println(" Inside Developer Constructor");
		this.technologies = technologies;

	}

	@Override
	protected void work() {
		// TODO Auto-generated method stub
		super.work();
		System.out.println("Developer develops by using: " + technologies);
	}

}
