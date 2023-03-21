package com.yulim.day_0320.Application7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	private static final long serialVersionUID = 7228066544370237062L;
	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Department implements Serializable {
	private static final long serialVersionUID = 9152309756498219682L;
	String name;
	Employee leader;

	public Department(String name, Employee leader) {
		this.name = name;
		this.leader = leader;
	}
}

public class Problem7_2 {
	public static void main(String[] args) throws IOException {
		Employee employee = new Employee("홍길동", 41);
		Department department = new Department("총무부", employee);

		FileOutputStream fos = new FileOutputStream("company.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(department);
		oos.flush();
		oos.close();
	}
}
