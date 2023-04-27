package ch17.sec10;

import java.util.ArrayList;
import java.util.List;

import ch17.sec09.Student;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> sl = new ArrayList<>();
		sl.add(new Student("홍길동",30));
		sl.add(new Student("신용권",10));
		sl.add(new Student("유미선",20));
		
		sl.stream()
			.sorted((s1,s2)->Integer.compare(s1.getScore(), s2.getScore()))
			.forEach(s->System.out.println(s.getName()+":"+s.getScore()));
		System.out.println();
		sl.stream()
			.sorted((s1,s2)->Integer.compare(s2.getScore(), s1.getScore()))
			.forEach(s->System.out.println(s.getName()+":"+s.getScore()));
	}
}
