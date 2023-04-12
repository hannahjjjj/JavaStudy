package ch07;

import java.util.Date;

public class Manager extends Employee {
	private String department;

	public Manager(String name, double salary, Date birthDate, String department) {
		super(name, salary, birthDate);
		this.department = department;
		System.out.println("Manager(name,sal,dob,dept)");
	}
	
	public Manager(String name, String department) {
		super(name);
		this.department = department;
		System.out.println("Manager(name,dept)");
	}
	public Manager(String department) {
		this(null, department);  //인수가 두개인 생성자
		this.department = department;
		System.out.println("Manager(dept)");
	}
	
	

}
