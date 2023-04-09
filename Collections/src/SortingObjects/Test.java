package SortingObjects;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Employee> employeeSet = new TreeSet<Employee>(new EmployeeNameComparator());
		employeeSet.add(new Employee(3, "Sabin"));

		employeeSet.add(new Employee(2, "Kabin"));

		employeeSet.add(new Employee(4, "AAkash"));
		employeeSet.add(new Employee(1, "Srijansil"));

		for (Employee employee : employeeSet) {
			System.out.println(employee.id + " = " + employee.name);
		}

	}

}
