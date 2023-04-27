package ch17.sec07;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<Student> sl = new ArrayList<>();
		sl.add(new Student("홍길동",85));
		sl.add(new Student("홍길동",92));
		sl.add(new Student("홍길동",87));
		
		//Student 를 score 스트림으로 변환
		sl.stream()
			.mapToInt(s -> s.getScore())
			.forEach(score -> System.out.println(score));
	}
}
