package ch15.sec04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class HashSetExample3 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String elm = it.next();
			System.out.println(elm);
			if(elm.equals("JSP")) {
				it.remove();
			}
		}
		System.out.println();
		set.remove("Spring");
		
		for(String elm : set) {
			System.out.println(elm);
		}
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("database.properties"));
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(prop.getProperty("driver"));
		System.out.println(prop.getProperty("admin"));
	}
}
