package ch07;

public class DriverExample {

	public static void main(String[] args) {
		Driver d = new Driver();
		
		//매개값으로 버스 객체를 제공하고 driver()메소드 호출
		 Bus b = new Bus();
		 d.driver(b);
		 
		 Taxi t = new Taxi();
		 d.driver(t);

	}

}
