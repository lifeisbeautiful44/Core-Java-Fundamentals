package serailization;

import java.io.Serializable;

public class Employee implements Serializable {

	int id;
	String name;
	int salary;
	transient int ssn;

	public Employee(int id, String name, int salary, int ssn) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}

}
