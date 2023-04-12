package ch07;

public class CarExample {

	public static void main(String[] args) {
		//car 객체 생성
		Car c1 = new Car();
		//타이어 객체생성
		c1.t = new Tire();
		c1.run();
		//한국타이어 객체생성
		c1.t = new HankookTire();
		c1.run();
		//금호타이어 객체생성
		c1.t = new KumhoTire();
		c1.run();

	}

}
