package ch15.sec04;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("JSP");
		set.add("JAVA");
		set.add("SPRING");
		
		int size = set.size();
		System.out.println("총 객체수:" + size);
	}
}
