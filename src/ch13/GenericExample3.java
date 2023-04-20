package ch13;

public class GenericExample3 {
	public static void main(String[] args) {
		HomeAgency ha = new HomeAgency();
		Home h = ha.rent();
		h.turnOnLight();
		
		CarAgency ca = new CarAgency();
		Car2 c = ca.rent();
		c.run();
	}
}
