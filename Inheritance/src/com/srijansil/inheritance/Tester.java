package com.srijansil.inheritance;

public class Tester extends Employee {

	String[] tools;

	public Tester(int id, String name, String dept, long salary, String[] tools) {
		super(id, name, dept, salary);
		System.out.println(" Inside Tester Constructor");
		this.tools = tools;

	}

	@Override
	protected void work() {
		// TODO Auto-generated method stub
		super.work();

		System.out.println("Tester is testing by: ");
		for (int i = 0; i < tools.length; i++) {
			System.out.println(tools[i]);
		}

	}

}
