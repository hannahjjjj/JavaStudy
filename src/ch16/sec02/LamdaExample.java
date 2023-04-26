package ch16.sec02;

public class LamdaExample {
	public static void main(String[] args) {
		Person p = new Person();
		//두개이상일 때 중괄호 필수
		p.action(()->{
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		});
		
		//한개일때는 중괄호 필요 X
		p.action(()->System.out.println("퇴근을합니다"));
	}
}
