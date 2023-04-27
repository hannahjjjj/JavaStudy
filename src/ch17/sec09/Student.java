package ch17.sec09;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student implements Comparable<Student> {
	private String name;
	private int score;
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}
	
	

}
