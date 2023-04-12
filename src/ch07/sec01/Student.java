package ch07.sec01;

public class Student extends Person {
	public int studentNo;

	//생성자 선언
	public Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
	
	
}
