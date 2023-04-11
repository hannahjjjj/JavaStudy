package ch06.sec04;

public class Pen {
	String color;// ="black";
	
	// 기본생성자 : 인자가 없는 생성자
	// 생성자가 따로 없으면 컴파일러가 추가해줌
	//생성자 중복 -> 이름이 같은 생성자가 여러개 선언함 -> 매개변수는 다르게 선언해야함
	public Pen() {
		//color="black";
		this("black");//현재 클래스내의 다른 생성자를 호출
	} // 인자 없는 생성자

	public Pen(String color) {
		this.color = color;
	}
}
