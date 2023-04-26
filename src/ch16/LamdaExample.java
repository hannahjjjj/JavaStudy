package ch16;

public class LamdaExample {
	public static void main(String[] args) {
//		doIt(doThat); 이렇게 사용하고 싶다--> 람다식 사
		action(new Calculable() {
			
			@Override
			public void calcuable(int x, int y) {
				System.out.println(x+y);
					//이렇게 해야함 하지만 코드가 너무 더러움.
			}
		});
		action((x,y)->{System.out.println(x+y);}); //람다식
	}
	
	public static void action(Calculable c) {
		c.calcuable(10, 20); //이걸 실행하려면 calculable을 실행할 클래스가 있어야함
	}
	public static void doIt() {
		System.out.println("doIt");
	}
	public static void doThat() {
		System.out.println("doThat");
	}
}
