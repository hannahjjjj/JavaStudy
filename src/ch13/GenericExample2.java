package ch13;

public class GenericExample2 {
	public static void main(String[] args) {
		Product<TV, String> p1 = new Product<>();
		
		//Setter 매개값은 반드시 TV와 String을 제공
		p1.setKind(new TV());
		p1.setModel("스마트 TV");
		
		//Getter 리턴값은 TV와 String 이됨
		TV tv = p1.getKind();
		String tvModel = p1.getModel();
		
		Product<Car, String> p2 = new Product<>();
		p2.setKind(new Car());
		p2.setModel("SUV 자동차");
		
		Car c = p2.getKind();
		String carModel = p2.getModel();
		
		
	}
}
