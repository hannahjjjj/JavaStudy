package ch06.sec13;

public class Singleton {
	 //외부에서singleton클래스로 못만듬
		private static Singleton instance = new Singleton(); //인스턴스변수 --> 객체 만들어야 참조해야함 --> 하지만 객체 못만듬 private이라 --> private static 을 붙여줌
		private Singleton () {}
		public static Singleton getInstance() {
			return instance;
	}
	
}
