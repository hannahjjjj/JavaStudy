package ch07.sec01;

public class SmartPhone extends Phone {
	//생성자 선언 (안해주면 클래스명에 오류 남 ) ==> 이유는 부모 클래스에서 선언 안해줬기 때문
	SmartPhone(String owner){
		super(owner);
	}
	
	//메서드 선언
	void internetSearch() {
		System.out.println("인터넷 검사를 합니다.");
	}

}
