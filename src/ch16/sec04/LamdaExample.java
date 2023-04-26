package ch16.sec04;

public class LamdaExample {
	public static void main(String[] args) {
		Person p = new Person();
		
		//실행문이 두개이상 일 경우
		p.action((x,y)->{
			double result = x+y;
			return result;
		});
		
		//리턴문이 하나만 있을경우(연산식)
		p.action((x,y)->(x+y));
		
		//리턴문이 하나만 있을 경우(메소드 호출)
		p.action((x,y) -> sum(x,y));
		
	}
	public static double sum(double x, double y) {
		return(x+y);
	}
}
