package ch12.test;

import java.util.HashSet;

public class StudentExample {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		System.out.println(hs.add(new Student("1")));
		System.out.println(hs.add(new Student("1")));
		System.out.println(hs.add(new Student("2")));
		System.out.println(hs.size());
	}
}
