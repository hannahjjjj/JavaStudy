package ch17.sec01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동",10),
				new Student("신용권",20),
				new Student("유미선",30)
				);
		
		//방법1
//		Stream<Student> ss = list.stream();
//		IntStream ss2 = ss.mapToInt(student -> student.getScore());
//		double avg = ss2.average().getAsDouble();
		
		//방법2
		double avg = list.stream()
					.mapToInt(student -> student.getScore())
					.average()
					.getAsDouble();
		System.out.println("평균 점수"+avg);
	}
}
