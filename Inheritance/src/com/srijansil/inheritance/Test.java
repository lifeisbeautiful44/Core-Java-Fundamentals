package com.srijansil.inheritance;

public class Test {

	public static void main(String[] args) {
		String[] projects = { "Online Jhapa", "Blog System" };
		Manager manager = new Manager(1, "Indira", "Manager", 1250l, projects);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		manager.work();

		Developer developer = new Developer(2, "Srijansil", "Developer", 10000l, "Java Developer");
		System.out.println(developer.name);
		System.out.println(developer.dept);
		developer.work();

		String[] tools = { "Debug Finder", "Console", "AWS" };
		Tester tester = new Tester(3, "Teresa", "Tester", 15022l, tools);
		System.out.println(tester.name);
		System.out.println(tester.dept);
		tester.work();
//		
//		Employee emp = new Manager(2,"as","asda",15l,projects);
//		emp.work();

	}

}
